package api

import kotlinx.io.IOException
import okhttp3.*
import kotlin.coroutines.experimental.suspendCoroutine

actual class ApiClient {
    actual suspend fun fetchPhotos(): String {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(PHOTO_URL)
            .build()
        val response = client.newCall(request).await()
        return response.body()?.string() ?: ""
    }
}


suspend fun Call.await(): Response {
    return suspendCoroutine { continuation ->
        enqueue(object : Callback {
            override fun onResponse(call: Call, response: Response) {
                continuation.resume(response)
            }

            override fun onFailure(call: Call, e: IOException) {
                // Don't bother with resuming the continuation if it is already cancelled.
                continuation.resumeWithException(e)
            }
        })
    }
}