package com.kitesoft.bnvreplace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kitesoft.bnvreplace.databinding.FragmentTab1Binding
import com.kitesoft.bnvreplace.databinding.FragmentTab2Binding

class Tab2Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "tab2 fragment onCreateView method..", Toast.LENGTH_SHORT).show()
        return binding.root

        //return inflater.inflate(R.layout.fragment_tab2, container, false)
    }

    val binding by lazy { FragmentTab2Binding.inflate(layoutInflater) }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Toast.makeText(context, "tab2 fragment onViewCreated method....", Toast.LENGTH_SHORT).show()
        //binding.tv.text="Have a good day."
    }

    override fun onResume() {
        super.onResume()

        Toast.makeText(context, "tab2 fragment onResume method..", Toast.LENGTH_SHORT).show()
        binding.btn.setOnClickListener { binding.tv.text="nice to meet you" }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context, "tab2 fragment onDestroyView method...", Toast.LENGTH_SHORT).show()
    }
}