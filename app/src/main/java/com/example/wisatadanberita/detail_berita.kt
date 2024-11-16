package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.wisatadanberita.databinding.ActivityDetailBeritaBinding
import com.example.wisatadanberita.databinding.ActivityDetailWisataBinding

class detail_berita : AppCompatActivity() {
    private lateinit var bind : ActivityDetailBeritaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityDetailBeritaBinding.inflate(layoutInflater)
        setContentView(bind.root)




        var j : String? = intent.getStringExtra("JUDUL berita")
        var I : String? = intent.getStringExtra("isi berita")
        var tgl : String? = intent.getStringExtra("tgl")


        Glide.with(this)
            .load("https://yyyz.000webhostapp.com/CI_Sekolah-master/assets/upload/${intent.getStringExtra("gambar berita")}")
            .into(bind.gmbar)


        bind.textView20.setText(j)
        bind.textView21.setText(tgl)
        bind.tvJustifiedParagraph.setText(I)



    }
}