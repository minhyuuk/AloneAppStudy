package com.example.myapplication.Practice

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentOne : Fragment() {

    override fun onAttach(context: Context) {
        Log.d("Lifecycle","onCreate")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("Lifecycle","onCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d("Lifecycle","onCreate")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.d("Lifecycle","onCreate")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Log.d("Lifecycle","onCreate")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Log.d("Lifecycle","onStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d("Lifecycle","onResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d("Lifecycle","onPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Lifecycle","onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.d("Lifecycle","onDestroyView")
        super.onDestroyView()
    }

    override fun onDetach() {
        Log.d("Lifecycle","onDetach")
        super.onDetach()
    }
}