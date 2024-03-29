package com.含式呼叫.集合聚合操作
//數據歸納
fun main() {
    val numbers = listOf(5,2,10,4)
    //fold 與 reduce
    /*
    * 對於更特定的情況，有函數reduce()和fold()，它們依次將所提供的操作應用於集合元素並返回累積的結果。
    * 操作有兩個參數：先前的累積值和集合元素。
    * 這兩個函數的區別在於：fold()接受一個初始值並將其用作第一步的累積值，
    * 而reduce()的第一步則將第一個和第二個元素作為第一步的操作參數。
    * */
    val sum= numbers.reduce{sum,element -> sum+element}
    println(sum)
    numbers.reduce{sum,element->
        println("sum:${sum},element:${element}")
        sum+element
    }

    //每個元素 *2加總
    val sum2= numbers.reduce{sum,element -> sum+element*2}
    println(sum2)
    numbers.reduce { sum, element ->
        //numbers.reduce(0) { sum, element ->錯的 reduce後面不能有小括弧
        println("sum:${sum},element:${element * 2}")
        sum + element * 2
    }
        val sum3 = numbers.fold(0) { sum, element -> sum + element * 2 }
        println(sum3)
        //印出log
        numbers.fold(0) { sum, element ->   //fold 需要給他一個小括弧 for initial
            println("sum:${sum},element:${element * 2}")
            sum + element * 2
        }

}


