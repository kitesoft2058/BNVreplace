package com.kitesoft.bnvreplace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kitesoft.bnvreplace.databinding.FragmentTab1Binding

class Tab1Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "tab1 fragment onCreateView method..", Toast.LENGTH_SHORT).show()

        //view binding 을 사용하면 onCreateView()메소드가 다시 호출되어도 기존의 binding.root 가 여전히 인스턴스로 살아았기에 기존 뷰의 스크롤 위치가 그대로 유지됨.
        //즉, 새로운 view를 만들지 않고 기존 binding.root 뷰를 리턴하여 프레그먼트에 보여짐.
        return binding.root

        //binding을 사용하지 않았다면 프레그먼트가 보여줄 뷰를 다시 만들어서 보여주게 되기에 스크롤 위치나 기존 뷰의 UI가 없어지고 새로 만들어짐.
        //return inflater.inflate(R.layout.fragment_tab1, container, false)
    }

    //***   onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager. ************
    //val binding = FragmentTab1Binding.inflate(layoutInflater) //error
    val binding by lazy { FragmentTab1Binding.inflate(layoutInflater) }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context, "tab1 fragment onDestroyView method...", Toast.LENGTH_SHORT).show()
    }

}