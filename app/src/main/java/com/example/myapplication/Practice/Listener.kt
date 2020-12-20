package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_listener.*

class Listener : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listener)



        // view를 activity로 가져오는 방법
        // 1> 직접 찾아서 가져온다
        // val textView : TextView = findViewById(R.id.hello)
        // 2> XML을 import 해서 가져온다
        // hello.

        // 1 람다 형식 방식
        // 3->2->1 방식으로 진화
        hello.setOnClickListener {

            Log.d("click","Click!!")

        }

        // 2 익명 함수 방식
        // 3->2->1 방식으로 진화
        hello.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                Log.d("click" ,"Click")
                hello.setText("hello")
            }

        })

        // 3 이름이 필요한 경우 (click)
        // 3->2->1 방식으로 진화
        val click = object:View.OnClickListener{
            override fun onClick(v: View?) {
                Log.d("click", "Click!!")
                hello.setText("안녕하세요")
                image.setImageResource(R.drawable.ic_launcher_background)
            }
        }

        // hello.setOnClickListener(click)
        // image.setImageResource(경로)
        // 뷰를 조작하는 함수들
        // 1> setText
        // 2> setImageResource
        hello.setText("안녕하세요")




    }
}