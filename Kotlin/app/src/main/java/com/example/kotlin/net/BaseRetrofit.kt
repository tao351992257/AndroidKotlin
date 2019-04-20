package com.example.kotlin.net

import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
open class BaseRetrofit {
    private val mOkHttpClient: OkHttpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)//连接超时设置
            .writeTimeout(30, TimeUnit.SECONDS)//写入超时设置，
            .readTimeout(30, TimeUnit.SECONDS)//读取超时设置
            .build()
    }

    fun getOkHttpClient(): OkHttpClient {
        return mOkHttpClient
    }
}