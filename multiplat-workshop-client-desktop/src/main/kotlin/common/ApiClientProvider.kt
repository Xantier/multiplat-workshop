package common

import api.ApiClient

actual class ApiClientProvider {
    actual fun getApiClient(): ApiClient {
        return ApiClient()
    }
}