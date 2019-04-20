package com.example.kotlin.chapter1

/**
 * Kotlin 基本数据类型
 */
class BasicTypes {
    //Boolean 类型
    val aBoolean: Boolean = true
    val bBoolean: Boolean = false
    //Int 类型
    val aInt :Int = 8;
    val maxInt :Int = Int.MAX_VALUE
    val minInt:Int = Int.MIN_VALUE

}

fun main(args: Array<String>) {
    println(BasicTypes().maxInt)
    println(BasicTypes().minInt)
}