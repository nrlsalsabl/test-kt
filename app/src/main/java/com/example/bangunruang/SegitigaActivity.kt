package com.example.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SegitigaActivity : AppCompatActivity() {
    lateinit var ed_a : EditText
    lateinit var ed_b : EditText
    lateinit var ed_c : EditText
    lateinit var hasil : TextView
    lateinit var btnhitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        btnhitung = findViewById(R.id.btnhitung)
        hasil = findViewById(R.id.hasill)
        ed_a = findViewById(R.id.ed_a)
        ed_b = findViewById(R.id.ed_b)
        ed_c = findViewById(R.id.ed_c)

        btnhitung.setOnClickListener { it
            var a : Int = Integer.parseInt(ed_a.text.toString())
            var b : Int = Integer.parseInt(ed_b.text.toString())
            var c : Int = Integer.parseInt(ed_c.text.toString())

            var rumus : Int = a+b+c
            hasil.text = rumus.toString()
        }
    }
}