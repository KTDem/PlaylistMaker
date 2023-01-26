package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class CollectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_collection)
        val btnGetBack = findViewById<ImageView>(R.id.getBackArrow)
        btnGetBack.setOnClickListener {
            val getBackIntent = Intent(this, MainActivity::class.java)
            startActivity(getBackIntent)
        }

    }
}