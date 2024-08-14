package com.example.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiActivity : AppCompatActivity() {
    lateinit var ed_sisi : EditText
    lateinit var hasil : TextView
    lateinit var btnhitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        btnhitung = findViewById(R.id.btnhitung)
        hasil = findViewById(R.id.hasill)
        ed_sisi = findViewById(R.id.ed_sisi)

        btnhitung.setOnClickListener { it
        var sisi :Int = Integer.parseInt(ed_sisi.text.toString())
            var rumus : Int = sisi*sisi*sisi*sisi
            hasil.text = rumus.toString()
        }

    }
}