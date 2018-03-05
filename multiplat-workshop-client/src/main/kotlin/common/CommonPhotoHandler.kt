package common

import api.ApiClient

expect class PhotoHandler {
    fun getApiClient() : ApiClient
}