package com.example.myintent

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class heroDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_hero_detail)

        val heroTextView = findViewById<TextView>(R.id.txtHeroName)
        val heroName = intent.getStringExtra("Hero_Name")
        heroTextView.text = heroName

        val imgHero = findViewById<ImageView>(R.id.imgHero)

        val heroDetail = when (heroName) {
            "Spiderman" -> R.drawable.spiderman
            "Batman" -> R.drawable.batman
            "Superman" -> R.drawable.superman
            else -> R.drawable.lastikman
        }

        imgHero.setImageResource(heroDetail)
    }
}