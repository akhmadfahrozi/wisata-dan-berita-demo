package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wisatadanberita.databinding.ActivityDashboardHomeBinding
import com.example.wisatadanberita.databinding.ActivityFragmentprofileBinding

class fragmentprofile : Fragment() {
    private lateinit var bind: ActivityFragmentprofileBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        bind = ActivityFragmentprofileBinding.inflate(inflater, container, false)
        bind.getRoot()




//        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(context)
//        bind.rcBerita.setLayoutManager(layoutManager)

        // define an adapter

        // define an adapter
//        adapterr = adapter_berita( context)
//        recyclerView.setAdapter(mAdapter)
        // Inflate the layout for this fragment


        return bind.root
    }
}