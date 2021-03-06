package com.lab

fun Int.toBinary(len: Int): String {

    return String.format("%" + len + "s", this.toString(2)).replace(" ", "0")
    //% 8 s 代表有八格  thisto string 就是轉二進制的意思

}

var num = 8 //目前車位數量
var p = 18   //停車狀態

fun main() {
    while (true) {
        println("目前停車狀態: ${p.toBinary(num)}")
        print("請選擇車位(0-7): ")
        var n = readLine()!!.toInt()
        n = Math.pow(2.toDouble(), n.toDouble()).toInt()
        //2的Double 為什麼通通要設DOUBLE因為 規定  最後再轉回INT
        val isPass: Boolean = (p.and(n) == 0)  // p  &  n  這是位元相加
        if (isPass) {
            p += n //p+n的值
            println("最新車位狀態 : ${p.toBinary(num)},p=${p}")   //p=${p}<<<<回家了解
        } else {

            //n = log2(n.toDouble()).toInt()   //kotlin版本

            //n = n.toDouble().pow(0.5).toInt()//這是根號不能用

            n=(Math.log(n.toDouble()/Math.log(2.0)).toInt())
            println("${n}無法停車")
        }

    }
}