import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.img

interface PhotoProps : RProps {
    var photos: List<Photo>
}

class PhotoComponent : RComponent<PhotoProps, RState>() {
    override fun RBuilder.render() {
        props.photos.forEach {
            div {
                img {
                    attrs.alt = it.member.name
                    attrs.src = it.photo_link
                    attrs.height = "400"
                    attrs.width = "400"
                }
            }
        }
    }
}

fun RBuilder.welcome(photos: List<Photo> = listOf()) = child(PhotoComponent::class) {
    attrs.photos = photos
}