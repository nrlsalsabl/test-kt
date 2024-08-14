package com.example.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class PersegiPjgActivity : AppCompatActivity() {
    lateinit var ed_panjang : EditText
    lateinit var ed_lebar : EditText
    lateinit var hasil : TextView
    lateinit var btnhitung : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_pjg)

        btnhitung = findViewById(R.id.btnhitung)
        ed_panjang = findViewById(R.id.ed_panjang)
        ed_lebar = findViewById(R.id.ed_lebar)
        hasil = findViewById(R.id.hasill)

        btnhitung.setOnClickListener { it
        var lebar : Int = Integer.parseInt(ed_lebar.text.toString())
            var panjang : Int = Integer.parseInt(ed_panjang.text.toString())
            var rumus : Int = 2 * panjang+lebar
            hasil.text = rumus.toString()
        }
    }
}