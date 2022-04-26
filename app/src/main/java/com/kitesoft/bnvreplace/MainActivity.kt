package com.kitesoft.bnvreplace

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.kitesoft.bnvreplace.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    val fragments= mutableListOf<Fragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        fragments.add(Tab1Fragment())
        fragments.add(Tab2Fragment())
        fragments.add(Tab3Fragment())

        supportFragmentManager.beginTransaction().add(R.id.container_fragment, fragments[0]).commit()

        binding.bnv.setOnItemSelectedListener {
            //view binding 을 사용하였다면 굳이 show(), hide()를 하지 않고 replace()를 해서 기존 Fragment 인스턴스로 대체하여 Fragment의 onCreateView()가 다시 호출되어도
            //binding.root를 그대로 리턴해서 보여주기에 기존 scroll 위치나 UI가 새로 만들어지지 않고 그대로 유지하게됨. 그렇기에 show(),hide()의 효과를 가지게 됨.
            // .addBackStack()를 한다고 replace()의 remove()+add() 기능이 달라진것은 아님. 단지 뒤로가기를 눌렀을때.. 이전 Tab의 프레그먼트가 다시 보여짐..동작이 이상해짐.
            when(it.itemId){
                R.id.menu_bnv_tab1-> supportFragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[0]).commit()
                R.id.menu_bnv_tab2-> supportFragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[1]).commit()
                R.id.menu_bnv_tab3-> supportFragmentManager.beginTransaction().replace(R.id.container_fragment, fragments[2]).commit()
            }

            Toast.makeText(this, "size : ${supportFragmentManager.fragments.size}", Toast.LENGTH_SHORT).show()

            true
        }
    }
}