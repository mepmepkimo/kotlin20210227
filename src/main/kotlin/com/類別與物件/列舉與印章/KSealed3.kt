package com.類別與物件.列舉與印章

sealed class Operation {
    class Add(val x: Int, val y: Int) : Operation()
    class Sub(val x: Int, val y: Int) : Operation()

}

fun exec(op: Operation) = when (op) {
    is Operation.Add -> op.x + op.y
    is Operation.Sub -> op.x - op.y

}

////私自建立 Mul  不可以再 main建立
//class Mul(val x: Int, val y: Int) : Operation()


fun main() {
    val add=Operation.Add(20,10)
    val sub=Operation.Add(20,10)
    println(add)
    println(sub)

//    val mul = Mul(20,10)
//    println(exec(mul))
//
}