package com.example.bangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LingkaranActivity : AppCompatActivity() {
    private lateinit var ed_r: EditText
    private lateinit var hasil: TextView
    private lateinit var btnhitung: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lingkaran)

        btnhitung = findViewById(R.id.btnhitung)
        hasil = findViewById(R.id.hasil) // Ensure this ID matches your XML layout
        ed_r = findViewById(R.id.ed_r)

        btnhitung.setOnClickListener {
            val input = ed_r.text.toString()
            if (input.isNotEmpty()) {
                try {
                    val r = input.toDouble()
                    val rumus = 2 * Math.PI * r // Using Math.PI for precision
                    hasil.text = String.format("%.2f", rumus) // Format result to 2 decimal places
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Invalid input. Please enter a valid number.", Toast.LENGTH_SHORT).show()
                }
            } else {
                Toast.makeText(this, "Please enter a radius value.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
