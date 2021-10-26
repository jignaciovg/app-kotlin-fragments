package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.navigation.fragment.findNavController
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.FragmentFirstBinding
import com.vaqueiro.apphellow.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main) {

    //IMPLEMENTACION DE BINDING CON FRAGMENTS
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var nombre = "TOKEN VALIDO"
        //IMPLEMENTACION DE BINDING
        binding.btnFragmentDetail.setOnClickListener{
            val action = MainFragmentDirections.actionMainFragmentToDetailFragment()
            action.nombre = nombre
            findNavController().navigate(action)
            }
        }
    }
