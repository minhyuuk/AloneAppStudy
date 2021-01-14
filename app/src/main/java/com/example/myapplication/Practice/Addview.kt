package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.LinearLayout
import android.widget.TextView
import com.example.myapplication.R

class Addview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_addview)


        // Item List 준비 완료
        val carList = ArrayList<CarForList>()
        for(i in 0 until 10){
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진 "))
        }
            var container = findViewById<LinearLayout>(R.id.AddviewContainer)
//            var inflater = layoutInflater.from(this@AddView)

        for(i in 0 until carList.size){
//            val itemView = inflater.inflate(R.layout.item_view , null)
//            val carNameView = itemView.findViewById<TextView>(R.id.car_name)
//            val carEngineView = itemView.findViewById<TextView>(R.id.car_engine)

//            carNameView.setText(carList.get(i).name)
//            carEngineView.setText(carList.get(i).engine)
        }
    }


}
class CarForList(val name : String, val engine: String){

}
