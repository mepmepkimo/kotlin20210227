package com.類別與物件.代理與委託


//SingleTon 與BY (委託
interface Buytea{
    fun buy()
}

object Daughter:Buytea{
    override fun buy(){
        println("女兒去買茶")
    }
}

class Mother:Buytea by Daughter{
    override fun buy() {
        println("媽媽叫女兒去買茶")
        Daughter.buy()
    }
}

fun main() {
    val m = Mother()
    m.buy()
}


