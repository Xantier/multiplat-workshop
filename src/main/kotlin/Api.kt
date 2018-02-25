
expect class ApiClient{
    fun fetchPhotos(): List<Photo>
}

const val PHOTO_URL = "https://api.meetup.com"