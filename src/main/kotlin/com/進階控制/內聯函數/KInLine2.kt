package com.進階控制.內聯函數

val sum: (Int, Int) -> Int = { x, y -> x + y }
val action:()->Unit={println("Kotlin")} //Unit  -->Void

//內聯函式多用在高階函式中
//高階函式:將函示作用於參數或是返回值的函示

inline fun doCal(a: Int,b:Int,cal:(a:Int,b:Int)->Int):Int{//高階函式前面都會加上inline
    return cal(a,b)
}

fun main() {
    val value =doCal(10,20, sum)
    println(value)
    action()
}
