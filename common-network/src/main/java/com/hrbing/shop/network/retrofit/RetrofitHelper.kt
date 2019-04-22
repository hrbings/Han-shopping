package com.hrbing.shop.network.retrofit

import com.hrbing.shop.network.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @author RuiBing
 */
class RetrofitHelper private constructor(val retrofit: Retrofit) {

    companion object {

        @Volatile
        private var instance: RetrofitHelper? = null

        /**
         * the method to provide a single instance
         *
         * @sample RetrofitHelper
         */
        fun getInstance(): RetrofitHelper {
            return instance ?: synchronized(this) {
                instance ?: RetrofitHelper(getRetrofit()).also { instance = it }
            }
        }

        /**
         * @return the Retrofit in order to implement single instance
         *
         * @see Retrofit
         */
        private fun getRetrofit(): Retrofit {
            return getRetrofitBuilder().build()
        }

        /**
         * @return the Retrofit.Builder in order to implement single instance
         *
         * @see Retrofit.Builder
         * @see RxJava2CallAdapterFactory add RxJava callback with retrofit
         * @see GsonConverterFactory handle responseBody from GetWay, Can be customized request and response converter
         */
        private fun getRetrofitBuilder(): Retrofit.Builder {
            return Retrofit
                    .Builder()
                    .baseUrl(BuildConfig.GW_BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())

        }
    }
}
