import common.ApiClientProvider
import common.PhotoRenderer
import kotlinx.serialization.json.JSON
import model.photoListSerializer

class PhotoProvider{
    suspend fun fetchAndRenderPhotos(apiClientProvider: ApiClientProvider){
        val apiClient = apiClientProvider.getApiClient()
        val photoJson = apiClient.fetchPhotos()
        val photoList = JSON.nonstrict.parse(photoListSerializer, photoJson)
        PhotoRenderer.render(photoList)
    }
}