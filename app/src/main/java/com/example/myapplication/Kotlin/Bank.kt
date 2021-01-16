package com.example.myapplication.Kotlin
// 은행 계좌 만들기
// - 생년월일 이름 초기금
// - 잔고를 확인하는 기능
// - 출금 기능
// - 예금 기능
fun main(args:Array<String>){
    val account:Account = Account("정민혁","0420",10000)
    println(account.checkAccount())


}

class Account(val name: String, val birth : String, var value : Int){


    fun checkAccount() : Int{
        return value
    }

    fun output(amount : Int) : Boolean{
        if (value >= amount){
            value -= amount
            return true
        }
        else{
            return false
        }
    }

    fun saveMoney(amount:Int){
        value += amount
    }


}