package com.example.myintent

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val arrayAdapter: ArrayAdapter<String>
        val listHero = arrayOf("Spiderman", "Batman", "Superman", "Lastikman", "Ultraman", "Ken", "Saitama", "Naruto", "Luffy", "Goku")
        listView = findViewById(R.id.lvHero)
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,listHero)
        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            val selectedHero = listHero[position]

            val intent = Intent(this,heroDetail::class.java)
            intent.putExtra("Hero_Name", selectedHero)
            startActivity(intent)
        }

    }
}

