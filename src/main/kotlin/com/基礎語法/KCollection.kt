package com.基礎語法

fun main() {
    //集合 Set ,List ,Map  Set 特性內容不能重複 ,List 特性內容可以重複 ,Map
    val set = hashSetOf<Int>(1, 5, 2, 7, 6, 3)
    val list = arrayListOf<Int>(1, 5, 7, 3)
    val map = hashMapOf<Int, String>(1 to "One", 5 to "Five", 7 to "Seven", 3 to "Three")

    println(set)
    println(list)
    println(map)

    println(set.max())
    println(set.maxOrNull())

    val nums = hashSetOf<Int>(10, 42, 5, 4) // 除以3的餘數(1, 0, 2, 1 )
    //set 除以3的餘數 最大值
    println(nums.maxByOrNull { n -> n % 3 })
    //set 除以3的餘數 最大值
    println(nums.minByOrNull { it % 3 })  //我現在拿到的值跟3比較  這邊的it 就是 n值


    val set2 = hashSetOf<Int>(1, 5, 2, 9, 6, 3)
    //set 求出偶數的最大值
//    println(set2.maxByOrNull { n -> n / 2 })      //這邊不行是因為不能濾掉9 如果有9的話
//    println(set2.minByOrNull  { it / 2 })
    println(set2.filter { n -> n % 2 == 0 }.maxOrNull())
    println(set2.filter { it % 2 == 0 }.maxOrNull())


    //動動腦 請問誰的名字最長
    //使用 maxWithOrNuLL
    val names = hashSetOf<String>("Helen", "John", "Jackson", "Anita")
    println(names.maxByOrNull { it.length })          //https://kotlinlang.org/docs/collection-aggregate.html
    println(names.maxWithOrNull(compareBy({ it.length })))         //API說明


}