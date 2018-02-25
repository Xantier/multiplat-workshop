import org.w3c.fetch.RequestCredentials
import org.w3c.fetch.RequestInit
import kotlin.browser.window
import kotlin.js.json

actual class ApiClient {
    actual fun fetchPhotos(): List<Photo> {
        window.fetch(PHOTO_URL, object : RequestInit {
            override var credentials: RequestCredentials? = "same-origin".asDynamic()
            override var headers: dynamic = json(
                "Accept" to "application/json",
                "Content-Type" to "application/json")
        }).then { response ->
            println(response)
        }
        return emptyList()
    }
}