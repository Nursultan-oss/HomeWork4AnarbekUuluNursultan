package com.example.homework4anarbekuulunursultan

import android.app.Application
import com.example.homework4anarbekuulunursultan.network.LoveApi
import com.example.homework4anarbekuulunursultan.network.RetrofitService

class App: Application() {
    companion object{
        lateinit var api: LoveApi
    }

    override fun onCreate() {
        super.onCreate()
        val retrofitService= RetrofitService()
        api = retrofitService.api
    }


}

