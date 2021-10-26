package com.vaqueiro.apphellow.activities

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.vaqueiro.apphellow.R
import com.vaqueiro.apphellow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //IMPLEMENTACION DE BINDING
    private lateinit var binding: ActivityMainBinding

    /*private lateinit var btnSayHello: Button
    private lateinit var btnSayHello2: Button
    private lateinit var btnShowToolbar: Button
    private lateinit var btnShowFragments: Button
    private lateinit var btnShowFragments2: Button
    private lateinit var txtLabel: TextView
    private lateinit var editName: EditText*/
    private val TAG = "TEST"
    private val TAG2 = "CICLO"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*btnSayHello = findViewById(R.id.btn_say_hello)
        btnSayHello2 = findViewById(R.id.btn_say_hello2)
        btnShowToolbar = findViewById(R.id.btn_toolbar)
        btnShowFragments = findViewById(R.id.btn_fragments)
        btnShowFragments2 = findViewById(R.id.btnFragments2)
        txtLabel = findViewById(R.id.txt_label)
        editName = findViewById(R.id.edit_name)*/

        //IMPLEMENTACION DE VIEW_BINDING
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSayHello.setOnClickListener{
            val name = binding.editName.text.toString()
            sayHello(name)
        }
        binding.btnSayHello2.setOnClickListener{
            val name = binding.editName.text.toString()
            var intent = Intent(this,HelloActivity::class.java)
            intent.putExtra("name",name)
            //startActivity(intent)
            startActivityForResult(intent,1)
        }
        binding.btnToolbar.setOnClickListener{
            var intent = Intent(this,ToolbarActivity::class.java)
            startActivity(intent)
        }

        binding.btnFragments.setOnClickListener{
            var intent = Intent(this,FragmentsActivity::class.java)
            startActivity(intent)
        }

        binding.btnFragments2.setOnClickListener{
            var intent = Intent(this,Fragments2Activity::class.java)
            startActivity(intent)
        }

        Log.d(TAG,"THIS IS FOR DEBBUGING")
        Log.w(TAG,"THIS IS FOR WARNING")
        Log.e(TAG,"THIS IS FOR ERROR")
        Log.i(TAG,"THIS IS FOR INFO")

        Log.d(TAG2, "onCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG2, "onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG2, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG2, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG2, "onStop")
    }

    override fun onRestart(){
        super.onRestart()
        Log.d(TAG2, "onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG2, "onDestroy")
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == 1 && resultCode == Activity.RESULT_OK){
            val variable = data?.getStringExtra("valor1")
            Toast.makeText(this, "$variable", Toast.LENGTH_LONG).show()
        }
    }

    fun sayHello(name:String){
        var hello = getString(R.string.hello)
        binding.txtLabel.text = "Hola $name"
    }
}