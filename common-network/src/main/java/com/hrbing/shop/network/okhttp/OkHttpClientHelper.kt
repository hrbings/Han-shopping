package com.hrbing.shop.network.okhttp

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

/**
 * @author ...
 *
 * the OkHttpClientHelper provides a singleton object for global use
 */
class OkHttpClientHelper private constructor(val okHttpClient:OkHttpClient) {

    companion object {

        @Volatile
        private var instance: OkHttpClientHelper? = null

        /**
         * the method to provide single instance
         * @sample OkHttpClientHelper
         */
        fun getInstance(property: String) = instance ?: synchronized(this) {
            instance ?: OkHttpClientHelper(getOkHttpClient()).also { instance = it }
        }

        /**
         * @return the OkHttpClient in order to implement single instance
         *
         * @see OkHttpClient
         */
        private fun getOkHttpClient(): OkHttpClient{
            return getOkHttpBuilder().build()
        }

        /**
         * @return the OkHttpClient.Builder in order to implement single instance
         *
         * @see OkHttpClient.Builder
         */
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
