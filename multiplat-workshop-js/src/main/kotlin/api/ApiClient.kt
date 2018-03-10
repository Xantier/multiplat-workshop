package api

import kotlinx.coroutines.experimental.await
import kotlinx.coroutines.experimental.launch
import org.w3c.fetch.RequestInit
import kotlin.browser.window
import kotlin.js.json

const val CORS_ANYWHERE = "https://cors-anywhere.herokuapp.com/"

actual class ApiClient {
    actual fun fetchPhotos(): String {
        launch {
            val response = window.fetch(CORS_ANYWHERE + PHOTO_URL, object : RequestInit {
                override var headers: dynamic = json(
                    "Accept" to "application/json",
                    "Content-Type" to "application/json")
            }).await()
            val jsonResponse = response.text().await()
            println(jsonResponse)
        }
        return "null"
    }
}