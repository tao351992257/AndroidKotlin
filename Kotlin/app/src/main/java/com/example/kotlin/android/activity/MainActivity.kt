package com.example.kotlin.android.activity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlin.R
import com.example.kotlin.android.service.MyService
import com.example.kotlin.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), IMainActivity {
    override fun showData(string: String) {

    }

    var mMainPresenter: MainPresenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mMainPresenter = MainPresenter(this)
        initView()
    }

    private fun initView() {
        btn_start_service.setOnClickListener {
            mMainPresenter!!.getData("110101")
            //            startService(Intent(this@MainActivity,MyService::class.java))
        }
    }
}
