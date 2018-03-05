package common

import api.ApiClient

actual class PhotoHandler {
    actual fun getApiClient(): ApiClient {
        return ApiClient()
    }
}