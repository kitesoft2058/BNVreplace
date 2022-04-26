package com.kitesoft.bnvreplace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kitesoft.bnvreplace.databinding.FragmentTab1Binding
import com.kitesoft.bnvreplace.databinding.FragmentTab2Binding
import com.kitesoft.bnvreplace.databinding.FragmentTab3Binding

class Tab3Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Toast.makeText(context, "tab3 fragment onCreateView method..", Toast.LENGTH_SHORT).show()

        return inflater.inflate(R.layout.fragment_tab3, container, false)
    }

    val binding by lazy { FragmentTab3Binding.inflate(layoutInflater) }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context, "tab3 fragment onDestroyView method...", Toast.LENGTH_SHORT).show()
    }
}