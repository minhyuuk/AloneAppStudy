package com.example.myapplication.Practice

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_list_view.*

class ListViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))
        }
        val adapter = ListViewAdapter(carList,this@ListViewActivity)
        listview.adapter = adapter
        listview.setOnItemClickListener{ parent, view, positon, id ->
            val carName = (adapter.getItem(positon) as CarForList).name
            val carEngine = (adapter.getItem(positon) as CarForList).name

            Toast.makeText(this@ListViewActivity, carName + " " + carEngine, Toast.LENGTH_SHORT).show()
        }


    }
}


class ListViewAdapter(
    val carForList:ArrayList<CarForList>,
    val context: Context
) : BaseAdapter(){


    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

//        val view : View
//        val holder : ViewHolder
//
//        if (convertView = null) {
//            view = layoutInflater.inflate(R.layout.item_view, null)
//            holder = ViewHolder()
//
//            holder.carName = view.findViewById(R.id.car_name)
//            holder.carEngine = view.findViewById(R.id.car_engine)
//
//            view.tag = holder
//        }else {
//            holder = convertView.tag as ViewHolder
//            view = convertView
//        }
//        holder.carName?.setText(carForList.get(position).name)
//        holder.carEngine?.setText(carForList.get(position).engine)
//        return view





        /** addview와 굉장히 유사함 **/
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.item_view, null)
        var carNameTextView = view.findViewById<TextView>(R.id.car_name) // -> findViewbyId를 개선하기 위해 viewholder를 사용한다
        var carEngineTextView = view.findViewById<TextView>(R.id.car_engine)

        carNameTextView.setText(carForList.get(position).name)
        carEngineTextView.setText(carForList.get(position).engine)

        return view
        /** addview와 굉장히 유사함 **/

    }

    override fun getItem(position: Int): Any {
        return carForList.get(position) // 아이템 리스트 위치 매기기 ( 1번 위치, 2번 위치 . . . )
    }

    override fun getItemId(position: Int): Long {
        return position.toLong() // id를 부여해주는 부분
    }

    override fun getCount(): Int {
        return carForList.size // 전체 사이즈를 알려주는 부분
    }


}
// android developer에서도 viewholder 사용을 권장하므로 viewholder방식 사용 권장
class ViewHolder{
    var carName: TextView? = null
    var carEngine : TextView? = null

}