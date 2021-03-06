package com.ktest

import kotlin.random.Random

class KArray {
}

fun main() {
    // 數組陣列
    val num1=arrayOf(1, 5, 7, 3)        //隱式
    val num2=arrayOf<Int>(1, 5, 7, 3)   //顯式
    // for
    for(i in 0..num1.size-1){
        println(num1[i])
    }
    println(num1.indices)
    for (i in num1.indices){            //從第一個開始印出來
        println(num1[i])
    }
    //使用lamdbda 創建
    val num3=Array(5,{i->i*1})
    for(i in num3.indices){
        println(num3[i])
        println("--------------------------------")
    }
    //-----------------------------------------


    //四星採電腦選號(0-9)
    val num4=Array(4) { _ -> Random.nextInt(10)}
    //println(Arrays.toString(num4))
    println(num4.contentToString())     //Array.toString(num4)

    //setter / getter

    var n1=num4.get(1)
    num4.set(1,9)   //num4[1] = 9
    println(num4.contentToString())
    println("--------------------------------")


    //-----------for-each (印出元素內容)
    num4.forEach { n-> println(num4[n]) } //n?? 可以單純印出n?



}