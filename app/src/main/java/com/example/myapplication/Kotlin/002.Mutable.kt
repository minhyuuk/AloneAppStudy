package com.example.myapplication.Kotlin

var mutableList = mutableListOf("MON","TUE","WED")  // 3개의 값을 가진 크기가 3인 배열 리스트 생성
// mutableList.add("FRI") 값을 추가하기

var variable = mutableList.get(1)   // 1번째 인덱스 값을 가져오기
// mutableList.set(4,"THU") 설정한 인덱스 위치에 수정할 값 넣기
// mutableList.removeAt(1) 인덱스를 지정해 값을 삭제

// 데이터 타입을 모르므로 직접 타입을 알려줘야한다.
// var 변수명 = mutableListOF<컬렉션에 입력될 값의 타입>()


// 빈 리스트 조작해보기

// 생성
var stringList = mutableListOf<String>()

// 입력
// stringList.add("월")
// stringList.add("화")

// 사용
// Log.d("Collection", "stringList에 입력된 두 번째 값은 ${stringList.get(1)}입니다.")

// 수정
// stringList.set(2,"Monday")

// 삭제
// stringList.removeAt(1)