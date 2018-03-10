package api

import okhttp3.OkHttpClient
import okhttp3.Request

actual class ApiClient {
    actual fun fetchPhotos(): String {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url(PHOTO_URL)
            .build()
        val response = client.newCall(request).execute()
        val returnable = response.body()?.string() ?: ""
        println(returnable)
        return returnable
    }
}