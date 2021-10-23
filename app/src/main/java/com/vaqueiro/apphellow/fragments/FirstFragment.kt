package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.commit
import com.vaqueiro.apphellow.R

class FirstFragment : Fragment(R.layout.fragment_first) {

    private lateinit var btnFragment2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnFragment2 = view.findViewById(R.id.btn_fragment2)

        btnFragment2.setOnClickListener{
            requireActivity().supportFragmentManager.commit {
                replace(R.id.fragment_container_view,SecondFragment())
            }
        }
    }

}