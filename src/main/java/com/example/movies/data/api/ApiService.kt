package com.example.movies.data.api
import com.example.movies.data.api.model.MovieDetailsResponse
import com.example.movies.data.api.model.PopularMovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("movie/popular")
    fun getPopularMovies(): Call<PopularMovieResponse>
    @GET("movie/latest")
    fun getLatestMovies(): Call<PopularMovieResponse>
    @GET("movie/top_rated")
    fun getTopRatedMovies(): Call<PopularMovieResponse>
    @GET("movie/{movie_id}")
    fun getMovieDetails(@Path("movie_id") movieId: Int): Call<MovieDetailsResponse>
   @GET("movie/{movie_id}/similar")
   fun getSimilarMovies(@Path("movie_id") movieId: Int): Call<PopularMovieResponse>

    @GET("search/movie")
    fun searchMovies(@Query("query") query: String): Call<PopularMovieResponse>

    @GET("genre/movie/list")
    fun getGenreCategories(@Query("api_key") apiKey: String): Call<PopularMovieResponse>
}