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
import com.example.myapplication.navigationcomponent.databinding.FragmentSignupBinding


class SignupFragment : Fragment() {
    private lateinit var binding: FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding=FragmentSignupBinding.inflate(inflater,container,false)
        binding.btnsignup.setOnClickListener {
           if(!TextUtils.isEmpty(binding.etUsername.text.toString())){
               var bundle=Bundle()
               bundle.putString("user_input",binding.etUsername.text.toString())
               it.findNavController().navigate(R.id.action_signupFragment_to_homeFragment,bundle)
           }
            else{
               Toast.makeText(context,"Please insert username",Toast.LENGTH_LONG).show()
           }

        }
        return  binding.root
    }
}