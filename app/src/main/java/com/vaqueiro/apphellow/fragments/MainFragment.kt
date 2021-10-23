package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.vaqueiro.apphellow.R

class MainFragment : Fragment(R.layout.fragment_main) {
    // TODO: Rename and change types of parameters
    private lateinit var btnDetail:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnDetail = view.findViewById(R.id.btn_fragment_detail)

        var nombre = "TOKEN VALIDO"

        btnDetail.setOnClickListener{

            /*findNavController().navigate(R.id.action_mainFragment_to_detailFragment, bundleOf(
                "nombre" to nombre
            ))*/

            val action = MainFragmentDirections.actionMainFragmentToDetailFragment()
            action.nombre = nombre
            findNavController().navigate(action)
        }

    }
}