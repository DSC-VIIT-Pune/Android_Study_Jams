package com.sjcoders.ekart

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.sjcoders.ekart.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater,R.layout.fragment_login,container,false)

        binding.textViewCreateAccount.setOnClickListener { view:View ->

            view.findNavController().navigate(R.id.action_loginFragment_to_signupFragment)

        }


        binding.btnLogin.setOnClickListener { view:View ->

            view.findNavController().popBackStack()

            val intent = Intent(context,HomeActivity::class.java)
            startActivity(intent)

        }

        val args = LoginFragmentArgs.fromBundle(requireArguments())

        binding.editTextUserName.setText(args.username)
        binding.editTextTextPassword.setText(args.password)

        return binding.root
    }


}