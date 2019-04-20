package com.example.kotlin.android.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.os.Looper
import android.widget.Toast

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/14
 */
class MyService:Service() {

    override fun onCreate() {
        super.onCreate()
        Thread { Runnable {
            Looper.prepare()
            Toast.makeText(this,"我在Service中Toast了一下",Toast.LENGTH_SHORT).show()
            Looper.loop()
        }}.start()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        println("onStartCommand")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}