import okhttp3.OkHttpClient
import okhttp3.Request

actual class ApiClient {
    actual fun fetchPhotos(): List<Photo> {
        val client = OkHttpClient()

        val request = Request.Builder()
            .url(PHOTO_URL)
            .build()

        val response = client.newCall(request).execute()
        println(response.body()?.string())
        return emptyList()
    }
}