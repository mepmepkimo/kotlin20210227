//Java code 請參考 com.jtest.CallTopFun.java

@file:JvmName("Calc")//java可以透過此類別名稱調用
package com.含式呼叫.頂層含式

var count =0 //頂層屬性


@JvmName("myAdd")      //java可以透過此類別名稱調用
//@JvmName("myAdd1")         //java可以透過此類別名稱調用  只能給一個名稱
fun add (x:Int,y:Int):Int{   //頂層含式
++count
    return x+y

 }