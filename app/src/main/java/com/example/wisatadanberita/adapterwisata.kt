package com.example.wisatadanberita

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.wisatadanberita.datas.DataItem
import com.example.wisatadanberita.datas.ResponseBerita
import com.example.wisatadanberita.network.api

class adapterwisata(private val model: List<DataItem>) :
    RecyclerView.Adapter<adapterwisata.ViewHolder>() {
    private var ct: Context? = null
    override fun onBindViewHolder(holder: adapterwisata.ViewHolder, position: Int) {
        val data = model[position]
        holder.tv_judul.text = data.judul//nampilkan judul
        holder.lokasi.text = data.lokasi//nampilkan judul

        ct?.let {

            Glide.with(it)
                .load("https://yyyz.000webhostapp.com/CI_Sekolah-master/assets/upload/${data.gambar}")
                .into(holder.iv_gambar)
        }//menampilkan gambar


        holder.itemView.setOnClickListener {
            val I = Intent(holder.itemView.context, detail_wisata::class.java)
            I.putExtra("JUDUL", data.judul)
            I.putExtra("isi", data.isi)
            I.putExtra("lokasi", data.lokasi)
            I.putExtra("tiket", data.tiket)
            I.putExtra("gambar", data.gambar)
            holder.itemView.getContext().startActivity(I)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val L = LayoutInflater.from(parent.context)
        val V = L.inflate(R.layout.activity_adapterwisata, parent, false)
        ct = parent.context
        return ViewHolder(V)

    }

    override fun getItemCount(): Int {

        model.size <= 3
        return model.size

    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        internal var tv_judul: TextView = itemView.findViewById(R.id.textView16)
        internal var lokasi: TextView = itemView.findViewById(R.id.textView17)


        internal var iv_gambar: ImageView = itemView.findViewById(R.id.imageView4)
    }


}