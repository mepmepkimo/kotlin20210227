package com.含式呼叫.集合聚合操作

//Pair and Triple
fun main() {
        //val p =Pair(1,"A")
    val p =1 to "A"//利用中序(infix)指令建構
    println(p)
    println(p.javaClass)
    println(p.toList())
    println("${p.first}${p.first.javaClass},${p.second}${p.second.javaClass}")
    println("--------------------------")


    //Triple
    val t = Triple(4,5,6)
    println("${t.first}${t.second}${t.third}")
    println("${t.component1()}${t.component2()}${t.component3()}")


    //Triple---不同型別
    val r = Triple("I am a String", listOf(5,8,9),7)
    println("${r.first}${r.second}${r.third}")
    println("${r.first.javaClass}${r.second.javaClass}${r.third.javaClass}")
    println("${r.component1()}${r.component2()}${r.component3()}")
    println("--------------------------")

    //解構 Pair ,Triple
    val (a,b)=p  //p是上面建立的Pair(1,"A")
    println("$a,$b")
    val(name,score)=Pair("小明",100)
    println("$name,$score")

    val (i,j,k)=t
    println("$i,$j,$k")


    //應用
    val scores= mapOf(Pair("小明",100),"小華" to 80,"小英" to 90)
    for (entry in scores){
        println("${entry.key}${entry.value}")
    }
    //統計資料
    val stat=scores.entries.stream().mapToInt({e->e.value}).summaryStatistics()//summaryStatistics()這是內建統計資料的含式
    println(stat)
    println(stat.sum)
    println(stat.average)
    println("--------------------------")


    //應用2
    var scores2= mapOf(Pair("小明",50),"小華" to 50,"小英" to 50)
    //在score中心曾小美的成績 : Pair("小美",70)
    //由於mapOf預設式 immutable 因此不可加入新元素
    //若要加入新元素則必須改變為可變型別
    scores2=scores2.toMutableMap()  //如果這邊要新增或式重新指派  上面的val 改var
    scores2["小美"]=70
    scores2.put("小美",70)
    for (entry in scores2){
        println("${entry.key}${entry.value}")
    }
    //統計資料
    val stat2=scores2.entries.stream().mapToInt({e->e.value}).summaryStatistics()//summaryStatistics()這是內建統計資料的含式
    println(stat2)
    println(stat2.sum)


    //可增加元素的集合
    var scores3= mutableMapOf(Pair("小明",50),"小華" to 50,"小英" to 50)
    scores3.put("小美",70)
}