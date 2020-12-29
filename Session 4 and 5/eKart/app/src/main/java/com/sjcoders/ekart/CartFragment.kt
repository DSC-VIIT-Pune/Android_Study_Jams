package com.sjcoders.ekart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sjcoders.ekart.databinding.FragmentCartBinding
import com.sjcoders.ekart.databinding.FragmentDefaultBinding

class CartFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentCartBinding>(inflater,R.layout.fragment_cart,container,false)

        return binding.root
    }


}