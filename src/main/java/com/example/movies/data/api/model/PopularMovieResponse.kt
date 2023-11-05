package com.example.movies.data.api.model

data class PopularMovieResponse(
    val page: Int,
    val results: List<Result>,
    val total_pages: Int,
    val total_results: Int
)