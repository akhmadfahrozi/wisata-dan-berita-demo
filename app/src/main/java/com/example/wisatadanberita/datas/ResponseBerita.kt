package com.example.wisatadanberita.datas

import com.google.gson.annotations.SerializedName

public final data class ResponseBerita(

	@field:SerializedName("data")
	val data: List<DataItem>? = null
)