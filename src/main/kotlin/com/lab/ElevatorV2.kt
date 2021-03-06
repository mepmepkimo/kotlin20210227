//package com.lab
//
//class ElevatorV2 {
//}
//
//// 請實作一個電梯程式
//// B1, lobby ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,空中花園
//// -1, 0, 1, 2, 3, 4, 5, 6, 7, 8
//// CTRL+D也可以複製上一行
//
//fun main() {
//    // 先定義電梯位置
//    var ePos = 0
//    do {
//
//
//        print("電梯在 ${ePos} 樓 請輸入樓層(0-8)")
//        var floor =-1..8
//        if (floor>ePos){                //電梯上樓
//            println("電梯上樓")
//            for (i in ePos..floor){     //正數
//                Thread.sleep(1000)
//                println(i)              //end
//            }
//        }else if(floor <ePos){          //電梯下樓
//            println("電梯下樓")
//            for (i in ePos downTo  floor){  //倒數
//                Thread.sleep(1000)
//                println(i)                  //end
//            }
//
//        }
//    }while (true)
//
//
//}