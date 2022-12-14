package com.example.homework4anarbekuulunursultan.network

import com.example.homework4anarbekuulunursultan.network.LoveApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitService {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://love-calculator.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val api: LoveApi = retrofit.create(LoveApi::class.java)
}