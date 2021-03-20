package com.類別與物件.類別成員與SingleTon

import java.util.*


object KSingleTon {//  建立類別的話 用class大家可以來 new你
    //object的話 只能用在單例
    private var num :Int = 0
    init{
        num= Random().nextInt(100)
    }
    //fun getNum():Int = this.num
    fun getNum():Int{
    return this.num
    }
}

fun main() {
    val a1=KSingleTon
    println(a1.getNum())
    val a2=KSingleTon
    println(a2.getNum())
}