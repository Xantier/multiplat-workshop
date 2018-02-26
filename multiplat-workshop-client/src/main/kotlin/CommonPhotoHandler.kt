expect object CommonPhotoHandler {
    fun getApiClient() : ApiClient
    fun render(photos: List<Photo>)
}