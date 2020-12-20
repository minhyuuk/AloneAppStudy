package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_calculator.*

class Calculator : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        var num1 ="0"
        var num2 = "0"

        one.setOnClickListener{

            num1 += "1"
            result.setText(num1)

        }
        two.setOnClickListener{

            num1 += "2"
            result.setText(num1)
        }
        three.setOnClickListener{

            num1 += "3"
            result.setText(num1)
        }
        four.setOnClickListener{

            num1 += "4"
            result.setText(num1)
        }
        five.setOnClickListener{

            num1 += "5"
            result.setText(num1)
        }
        six.setOnClickListener{

            num1 += "6"
            result.setText(num1)
        }
        seven.setOnClickListener{

            num1 += "7"
            result.setText(num1)
        }
        eight.setOnClickListener{

            num1 += "8"
            result.setText(num1)
        }
        nine.setOnClickListener{

            num1 += "9"
            result.setText(num1)
        }
        zero.setOnClickListener{

            num1 += "0"
            result.setText(num1)
        }

        equal.setOnClickListener{

            result.setText(num2)

        }

        clear.setOnClickListener{

            num1 = "0"
            num2 = "0"
            result.setText("0")

        }
        sum.setOnClickListener{

            num2 = (num2.toInt() + num1.toInt()).toString()
            num1 = "0"

        }
        sub.setOnClickListener{

            num2 = (num2.toInt() - num1.toInt()).toString()
            num1 = "0"

        }
        mul.setOnClickListener{

            num2 = (num2.toInt() * num1.toInt()).toString()
            num1 = "0"

        }
        div.setOnClickListener{

            num2 = (num2.toInt() / num1.toInt()).toString()
            num1 = "0"

        }



    }
}