package com.example.myapplication.Practice

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_fragment.*


class FragmentOne : Fragment() {

    interface OnDataPassListener {
        fun onDataPass(data: String?)
    }
    lateinit var dataPassListener : OnDataPassListener

    override fun onAttach(context: Context) {
        Log.d("Lifecycle","F onCreate")
        super.onAttach(context)
        dataPassListener = context as OnDataPassListener
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Lifecycle","F onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Lifecycle","F onCreateView")
        // fragment가 인터페이스를 처음으로 그릴 때 호출된다

        // inflater  -> 뷰를 그려주는 친구
        // container -> 부모 뷰

        return inflater.inflate(R.layout.fragment_one,container,false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Lifecycle","F onViewCreated")
        super.onViewCreated(view, savedInstanceState)

        // Activity의 onCreate에서 했던 작업을 여기에서 한다
        // pass.setOnClickListener{
        //    this.dataPassListener.onDataPass("Good Bye ~")
        // }


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Lifecycle","F onActivityCreated")

        val data = arguments?.getString("hello")
        Log.d("data", data.toString())

        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Lifecycle","F onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Lifecycle","F onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Lifecycle","F onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Lifecycle","F onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Lifecycle","F onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Lifecycle","F onDetach")
        super.onDetach()
    }
}