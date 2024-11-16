package com.example.wisatadanberita.network

import com.example.wisatadanberita.datas.ResponseBerita
import com.example.wisatadanberita.datas.ResponseRegist
import com.example.wisatadanberita.datas.SheetResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface url {

//    @GET("v2/posts")
//    fun getfile(): Call<ArrayList<ResponseBeritaItem>>

    @GET("list?id_kategori=2")
    fun getberita(): Call<ResponseBerita>

    @GET("testing")
    fun getshet(): Call<SheetResponse>

    @GET("list?id_kategori=1")
    fun getwisata(): Call<ResponseBerita>
    @GET("daftar")
    fun tambah(
        @Query("email") email: String?,
        @Query("nama") nama: String?,
        @Query("password") password: String?
    )
            : Call<ResponseRegist>

}