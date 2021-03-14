package com.ktest

data class Account (val name:String){   //加上data 可以一同印出 Account 後面括號裡面的東西
    var balance:Int = 0
    get() = field    //特殊關鍵字
    set(value) {
        if(value >=0)
        field = value
    }
//    set(value) = if(value >=0) field = value else field= field    //表達式
}

fun main() {
    val act = Account("John")
    println(act.balance)
    act.balance=100
    println(act.name)
}