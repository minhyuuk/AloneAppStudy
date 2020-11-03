package com.example.myapplication.Kotlin

// 01. Variable -> 변수
// -> 상자

// 변수 선언하는 방법
// var/val 변수명(상자) = (넣고 싶은 것)

// var -> Variable
// val -> Value

// Value
// 값을 바꿀 수 없습니다.
// 약간 상수 같은 존재??

// Variable
// 값을 바꿀 수 있습니다.
// 자바에서 디폴트 같은 존재??

var num = 10
var hello = "hello"
var point = 3.4

val fix = 20



fun main(args:Array<String>)
{
    println(num)

    num = 100

    println(num)
}