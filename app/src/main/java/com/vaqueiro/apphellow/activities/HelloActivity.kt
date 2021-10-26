package com.vaqueiro.apphellow.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.ActivityHelloBinding
import com.vaqueiro.apphellow.databinding.ActivityMainBinding

class HelloActivity : AppCompatActivity() {

    //IMPLEMENTACION DE BINDING
    private lateinit var binding: ActivityHelloBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello)

        binding = ActivityHelloBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        var hello = getString(R.string.hello)
        binding.txtName.text = "$hello $name"

        binding.btnBack.setOnClickListener{
            finish()
        }

        binding.btnBackReturn.setOnClickListener{
            var intent = Intent()
            intent.putExtra("valor1","Test1")
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}