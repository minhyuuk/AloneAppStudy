package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import androidx.viewpager.widget.PagerAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_tab_pager.*

class TabPager2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager2)

//        tab_layout.addTab(tab_layout.newTab().setText("ONE"))
//        tab_layout.addTab(tab_layout.newTab().setText("TWO"))
//        tab_layout.addTab(tab_layout.newTab().setText("THREE"))

    }
}

//class ThreePageAdapter(
//    val layoutInflater: LayoutInflater
//) : PagerAdapter(){
//
//    override fun instantiateItem(container: View, position: Int): Any {
//        when(position){
//            1 -> {
//                val view = layoutInflater.inflate(R.layout.fragment_one,container,false)
//                container.addView(view)
//                return view
//            }
//            2 -> {
//                val view = layoutInflater.inflate(R.layout.fragment_two,container,false)
//                container.addView(view)
//                return view
//            }
//            3 -> {
//                val view = layoutInflater.inflate(R.layout.fragment_three,container,false)
//                container.addView(view)
//                return view
//            }
//            else -> {
//                val view = layoutInflater.inflate(R.layout.fragment_one,container,false)
//                container.addView(view)
//                return view
//            }
//        }
//    }
//
//    override fun getCount(): Int {
//        return 3
//    }
//
//    override fun destroyItem(container: View, position: Int, `object`: Any) {
//
//        container.removeView(`object` as View)
//
//    }
//
//    override fun isViewFromObject(view: View, `object`: Any): Boolean {
//        return view === `object` as View
//        // pager adapter 사용할 때 자주 사용하니깐
//        // ===를 습관적으로 사용해도 무리가 있는 건 아니다.
//        // ===는 주소를 비교하는거라고 한다.
//        // ==는 완전히 같지만
//        // ===는 거의 같다? 같은 개념??을충족한다.
//        // as view는 view로 캐스팅 하는거다.
//    }
//
//}


// ※ 하지만 이 모든 방식들은 옛날 방식이다. 지금 이렇게 하면 당연히 오류를 먹는다. ※