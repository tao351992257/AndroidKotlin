package com.example.kotlin.chapter4

/**
 * Created by HP
 * Created by 2019/4/14 22:38
 */
class Child(mName: String, mAge: Int) : Parent(mName, mAge) {
    init {
        println("$mName\n$mAge")
    }
}