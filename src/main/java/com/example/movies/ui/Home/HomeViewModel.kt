package com.example.movies.ui.Home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.movies.data.api.ApiManger
import com.example.movies.ui.base.BaseViewModel
import com.example.movies.data.api.model.PopularMovieResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeViewModel: BaseViewModel() {
    private val apiService = ApiManger.getApi()
    private val _imageUrls = MutableLiveData<List<String>?>()
    val imageUrls: MutableLiveData<List<String>?> = _imageUrls

    fun fetchPopularMovies() {
        val call = apiService?.getPopularMovies()?.enqueue(object : Callback<PopularMovieResponse> {
            override fun onResponse(
                call: Call<PopularMovieResponse>,
                response: Response<PopularMovieResponse>
            ) {
                if (response.isSuccessful) {
                    val popularMovies = response.body()?.results
                    val profilePaths = popularMovies?.mapNotNull { it.profile_path }
                    _imageUrls.value = profilePaths
                    Log.e("succes", "salma")
                }else{
                    Log.e("succes", "salma")
                }
            }

            override fun onFailure(call: Call<PopularMovieResponse>, t: Throwable) {
               Log.e("failure", t.message.toString())
            }
        })
    }
}