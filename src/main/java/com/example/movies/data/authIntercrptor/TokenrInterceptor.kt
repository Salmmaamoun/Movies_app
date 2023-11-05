package com.example.movies.data.authIntercrptor

import okhttp3.Interceptor
import okhttp3.Response

class TokenrInterceptor:Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val newHeader = chain.request().newBuilder()
            .header("Authorization","Bearer  $TOKEN")
        return chain.proceed(newHeader.build())
    }
    companion object{
        private const val TOKEN = "eyJhbGciOiJIUzI1NiJ9.eyJhdWQiOiJlMjJjODQxNDNjMjYyNTM0MDA3OWY5MDY3MTZmZDNhOSIsInN1YiI6IjYzZjc4ODU5NDZmMzU0MDA3Y2Y5ODJmNSIsInNjb3BlcyI6WyJhcGlfcmVhZCJdLCJ2ZXJzaW9uIjoxfQ.qWEkYZsy5CUwQHlEv1wqX_vd_QU2hGq2HC4OOuYE_gc"
    }
}