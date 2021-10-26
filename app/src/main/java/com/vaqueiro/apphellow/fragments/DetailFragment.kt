package com.vaqueiro.apphellow.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.FragmentDetailBinding
import com.vaqueiro.apphellow.databinding.FragmentMainBinding

class DetailFragment : Fragment(R.layout.fragment_detail) {

    private var nombre:String? =""
    val args:DetailFragmentArgs by navArgs() //Delegation

    //IMPLEMENTACION DE BINDING CON FRAGMENTS
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDetailBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //arguments?.let {  bundle -> nombre = bundle.getString("nombre")  }
        //Toast.makeText(this.activity,nombre,Toast.LENGTH_LONG).show()

        nombre = args.nombre
        Toast.makeText(this.activity,nombre,Toast.LENGTH_SHORT).show()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}