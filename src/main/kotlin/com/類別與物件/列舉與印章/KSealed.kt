package com.類別與物件.列舉與印章

/*
enum 在意的數據資料
sealed(密封)特殊API 在意的是類型 class XXX<<類型
*/


sealed class Employee {
    //抽象方法
    abstract fun job()

    class Developer() : Employee() {
        override fun job() {
            println("寫程式")
        }
    }

    class Manager() : Employee() {
        override fun job() {
            println("管人事")
        }
    }

}

//Employee 類透過sealed 告知 Employee物件的建立只能夠過 Developer 與 Manager 來建立
fun main() {
    val emp1 = Employee.Developer()
    emp1.job()
    val emp2 = Employee.Developer()
    emp2.job()
}


//    class Sales():Employee(){
//        override fun job() {
//            println("搶人事")
//        }
//    }
