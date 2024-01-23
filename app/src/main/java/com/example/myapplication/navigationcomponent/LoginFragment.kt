package com.example.myapplication.navigationcomponent

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.navigation.findNavController
import com.example.myapplication.navigationcomponent.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentLoginBinding.inflate(inflater,container,false)
        binding.btnlogin.setOnClickListener {
            if(!TextUtils.isEmpty(binding.etUsername.text.toString())){
                var bundle=Bundle()
                bundle.putString("user_input",binding.etUsername.text.toString())
                it.findNavController().navigate(R.id.action_loginFragment_to_homeFragment,bundle)
            }
            else{
                Toast.makeText(context,"Please insert username", Toast.LENGTH_LONG).show()
            }
        }

       return  binding.root

    }

}