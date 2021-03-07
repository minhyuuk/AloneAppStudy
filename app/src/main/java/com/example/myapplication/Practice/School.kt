package com.example.myapplication.Practice

import io.realm.RealmObject


// class를 열어야하므로 open을 꼭 적어야 한다고 한다.
open class School :RealmObject() {
    var name : String? = null
    var location : String? = null
}