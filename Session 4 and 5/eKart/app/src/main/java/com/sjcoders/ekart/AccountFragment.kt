package com.sjcoders.ekart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.sjcoders.ekart.databinding.FragmentAccountBinding
import com.sjcoders.ekart.databinding.FragmentDefaultBinding


class AccountFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentAccountBinding>(inflater,R.layout.fragment_account,container,false)

        return binding.root
    }


}