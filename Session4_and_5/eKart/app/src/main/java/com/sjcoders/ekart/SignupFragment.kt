package com.sjcoders.ekart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sjcoders.ekart.databinding.FragmentLoginBinding
import com.sjcoders.ekart.databinding.FragmentSignupBinding

class SignupFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val binding = DataBindingUtil.inflate<FragmentSignupBinding>(inflater,R.layout.fragment_signup,container,false)

        binding.signupButton.setOnClickListener { view:View ->

            val username = binding.editTextUserName.text.toString()
            val password = binding.editTextTextPassword.text.toString()

            view.findNavController().navigate(SignupFragmentDirections.actionSignupFragmentToLoginFragment(username, password))

        }

        return binding.root

    }

}