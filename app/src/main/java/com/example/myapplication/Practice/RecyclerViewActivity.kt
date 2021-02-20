package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_recycler_view.*

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val carList = ArrayList<CarForList>()
        for (i in 0 until 10) {
            carList.add(CarForList("" + i + "번째 자동차", "" + i + "순위 엔진"))

        }
        val adapter = RecyclerViewAdapter(carList, LayoutInflater.from(this@RecyclerViewActivity))
        recycler_view.adapter = adapter
        // 레이아웃 매니저
        recycler_view.layoutManager = LinearLayoutManager(this@RecyclerViewActivity)
        // recycler_view.layoutManager = GridLayoutManager(this@RecyclerViewActivity, 2)
    }
}
class RecyclerViewAdapter(
    val itemList : ArrayList<CarForList>,
    val inflater : LayoutInflater
): RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>(){

    // init을 사용하게 되면 밖에 클래스에 있는 값을 가져오지 못한다. 그러므로
    // init을 사용하게 된다면 inner를 사용해주어야 값을 가져올 수 있게 된다.
    // 이렇게 되면 viewholder 클래스는 recyclerviewadpater클래스에 속해있으므로 밖에 있는 아우터 클래스의 멤버에 접근이 가능하다

    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView) {
        val carName : TextView
        val carEngine : TextView
        // init 블럭, 초기화 블럭 이라고 한다. 클래스를 실행할 때 가장 먼저 실행된다고 한다.
        init {
            carName = itemView.findViewById(R.id.car_name)
            carEngine = itemView.findViewById(R.id.car_engine)
            itemView.setOnClickListener{
                val position: Int = adapterPosition // <- 포지션을 가지고 있는 변수를 선언
                // 포지션을 이제 가져와야함.
                val engineName = itemList.get(position).engine
                Log.d("engine", engineName)

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.carName.setText(itemList.get(position).name)
        holder.carEngine.setText(itemList.get(position).engine)
    }
}