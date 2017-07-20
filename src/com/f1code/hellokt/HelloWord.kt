package com.f1code.hellokt

/**
 * Created by Administrator on 2017/7/20.
 */
fun main(args:Array<String>){
    var helloKT = HelloKT()
    println(helloKT.sum(3))


    //遍历List
    //测试的只读List
    val testArr = listOf(22,33,44)
    for ((iii,vvv) in testArr.withIndex()){
        println("item[$iii]:$vvv")
    }

    val testMap = mapOf("ka" to "va", "kb" to 2, "kc" to testArr)
    for ((k,v) in testMap){
        println("[$k : $v]")
    }


}

class HelloKT {
    //默认值 80
    fun sum(a: Int, b: Int=80): Int {
        return a + b
    }

    //void 返回值 函数
    fun showModel(name:String,age:Int):Unit{
        println("name:${name.toUpperCase()},age:$age")
    }

}



