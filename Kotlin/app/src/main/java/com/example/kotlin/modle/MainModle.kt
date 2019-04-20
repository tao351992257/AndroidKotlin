package com.example.kotlin.modle

import com.example.kotlin.bean.WeatherBean
import com.example.kotlin.net.ApiRetrofit
import io.reactivex.Observable

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
class MainModle : IMainModle {
    override fun getDate(city: String): Observable<String> {
        return ApiRetrofit.getInstance().getWeather(city)
    }

}