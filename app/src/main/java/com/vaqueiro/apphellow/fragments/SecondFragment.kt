package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.FragmentDetailBinding
import com.vaqueiro.apphellow.databinding.FragmentSecondBinding

class SecondFragment : Fragment(R.layout.fragment_second) {

    //IMPLEMENTACION DE BINDING CON FRAGMENTS
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

}