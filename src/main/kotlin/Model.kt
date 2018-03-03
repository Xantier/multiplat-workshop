
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.list
import kotlinx.serialization.serializer

@Serializable
data class Photo(
    val photo_album: PhotoAlbum,
    val highres_link: String,
    val photo_link: String,
    val member: Member
)

@Serializable
data class Member(
    val name: String
)

@Serializable
data class PhotoAlbum(
    val event: Event = Event("empty", 123)
)

@Serializable
data class Event(
    val name: String,
    val id: Int
)

val photoListSerializer: KSerializer<List<Photo>> = Photo::class.serializer().list
