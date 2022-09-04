package com.example.homework4anarbekuulunursultan

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.homework4anarbekuulunursultan.network.LoveModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Repository {
    fun getLoveModel(firstName: String, secondName:String):MutableLiveData<LoveModel>{
   val mutableLoveModel : MutableLiveData<LoveModel> =MutableLiveData()

        App.api.calculate(firstName= firstName, secondName=secondName).enqueue(object :Callback<LoveModel>{
            override fun onResponse(call: Call<LoveModel>, response: Response<LoveModel>) {
                if (response.isSuccessful){
             val loveModel=response.body()
                }
            }

            override fun onFailure(call: Call<LoveModel>, t: Throwable) {

            }

        })

return mutableLoveModel

    }
}




