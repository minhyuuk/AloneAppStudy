package com.example.myapplication.Practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_intent.*

class Intent1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent)

        val a = 10
        val b = a + 10
        val c = a + 10

        change_activity.setOnClickListener{
            val intent = Intent(this@Intent1, Intent2::class.java )
            startActivity(intent)
        }

    }
}