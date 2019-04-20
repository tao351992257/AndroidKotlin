package com.example.kotlin.net

import com.example.kotlin.bean.WeatherBean
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Path

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
interface ApiService {
    //    city=110101
    @GET("weatherInfo?key=f4181ce5e9f1faf6c19cb6f04a2a3cab&{city}")
    fun getData(@Path("city") city: String):Observable<String>
}