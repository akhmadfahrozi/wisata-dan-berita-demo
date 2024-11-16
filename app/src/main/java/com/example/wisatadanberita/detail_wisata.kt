package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.wisatadanberita.databinding.ActivityDetailWisataBinding

class detail_wisata : AppCompatActivity() {
    private lateinit var bind : ActivityDetailWisataBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailWisataBinding.inflate(layoutInflater)
        setContentView(bind.root)




        var j : String? = intent.getStringExtra("JUDUL")
        var I : String? = intent.getStringExtra("isi")
        var tiket : String? = intent.getStringExtra("tiket")
        var lokasi : String? = intent.getStringExtra("lokasi")

        Glide.with(this)
            .load("https://yyyz.000webhostapp.com/CI_Sekolah-master/assets/upload/${intent.getStringExtra("gambar")}")
            .into(bind.gmbar)


        bind.juduul.setText(j)
        bind.textView24.setText(tiket)
        bind.tvJustifiedParagraph.setText(I)
        bind.textView25.setText(lokasi)


    }
}