package com.hrbing.shop.network.retrofit

import com.hrbing.shop.network.BuildConfig
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitHelper private constructor(val retrofit: Retrofit) {

    companion object {

        @Volatile
        private var instance: RetrofitHelper? = null

        fun getInstance(): RetrofitHelper {
            return instance ?: synchronized(this) {
                instance ?: RetrofitHelper(getRetrofit()).also { instance = it }
            }
        }

        private fun getRetrofit(): Retrofit {
            return getRetrofitBuilder().build()
        }

        private fun getRetrofitBuilder(): Retrofit.Builder {
            return Retrofit
                    .Builder()
                    .baseUrl(BuildConfig.GW_BASE_URL)
                    .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                    .addConverterFactory(GsonConverterFactory.create())

        }
    }
}
