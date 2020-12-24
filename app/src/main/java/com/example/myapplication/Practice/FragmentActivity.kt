package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_fragment.*

class FragmentActivity : AppCompatActivity(), FragmentOne.OnDataPassListener {

    override fun onDataPass(data: String?) {
        Log.d("pass","" + data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        Log.d("Lifecycle","onCreate")

        val fragmentOne : FragmentOne = FragmentOne()
            // Fragment에 data를 넣어주는 방법
            // Bundle을 만들어 Fragment에 끼워 넣어주어야 함
            val bundle : Bundle = Bundle()
            bundle.putString("Hello","Hello")
            fragmentOne.arguments = bundle


        button.setOnClickListener{
            // Fragment를 동적으로 작동하는 방법
            // val fragmentOne : FragmentOne = FragmentOne()
            // supportFragmentManager의 부모가 AppCompatActivity이므로 사용이 바로 가능함
            val fragmentManager : FragmentManager = supportFragmentManager
            // Transaction
            // 작업의 단위라 생각하면 된다.  ->  ( 시작과 끝이 있다 )

            // 시작
            val fragmentTransaction = fragmentManager.beginTransaction()
            // 할 일
            fragmentTransaction.replace(R.id.container, fragmentOne)
            // 끝
            fragmentTransaction.commit()

            // 끝을 내는 방법
            // commit    -> 시간 될 때 해라  (좀 더 안정적이다)
            // commitnow -> 지금 당장 하여라
        }
        button2.setOnClickListener{
            // 흔히 하는 실수

            // val fragmentOne : FragmentOne = FragmentOne()
            // val fragmentManager = supportFragmentManager
            // val fragmentTransaction = fragmentManager.beginTransaction()
            // fragmentTransaction.detach(fragmentOne)
            // fragmentTransaction.commit()

             val fragmentManager = supportFragmentManager
             val fragmentTransaction = fragmentManager.beginTransaction()
            // detach/remove
            // remove : 뗐다가 붙임
            // detach : 떼고 다시 붙이지 않음
             fragmentTransaction.remove(fragmentOne)
             fragmentTransaction.commit()

        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Lifecycle","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Lifecycle","onRestart")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Lifecycle","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Lifecycle","onDestroy")
    }
}
