package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.PopupMenu
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.wisatadanberita.databinding.ActivityLoginBinding
import com.example.wisatadanberita.databinding.ActivityMainBinding
import com.example.wisatadanberita.databinding.ActivityMainnnBinding

class mainnn : AppCompatActivity() {
    private lateinit var bind: ActivityMainnnBinding
    lateinit var fm: FragmentManager
    lateinit var ft: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainnnBinding.inflate(layoutInflater)
        setContentView(bind.root)


        val das = dashboard_home()
        val fro = fragmentprofile()

        fm = supportFragmentManager
        ft = fm.beginTransaction()
        ft.replace(R.id.layout_frame, dashboard_home()).commit()


        bind.chipNavigationBar2.setItemSelected(R.id.home11)


//
//            setfragment(fragmenthome)
//        .setOnClickListener {
//            setfragment(fragmenthome)
//
//        }
//        menu2.setOnClickListener {
//            setfragment(fragmenttiket)
//
//            changeIcon(menu1, R.drawable.ic_home)
//            changeIcon(menu2, R.drawable.ic_tikett)
//            changeIcon(menu3, R.drawable.ic_profil)
//        }
//        menu3.setOnClickListener {
//            setfragment(fragmentsetting)
//
//            changeIcon(menu1, R.drawable.ic_home)
//            changeIcon(menu2, R.drawable.ic_tiket)
//            changeIcon(menu3, R.drawable.ic_profill)
//        }
        bind.chipNavigationBar2.setOnItemSelectedListener { item ->
            when (item) {
                R.id.home11 -> {
                    setfragment(das)
                }

                R.id.fav -> {

                }

                R.id.profileee -> {
                    setfragmentprof(fro)
                }

            };true
        }
    }


    //    load class fragment
    private fun setfragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmenttransisi = fragmentManager.beginTransaction()
        fragmenttransisi.replace(R.id.layout_frame, dashboard_home()).commit()

    }
    private fun setfragmentprof(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmenttransisi = fragmentManager.beginTransaction()
        fragmenttransisi.replace(R.id.layout_frame, fragmentprofile()).commit()

    }

}


//set an active fragment programmatically

