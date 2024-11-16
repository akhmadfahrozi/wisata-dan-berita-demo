package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wisatadanberita.databinding.ActivityDetailWisataBinding
import com.example.wisatadanberita.databinding.ActivityListBeritaBinding
import com.example.wisatadanberita.datas.DataItem
import com.example.wisatadanberita.datas.ResponseBerita
import com.example.wisatadanberita.network.api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class list_berita : AppCompatActivity() {

    private var data: List<DataItem> = mutableListOf()
    private var adapter: adapter_berita? = null
    private lateinit var bind: ActivityListBeritaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityListBeritaBinding.inflate(layoutInflater)
        setContentView(bind.root)
        loadData()
    }
    private fun loadData() {
        api.getService()?.getberita()
            ?.enqueue(object : Callback<ResponseBerita> {
                override fun onFailure(call: Call<ResponseBerita>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<ResponseBerita>,
                    response: Response<ResponseBerita>
                ) {
                    if (response.isSuccessful) {
                        data = response.body()?.data!!

                        adapter = adapter_berita(data)
                        val linearLayoutManager =
                            LinearLayoutManager(this@list_berita, LinearLayoutManager.VERTICAL, false)
                        bind.rcberita.setLayoutManager(linearLayoutManager)
                        bind.rcberita.setAdapter(adapter);

                    }

                }
            })

    }
}