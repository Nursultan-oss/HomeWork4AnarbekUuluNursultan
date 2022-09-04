package com.example.homework4anarbekuulunursultan

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.homework4anarbekuulunursultan.network.LoveModel

class LoveViewModel:ViewModel (){
    lateinit var loveLiveData:LiveData<LoveModel>
private val repository=Repository ()
    fun fillLoveModel(firstName:String, secondName:String){
        loveLiveData=repository.getLoveModel(firstName, secondName )
    }
}