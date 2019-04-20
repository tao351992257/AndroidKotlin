package com.example.kotlin.chapter2

import com.example.kotlin.chapter3.Preson

class Person(mName: String, mSex: Char, mAge: Int) : Type(mName, mAge, mSex) {

    override fun toString(): String {
        return "Name:$mName\nAge:$mAge\nmSex:$mSex"
    }
}

open class Type(var mName: String, var mAge: Int, var mSex: Char)

fun main(args: Array<String>) {
    val mPreson = Person("a", 'a', 10)
    val list: MutableList<Person> = mutableListOf()
    list.add(mPreson)
    println(list.size)
    val mapList = mutableMapOf<Int,Person>()
    mapList.put(0, Person("赵美玲",'女',52))
    mapList.put(1, Person("赵令子",'女',10))

    mapList.forEach(){
        println("${mapList}")
    }
    for (i in list){
        println("$i")
    }

}

