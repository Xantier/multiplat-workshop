import kotlinx.coroutines.experimental.launch
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    launch {
        val photos = photoProvider.fetchPhotos(PhotoHandler())
        render(document.getElementById("root")) {
            welcome(photos)
        }
    }
}