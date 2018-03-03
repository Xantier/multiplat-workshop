import kotlinx.serialization.json.JSON

class PhotoProvider {
    suspend fun fetchAndDisplayPhotos(photoHandler: PhotoHandler): List<Photo> {
        val client = photoHandler.getApiClient()
        val photos = client.fetchPhotos()
        return JSON.nonstrict.parse(photoListSerializer, photos)
    }
}