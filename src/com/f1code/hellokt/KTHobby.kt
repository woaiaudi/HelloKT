package com.f1code.hellokt

/**
 * Created by Administrator on 2017/7/20.
 */
fun main(args: Array<String>) {
    val arr = mapOf("name" to "jack", "age" to 12, "book" to listOf("book1", "book2"))

    println(arr["book222"]?.toString())

    var userInfo = mapOf(
            "id" to 1234,
            "userName" to "jack",
            "email" to "zzzzz@qq.com")

    //如果邮件为空，设置一个默认值
    var userEmail1 = userInfo["email2"]?:"defaultEmail@qq.com"
    println(userEmail1)

    //如果邮件为空，抛出异常
    var userEmail2 = userInfo["email2"]?:throw IllegalStateException("Emailis missing!")
    println(userEmail2)

    var userEmail = userInfo["emailxxxx"]
    userEmail?.let{
        println("将UI上电子邮件更新为$userEmail")
    }

    // YY 一下下
    var myMoney = 99_999_999
    println(myMoney)
}