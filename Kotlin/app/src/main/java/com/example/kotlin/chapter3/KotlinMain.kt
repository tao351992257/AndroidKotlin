package com.example.kotlin.chapter3

import com.example.kotlin.chapter2.Person


fun getString(): String? {
    return null
}

fun main(args: Array<String>) {
    //如果为空直接返回
//    val string = getString()?:return
//    println("string length:${string.length}")
//    if (string == null) {
//        println("string is null")
//    } else {
//        println(string.length)
//    }

//    println(getString()?.length)
    val preson: Preson = Child()
    if (preson is Child) {
        println(preson.name)
    }

    val sayHello: String? = null
    if (sayHello is String)
        println("--------${sayHello!!.length}")
}