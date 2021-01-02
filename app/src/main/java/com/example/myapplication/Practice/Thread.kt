package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_thread.*
import java.lang.Thread

class Thread : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)




        val runnable : Runnable = object : Runnable{
            override fun run() {
                    Log.d("Thread-1","Thread1 생성되었습니다.")
            }
        }

        val thread : Thread = Thread(runnable) // 쓰레드는 명령을 받았다. 허나 시작하라는 명령이 나와야 실행이 된다.

        button.setOnClickListener{
            thread.start() // 이곳에서 실행을 시킨다.
        }


        Thread(object : Runnable{
            override fun run() {
                Log.d("Thread-1","Thread2 생성되었습니다.")
            }
        }).start()

        Thread(Runnable{
            Log.d("Thread-1","Thread3 생성되었습니다.")
//            Thread.sleep(2000) // Thread를 2초 동안 잠들게 한다.
//            button.setBackgroundColor(getColor(R.color.textview_color))
        }).start()
//            runOnUIThread -> UI 쓰레드(메인 쓰레드)에서 작동시킬 수 있는 UI 접근하는 쓰레드
//            UI 관련 작업을 하고 싶다면 runOnUIThread를 사용하심 됨

//            쓰레드를 만들어서 사용하는 것 보다 안드로이드는 메인 쓰레드가 존재하고 하나이며 메인 쓰레드는 정지가 불가하다. UI를 책임지고 있기 때문이다
//            이것만 기억하면 끝
    }
}