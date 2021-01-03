package com.sjcoders.ekart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sjcoders.ekart.SignupFragmentDirections.actionSignupFragmentToLoginFragment
import com.sjcoders.ekart.databinding.FragmentWelcomeBinding

class WelcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentWelcomeBinding>(inflater,R.layout.fragment_welcome,container,false)

        binding.btnLogin.setOnClickListener { view:View->

            view.findNavController().navigate(WelcomeFragmentDirections.actionWelcomeFragmentToLoginFragment("",""))

        }

        binding.btnSignup.setOnClickListener { view:View->

            view.findNavController().navigate(R.id.action_welcomeFragment_to_signupFragment)

        }


        return binding.root
    }


}