package com.bmaexperiences.misterautotodolist.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object CallApi {

    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()

    val apiService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

}