package com.含式呼叫.繼承含式
import  com.含式呼叫.繼承含式.endChar as end

//撰寫繼承函式
fun String.endChar(): Char{
    return this.get(this.length-1)
}

fun main() {
    val s = "abc"
    println(s.javaClass)
    //想要得到最後一個字
    println(s.end())//使用import 給予 endChar 一個別名
}