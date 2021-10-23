package com.vaqueiro.apphellow.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.vaqueiro.apphellow.R
import androidx.fragment.app.commit
import com.vaqueiro.apphellow.fragments.FirstFragment
import com.vaqueiro.apphellow.fragments.SecondFragment

class FragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragments)

        val toolbar = findViewById<Toolbar>(R.id.toolbar_fragment)
        //setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_fragment1,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
            R.id.menu_item_fragment1 -> {
                supportFragmentManager.commit {
                    replace(R.id.fragment_container_view,FirstFragment())
                }
            }
            R.id.menu_item_fragment2 -> {
                supportFragmentManager.commit {
                    replace(R.id.fragment_container_view,SecondFragment())
                }
            }
        }
        return super.onOptionsItemSelected(item)
    }
}