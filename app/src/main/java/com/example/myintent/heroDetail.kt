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
            "Lastikman" -> R.drawable.lastikman
            "Goku" -> R.drawable.goku
            "Luffy" -> R.drawable.luffy
            "Saitama" -> R.drawable.saitama
            "Ken" -> R.drawable.ken
            "Naruto" -> R.drawable.naruto
            else -> R.drawable.ultraman
        }

        imgHero.setImageResource(heroDetail)

        val heroDescription = when (heroName) {
            "Spiderman" -> "Spiderman is a superhero appearing in American comic books published by Marvel Comics."
            "Batman" -> "Batman is a superhero appearing in American comic books published by DC Comics."
            "Superman" -> "Superman is a superhero appearing in American comic books published by DC Comics."
            "Lastikman" -> "Lastikman is a superhero appearing in Indonesian comic books."
            "Goku" -> "Goku is a character from the Dragon Ball manga and anime series created by Akira Toriyama."
            "Luffy" -> "Luffy is the main character of the One Piece manga and anime series created by Eiichiro Oda."
            "Saitama" -> "Saitama is bald"
            "Ken" -> "Ken is a character from the series of anime called Tokyo Ghoul."
            "Naruto" -> "Naruto is a character from the Naruto manga and anime series created by Masashi Kishimoto."
            else -> "Ultraman is a superhero appearing in Japanese tokusatsu television series."
        }
        val txtDescription = findViewById<TextView>(R.id.txtDescription)
        txtDescription.text = heroDescription
    }
}