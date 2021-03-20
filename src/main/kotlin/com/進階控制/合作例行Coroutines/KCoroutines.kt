package com.進階控制.合作例行Coroutines

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun case1(){
    val statTime=System.currentTimeMillis()

    repeat(10000){
        Thread{}.start()
    }

    val  endTime=System.currentTimeMillis()
    println("case1 :${endTime-statTime}ms")
}

fun case2(){
    //運用coroutines
    //要先安裝 implementation "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.9"
    runBlocking {
        val startTime=System.currentTimeMillis()
        val job= launch {
            repeat(10000){
                launch{
                  //do something
                }
            }
        }
        job.invokeOnCompletion {
            val endTime =System.currentTimeMillis()
            println("case2:${endTime-startTime}ms")
        }
        val endDocumentTime=System.currentTimeMillis()
    }
}

fun main() {
    case1()
    case2()
}