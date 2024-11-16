package com.example.wisatadanberita

import android.app.ProgressDialog
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wisatadanberita.databinding.ActivityDetailWisataBinding
import com.example.wisatadanberita.databinding.ActivitySignUpBinding
import com.example.wisatadanberita.datas.ResponseRegist
import com.example.wisatadanberita.network.api
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class sign_up : AppCompatActivity() {

    private lateinit var bind : ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(bind.root)



        bind.but2.setOnClickListener {
            simpan(
                bind.email.text.toString(),
                bind.usr.text.toString(),
                bind.ps.text.toString()


                )
        }
    }

    private fun simpan(
        email: String,
        nama: String,
        password: String

    ) {
        val shared: shared = shared(this)
        val progressdialog = ProgressDialog(this)
        progressdialog.setMessage("Sedang Diproses")
        progressdialog.setCancelable(true)
        progressdialog.show()
            api.getService()!!
            .tambah(
                email,
                nama,
                password,

            )
            .enqueue(object : Callback<ResponseRegist> {
                override fun onFailure(call: Call<ResponseRegist>, t: Throwable) {


                }

                override fun onResponse(
                    call: Call<ResponseRegist>,
                    response: Response<ResponseRegist>
                ) {
                    if (response.isSuccessful) {
                        shared.save("eml", bind.email.text.toString())
                        shared.save("nma", bind.usr.text.toString())

                        shared.save("sts_regis", true)
                        startActivity(
                            Intent(this@sign_up, mainnn::class.java)
                                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)

                        )

                        Toast.makeText(
                            applicationContext,
                            "Berhasil Daftar Akun",
                            Toast.LENGTH_SHORT
                        )
                            .show()
                    } else {

                    }
                }

            })
    }
}