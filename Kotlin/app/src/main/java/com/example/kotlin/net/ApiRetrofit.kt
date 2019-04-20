package com.example.kotlin.net

import android.content.Context
import com.example.kotlin.bean.WeatherBean
import io.reactivex.Observable
import io.reactivex.Observer
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
class ApiRetrofit : BaseRetrofit() {
    private val mApiService: ApiService by lazy {
        Retrofit.Builder().baseUrl(Api.BASE_URL)
            .client(getOkHttpClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    companion object {
        private var apiRetrofit: ApiRetrofit? = null
        fun getInstance(): ApiRetrofit {
            if (apiRetrofit == null) {
                synchronized(ApiRetrofit::class) {
                    apiRetrofit = ApiRetrofit()
                }
            }
            return apiRetrofit!!
        }
    }

    fun getWeather(city:String):Observable<String>{
        return mApiService.getData(city)
    }
}