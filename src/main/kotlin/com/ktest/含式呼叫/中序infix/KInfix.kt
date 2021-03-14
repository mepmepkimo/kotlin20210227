package com.含式呼叫.中序infix

class Salary  (var income:Int){
    //中序呼叫 to add
    //加入infix 中序調用修飾字
    infix fun add(bouns: Int){
        //this.income = this.income+bouns
        income+=bouns
    }
    fun addTen(){ //前面的_____ +上10
        this add 10

    }
}

fun main() {
    val salary =Salary(70000)
    println(salary.income)
    val bouns = 90000
    //salary.add(bouns)
    //中序呼叫:目標物件 方法名稱 參數
    salary add bouns
    println(salary.income)

    salary.addTen()
    println(salary.income)

}