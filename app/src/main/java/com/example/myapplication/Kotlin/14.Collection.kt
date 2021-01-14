package com.example.myapplication.Kotlin

fun main(args:Array<String>){

    // List -> 중복을 허용한다
    val numberList = listOf<Int>(1,2,3,3)
    println(numberList)

    // Set
    // -> 집합과 같음. 중복을 허용하지 않는다
    // -> 순서가 없다.
    val numberSet = setOf<Int>(1,2,3,3,3)
    println(numberSet)

    // Map -> key value 방식 관리
    val numberMap = mapOf<String,Int>("one" to 1, "two" to 2)

}