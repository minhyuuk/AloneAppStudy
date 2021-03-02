package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_tab_pager.*

class TabPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)


        // 텝에 사용할 텍스트를 설정한다.
        tab_layout.addTab(tab_layout.newTab().setText("One"))
        tab_layout.addTab(tab_layout.newTab().setText("Two"))
        tab_layout.addTab(tab_layout.newTab().setText("Three"))
    }
}

class PagerAdapter(
    fragmentManager: FragmentManager,
    val tabCount: Int
) : FragmentStatePagerAdapter(fragmentManager) {



    override fun getItem(position: Int): Fragment {

        // position에 위치할 때 Fragment를 이용해 activity를 넘겨준다
        when (position) {
            0 -> {
                return Fragment1()
            }

            1 -> {
                return Fragment2()
            }

            2 -> {
                return Fragment3()
            }
            else -> {
                return  Fragment1()
            }
        }
    }

    override fun getCount(): Int {
        // 탭의 수 만큼 count 한다
        return tabCount
    }

}