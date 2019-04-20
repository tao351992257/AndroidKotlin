package com.example.kotlin.chapter5

/**
 *  Author : JinTao Li
 *  Create Time : 2019/4/14
 */
fun sum(arg1: Int, arg2: Int): Int {
    return arg1 + arg2
}

var sum = { arg1: Int, arg2: Int -> arg1 + arg2 }

fun main(args: Array<String>) {

    val user = User("李四", 10, '女')
    User("你好")

    var users:Array<User> = arrayOf(User("张三",10,'男'),user)
    users.forEach {
        println(it.toString())
    }
//    println(sum.invoke(1,2))
//    println(long)
    args.forEach {
        println(it)
    }
}

var long = fun(arg1:Int):Long{
    return arg1.toLong()
}