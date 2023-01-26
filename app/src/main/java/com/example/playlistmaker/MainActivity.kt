package com.example.playlistmaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnMainSearch = findViewById<Button>(R.id.main_search)
        btnMainSearch.setOnClickListener {
            val mainSearchIntent = Intent(this, SearchActivity::class.java)
            startActivity(mainSearchIntent)
        }

        val btnCollection = findViewById<Button>(R.id.main_collection)
        btnCollection.setOnClickListener {
            val mainCollectionIntent = Intent(this, CollectionActivity::class.java)
            startActivity(mainCollectionIntent)
        }

        val btnOptions = findViewById<Button>(R.id.main_settings)
        btnOptions.setOnClickListener {
            val optionsIntent = Intent(this, SettingsActivity::class.java)
            startActivity(optionsIntent)
        }
    }
}