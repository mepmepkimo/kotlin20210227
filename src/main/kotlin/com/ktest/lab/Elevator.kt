package com.lab


// 請實作一個電梯程式
// B1, lobby ,1 ,2 ,3 ,4 ,5 ,6 ,7 ,空中花園
// -1, 0, 1, 2, 3, 4, 5, 6, 7, 8
// CTRL+D也可以複製上一行

fun main(args: Array<String>) {
    //電梯位置
    var ePos = 0
    do {
        print("電梯在${ePos}樓 請輸入樓層(B1-8): ")

        // 將try作為一個表達式
        // -999表示所輸入的不是數值
        var floor = try { readLine()!!.toInt() } catch(e:java.lang.Exception){ //try catch 表達式 故障碼為-2
            if(e.message!!.contains("B1"))-1 else -999  //若使用者輸入 B1 則回傳-1
        }
        println("floor:${floor}")

//        if (floor < -1 || floor > 8)
//            println("無此樓層請從新輸入")
        //處理樓層範圍錯誤
        try {
            floor = if (floor in -1..8) floor else throw Exception("樓層錯誤")
        } catch (e: java.lang.Exception) {
            println(e.message)
            continue
        }
        //樓層判斷
        if (floor > ePos) {                   //電梯上樓
            println("電梯上樓")
            for (i in ePos..floor) {
                Thread.sleep(1000)
                println(i)
            }
        } else if (floor < ePos) {             //電梯下樓
            println("電梯下樓")
            for (i in ePos downTo floor) {
                Thread.sleep(1000)
                println(i)
            }

        }
        //電梯到達指定樓層
        ePos = floor
    } while (true)
}


//    fun getLevel (floor:Int)= when(floor) {
//
//            var floor = r.nextInt(101)
//            val act = if (floor >= -1)
//            println("停車場")
//        Thread.sleep(1000)
//
//                println ("0")
//                Thread . sleep (1000)
//
//                println ("Lobby")
//                Thread . sleep (1000)
//
//                println ("1")
//                Thread . sleep (1000)
//
//                println ("2")
//                Thread . sleep (1000)
//
//                println ("3")
//                Thread . sleep (1000)
//
//                println ("4")
//                Thread . sleep (1000)
//
//                println ("5")
//                Thread . sleep (1000)
//
//                println ("6")
//                Thread . sleep (1000)
//
//                println ("7")
//                Thread . sleep (1000)
//
//                println ("空中花園")
//                Thread . sleep (1000)
//    }
