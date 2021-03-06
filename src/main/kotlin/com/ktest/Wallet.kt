package com.ktest
//錢包
data class Wallet(val name:String ,
             var money:Int ) {
    //如何檢查傳進來的參數是否正確
    //https://blog.csdn.net/u011976726/article/details/78431161
    init {
        money = if(money >=0) money else 0
    }
}

fun main() {
    val w1 =Wallet("John",100)
    println(w1)
    val w2 =Wallet("Mary",-100)
    println(w2)
}