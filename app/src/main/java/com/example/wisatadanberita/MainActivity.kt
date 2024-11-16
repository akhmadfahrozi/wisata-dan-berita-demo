package com.example.wisatadanberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.wisatadanberita.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bind: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = Handler()
        handler.postDelayed({
            val splsh = Intent(this, login::class.java)
            startActivity(splsh)
            finish()

        }, 4000)}
    }
