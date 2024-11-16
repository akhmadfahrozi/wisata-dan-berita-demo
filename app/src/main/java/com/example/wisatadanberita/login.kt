package com.example.wisatadanberita

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisatadanberita.databinding.ActivityLoginBinding

class login : AppCompatActivity() {

    private lateinit var bind: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(bind.root)

        val sharedPreference: shared = shared((this))

        if (sharedPreference.getValueBoolean("sts_regis")) {
            val i = Intent(applicationContext, mainnn::class.java)
            startActivity(i)
        }
            bind.but2.setOnClickListener {
                val i = Intent(this, mainnn::class.java)
                startActivity(i)
            }
            bind.textView6.setOnClickListener {
                val i = Intent(this, sign_up::class.java)
                startActivity(i)
            }
        }

}