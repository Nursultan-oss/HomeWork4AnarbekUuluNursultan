package com.example.homework4anarbekuulunursultan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.homework4anarbekuulunursultan.databinding.FragmentSecondBinding
import com.example.homework4anarbekuulunursultan.network.LoveModel
import java.util.zip.Inflater

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentSecondBinding.inflate(layoutInflater)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


       bundle()
        listener()
    }


    private fun bundle() {
       val loveModel:LoveModel=arguments?.getSerializable("key")as LoveModel
        with(binding){
            textView1.text=loveModel.firstName
            textView2.text=loveModel.secondName
            textView3.text=loveModel.percentage
            textView4.text=loveModel.result
        }
    }

    private fun listener() {
     binding.btnTry.setOnClickListener{
         findNavController().navigateUp()
     }
    }


}