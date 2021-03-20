package com.類別與物件.介面與抽象

interface  Job{
    fun  workContent()
}

abstract class Worker(){
    abstract  fun getHourlyPay():Int
    open fun showOff(){
        println("員工")
    }
}

class ParttimeWorker: Worker(), Job {//繼承
    override fun workContent() {
        println("App")
    }

    override fun getHourlyPay(): Int {
        return 2500

    }

    override fun showOff(){
        println("工讀生")
    }

}

fun ParttimeWorker.getPayByOneDay() = getHourlyPay() * 8    //那個getPayByOneDay為什麼可以在這邊

fun main() {
    val p = ParttimeWorker()
    p.showOff()
    p.workContent()
    println(p.getHourlyPay()*8)
    println(p.getPayByOneDay())
}