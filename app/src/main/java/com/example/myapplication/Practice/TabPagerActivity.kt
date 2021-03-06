package com.example.myapplication.Practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.myapplication.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_tab_pager.*


class TabPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_pager)



        // 텝에 사용할 텍스트를 설정한다.
        tab_layout.addTab(tab_layout.newTab().setText("One"))
        tab_layout.addTab(tab_layout.newTab().setText("Two"))
        tab_layout.addTab(tab_layout.newTab().setText("Three"))

        val pagerAdapter = FragmentPagerAdapter(supportFragmentManager, 3)
        ViewPager.adapter = pagerAdapter
        tab_layout.addOnTabSelectedListener(object:TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                ViewPager.currentItem = tab!!.position
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }


        })
            ViewPager.addOnPageChangeListener(TabLayout.TabLayoutOnPageChangeListener(tab_layout))
//        -> 페이져가 이동했을 때 탭을 이동시키는 코드

    }

}

class FragmentPagerAdapter(
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