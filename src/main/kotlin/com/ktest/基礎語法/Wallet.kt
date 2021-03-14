package com.ktest

//錢包
data class Wallet(val name:String ,
             var money:Int ) {
    //如何檢查傳進來的參數是否正確
    //https://blog.csdn.net/u011976726/article/details/78431161


    init {
        //case 1
        money = if(money >=0) money else 0

        //case 2
        money =try {
            //檢驗含式,檢驗失敗會拋出例外
            require(money>=0)
            money
        }catch (e: Exception){
            0
        }
        //https://kotlinlang.org/docs/annotations.html kotlin api function
    }
}

fun main() {
    val w1 =Wallet("John",100)
    println(w1)
    val w2 =Wallet("Mary",-100)
    println(w2)
}