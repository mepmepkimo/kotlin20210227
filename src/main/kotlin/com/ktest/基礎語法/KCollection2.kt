package com.ktest

//複合元素集合
fun main() {
    data class Person(val name :String,val age:Int)
    val people = listOf<Person>(Person("John",18),
                                Person("Mary",20),
                                Person("Helen",19))
    //請問年紀最大的是誰
    val p= people.maxByOrNull { it.age }
    println(p)
    //請問平均幾歲?
    println(people.stream().mapToInt(Person::age).average().asDouble)
                //兩個冒號為方法參考
                //.asDouble 定義輸出為Double
    //println("Average: ${it.age.average()}")  錯的

}