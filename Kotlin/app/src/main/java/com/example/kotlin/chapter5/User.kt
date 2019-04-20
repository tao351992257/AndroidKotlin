package com.example.kotlin.chapter5

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/15
 */
class User {
    var name: String? = null
    var age: Int? = null
    var sex: Char? = null

    constructor(name: String) {
        this.name = name
    }

    constructor(name: String, age: Int, sex: Char) {
        this.name = name
        this.age = age
        this.sex = sex
    }

    override fun toString(): String {
        return "$name+$age+$sex"
    }
}