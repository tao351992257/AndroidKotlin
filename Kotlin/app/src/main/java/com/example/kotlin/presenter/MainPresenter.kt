package com.example.kotlin.presenter

import android.content.Context
import com.example.kotlin.android.activity.IMainActivity
import com.example.kotlin.android.activity.MainActivity
import com.example.kotlin.bean.WeatherBean
import com.example.kotlin.chapter3.Preson
import com.example.kotlin.modle.IMainModle
import com.example.kotlin.modle.MainModle
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/18
 */
class MainPresenter : IMainPresenter {
    var mMainView: MainActivity? = null
    var mMainModle: MainModle? = null

    constructor(mMainView: MainActivity?) {
        this.mMainView = mMainView
        mMainModle = MainModle()
    }

    override fun getData(city: String) {
        mMainModle!!.getDate(city).subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(object :Observer<String>{
                override fun onComplete() {

                }

                override fun onSubscribe(d: Disposable?) {

                }

                override fun onNext(value: String?) {
                    mMainView!!.showData(value!!)
                }

                override fun onError(e: Throwable?) {

                }

            })
    }
}