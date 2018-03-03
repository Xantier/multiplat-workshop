import kotlinx.coroutines.experimental.Deferred
import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.launch
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.img
import react.dom.render
import kotlin.browser.document

fun main(args: Array<String>) {
    val photoProvider = PhotoProvider()
    val deferred = async {
        photoProvider.fetchAndDisplayPhotos(PhotoHandler())
    }
    launch {
        val photos = unwrap(deferred)
        render(document.getElementById("root")) {
            welcome(photos)
        }
    }

}

suspend fun unwrap(it: Deferred<List<Photo>>): List<Photo> {
    return it.await()
}

interface PhotoProps : RProps {
    var photos: List<Photo>
}

class PhotoComponent : RComponent<PhotoProps, RState>() {
    override fun RBuilder.render() {
        props.photos.forEach {
            div {
                img(it.member.name, it.highres_link) {

                }
            }
        }
    }
}

fun RBuilder.welcome(photos: List<Photo> = listOf()) = child(PhotoComponent::class) {
    attrs.photos = photos
}