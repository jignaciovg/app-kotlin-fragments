package com.vaqueiro.apphellow.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.ActivityFragments2Binding
import com.vaqueiro.apphellow.databinding.ActivityHelloBinding

class Fragments2Activity : AppCompatActivity() {

    //IMPLEMENTACION DE BINDING
    private lateinit var binding: ActivityFragments2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments2)

        binding = ActivityFragments2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}