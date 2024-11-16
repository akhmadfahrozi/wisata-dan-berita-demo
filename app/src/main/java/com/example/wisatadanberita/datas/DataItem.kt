package com.example.wisatadanberita.datas

import com.google.gson.annotations.SerializedName

data class DataItem(

    @field:SerializedName("id_kategori")
    val idKategori: String? = null,

    @field:SerializedName("tiket")
    val tiket: String? = null,

    @field:SerializedName("judul")
    val judul: String? = null,

    @field:SerializedName("gambar")
    val gambar: String? = null,

    @field:SerializedName("isi")
    val isi: String? = null,

    @field:SerializedName("tgl_terbit")
    val tgl_terbit: String? = null,

    @field:SerializedName("lokasi")
    val lokasi: String? = null
)