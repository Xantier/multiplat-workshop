class PhotoProvider {
    suspend fun fetchAndDisplayPhotos(photoDisplayer: CommonPhotoHandler) {
        val client = CommonPhotoHandler.getApiClient()
        val photos = client.fetchPhotos()
        println(photos)
    }
}