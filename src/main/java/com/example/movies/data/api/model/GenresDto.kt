package com.example.movies.data.api.model

import com.google.gson.annotations.SerializedName

data class GenresDto(

	@field:SerializedName("genres")
	val genres: List<GenresItem?>? = null
){
	data class GenresItem(

		@field:SerializedName("name")
		val name: String? = null,

		@field:SerializedName("id")
		val id: Int? = null
	)
}


