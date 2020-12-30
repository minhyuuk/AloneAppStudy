package com.example.myapplication.Practice

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_resource.*

class Resource : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resource)

        // 1
        val ment = resources.getString(R.string.textview_text)
        Log.d("mentt", "ment : " + ment)

        // 2
        val ment2 = getString(R.string.textview_text)
        Log.d("mentt","ment : " + ment2)

        // SDK
        val color = if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            button.setBackgroundColor(getColor(R.color.textview_color))
            getColor(R.color.textview_color)
        } else {
            button.setBackgroundColor(resources.getColor(R.color.textview_color))
        }


    }
}