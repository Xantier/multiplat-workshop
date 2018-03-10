import common.ApiClientProvider
import kotlinx.serialization.json.JSON
import model.photoListSerializer

class PhotoProvider{
    suspend fun fetchPhotos(apiClientProvider: ApiClientProvider){
        val apiClient = apiClientProvider.getApiClient()
        val photoJson = apiClient.fetchPhotos()
        val photoList = JSON.nonstrict.parse(photoListSerializer, photoJson)
        println(photoList)
    }
}