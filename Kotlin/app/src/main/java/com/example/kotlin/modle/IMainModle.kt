package com.example.kotlin.modle

import com.example.kotlin.bean.WeatherBean
import io.reactivex.Observable
import io.reactivex.Observer

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
interface IMainModle {
    fun getDate(city:String): Observable<String>
}