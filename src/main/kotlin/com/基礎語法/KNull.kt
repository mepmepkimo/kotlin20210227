package com.基礎語法

fun main(args: Array<String>) {
    val chinese: Int? = 0
    val english: Int? = 0
    val math: Int? = 80
    //若沒有考則放入null,計算總分的時候以0分計算之
    //請計算總分=?
//    var sum= (chinese?.toInt() ?:null?.toIntOrNull() ?: 0 )
//            +(english?.toInt() ?:null?.toIntOrNull() ?: 0)
//            +(math?.toInt() ?:null?.toIntOrNull() ?: 0)

    var sum = (chinese ?: 0) + (english ?: 0) + (math ?: 0)
    println(sum)
    var sum2 = chinese?.plus(english ?: 0) ?: 0
}