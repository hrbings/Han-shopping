package com.hrbing.shop.network.okhttp

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class OkHttpClientHelper private constructor(val okHttpClient:OkHttpClient) {

    companion object {

        @Volatile
        private var instance: OkHttpClientHelper? = null

        fun getInstance(property: String) = instance ?: synchronized(this) {
            instance ?: OkHttpClientHelper(getOkHttpClient()).also { instance = it }
        }

        private fun getOkHttpClient(): OkHttpClient{
            return getOkHttpBuilder().build()
        }

        private fun getOkHttpBuilder(): OkHttpClient.Builder {
            return OkHttpClient
                    .Builder()
                    .addInterceptor(HttpLoggingInterceptor())
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.SECONDS)
                    .writeTimeout(5, TimeUnit.SECONDS)
        }
    }
}
