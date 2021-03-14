package com.含式呼叫.集合聚合操作

fun main() {
    var numbers = listOf<Int>(5,42,10,4)
    println("Count: ${numbers.count()}")
    println("Sum: ${numbers.sum()}")
    println("Avg: ${numbers.average()}")
    println("Max: ${numbers.max()}")
    println("Min: ${numbers.min()}")
    println("Max: ${numbers.maxByOrNull { it }}")
    println("Min: ${numbers.minByOrNull { it }}")
    //numbers 中 %3的最小值 mod 3  取餘數3
    //(5,42,10,4) %3 (2,0,1,1)
    //42
    println("%3 min:${numbers.minByOrNull {  it %3}}")

    val strings = listOf("one","two","three","four")
    //利用 maxWith()
    val longestString= strings.maxWithOrNull(compareBy{it.length})
        println("longest string = $longestString")


}