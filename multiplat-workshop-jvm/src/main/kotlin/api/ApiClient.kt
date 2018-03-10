package api

import kotlinx.serialization.json.JSON
import model.photoListSerializer
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
        val photoList = JSON.nonstrict.parse(photoListSerializer, returnable)
        println(photoList)
        return returnable
    }
}