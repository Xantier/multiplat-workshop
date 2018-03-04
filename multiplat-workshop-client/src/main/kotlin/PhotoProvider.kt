import kotlinx.serialization.json.JSON

class PhotoProvider {
    suspend fun fetchPhotos(photoHandler: PhotoHandler): List<Photo> {
        val client = photoHandler.getApiClient()
        val photos = client.fetchPhotos()
        return JSON.nonstrict.parse(photoListSerializer, photos)
    }
}