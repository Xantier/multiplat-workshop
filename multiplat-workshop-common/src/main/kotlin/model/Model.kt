package model

data class Photo(
    val photo_album: PhotoAlbum,
    val highres_link: String,
    val photo_link: String,
    val member: Member
)

data class Member(
    val name: String
)

data class PhotoAlbum(
    val event: Event = Event("empty", 123)
)

data class Event(
    val name: String,
    val id: Int
)