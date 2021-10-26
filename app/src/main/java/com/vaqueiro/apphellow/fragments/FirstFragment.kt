package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.FragmentFirstBinding

class FirstFragment : Fragment(R.layout.fragment_first) {

    //IMPLEMENTACION DE BINDING CON FRAGMENTS
    private var _binding:FragmentFirstBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //IMPLEMENTACION DE BINDING
        binding.btnFragment2.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view,SecondFragment())
            }
        }

        /*
        FORMA TRADICIONAL
        btnFragment2 = view.findViewById(R.id.btn_fragment2)
        btnFragment2.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view,SecondFragment())
            }
        }*/
    }

}