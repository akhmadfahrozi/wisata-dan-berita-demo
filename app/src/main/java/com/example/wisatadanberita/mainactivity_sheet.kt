package com.example.wisatadanberita

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wisatadanberita.databinding.ActivityListBeritaBinding
import com.example.wisatadanberita.databinding.ActivityMainsheetBinding
import com.example.wisatadanberita.datas.DataItem
import com.example.wisatadanberita.datas.ResponseBerita
import com.example.wisatadanberita.datas.SheetResponse
import com.example.wisatadanberita.datas.SheetResponseItem
import com.example.wisatadanberita.network.api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class mainactivity_sheet : AppCompatActivity() {

    private var data: List<SheetResponseItem> = mutableListOf()
    private var adapter: adaptersheet? = null

    private lateinit var bind  : ActivityMainsheetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bind = ActivityMainsheetBinding.inflate(layoutInflater)
        setContentView(bind.root)
        loadData()
    }

    private fun loadData() {
        api.getService()?.getshet()
            ?.enqueue(object : Callback<SheetResponse> {
                override fun onFailure(call: Call<SheetResponse>, t: Throwable) {
                }

                override fun onResponse(
                    call: Call<SheetResponse>,
                    response: Response<SheetResponse>
                ) {
                    if (response.isSuccessful) {
                        data = response.body()?.sheetResponse!!

                        adapter = adaptersheet(data)
                        val linearLayoutManager =
                            LinearLayoutManager(this@list_berita, LinearLayoutManager.VERTICAL, false)
                        bind.rcberita.setLayoutManager(linearLayoutManager)
                        bind.rcberita.setAdapter(adapter);

                    }

                }
            })

    }
}