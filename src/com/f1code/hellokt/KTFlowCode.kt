package com.f1code.hellokt

/**
 * Created by Administrator on 2017/7/21.
 */
fun main(args : Array<String>){
    var a = 2
    var b = 3

    var min = if(a<b){
        println("筛选出 较小的值 ：[a = $a]")
        a
    }else{
        println("筛选出 较小的值 ：[b = $b]")
        b
    }

    var max = if (a>b) a else b

    println(max)

}