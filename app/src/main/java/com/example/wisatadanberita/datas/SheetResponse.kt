package com.example.wisatadanberita.datas

import com.google.gson.annotations.SerializedName

data class SheetResponse(

	@field:SerializedName("SheetResponse")
	val sheetResponse: List<SheetResponseItem>? = null
)