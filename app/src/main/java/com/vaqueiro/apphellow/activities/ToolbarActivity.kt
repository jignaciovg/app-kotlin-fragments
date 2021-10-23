package com.vaqueiro.apphellow.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.vaqueiro.apphellow.R

class ToolbarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_fragment)
        //setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.mymenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.item_1 -> Toast.makeText(this, "Item 1", Toast.LENGTH_SHORT).show()
            R.id.item_2 -> Toast.makeText(this, "Item 2", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}