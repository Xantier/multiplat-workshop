package common

import api.ApiClient

expect class ApiClientProvider{
    fun getApiClient(): ApiClient
}