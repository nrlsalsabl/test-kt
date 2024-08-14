package com.example.bangunruang

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnPersegi : Button
    lateinit var btnPersegiPjg : Button
    lateinit var btnJajarGjg : Button
    lateinit var btnSegitiga : Button
    lateinit var btnBelahketupat : Button
    lateinit var btnLayangLayang : Button
    lateinit var btnTrapesium : Button
    lateinit var btnLingkaran : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPersegi = findViewById(R.id.btnpersegi)
        btnPersegiPjg = findViewById(R.id.btnpersegiPjg)
        btnJajarGjg = findViewById(R.id.btnJajarGjg)
        btnSegitiga = findViewById(R.id.btnsegitiga)
        btnBelahketupat = findViewById(R.id.btnbelahKt)
        btnLayangLayang = findViewById(R.id.btnLayang)
        btnTrapesium = findViewById(R.id.btntrapesium)
        btnLingkaran = findViewById(R.id.btnlingkaran)

        btnPersegi.setOnClickListener {it
            var intent = Intent(this, PersegiActivity::class.java)
            startActivity(intent)
        }
        btnPersegiPjg.setOnClickListener { it
        var intent = Intent(this, PersegiPjgActivity::class.java)
            startActivity(intent)
        }
        btnJajarGjg.setOnClickListener { it
        var intent = Intent(this, JajarGjgActivity::class.java)
            startActivity(intent)
        }
        btnSegitiga.setOnClickListener { it
        var intent = Intent(this, SegitigaActivity::class.java)
            startActivity(intent)
        }
        btnBelahketupat.setOnClickListener { it
        var intent = Intent(this, BelahKetupatActivity::class.java)
            startActivity(intent)
        }
        btnLayangLayang.setOnClickListener { it
        var intent = Intent(this, LayangLayangActivity::class.java)
            startActivity(intent)
        }
        btnTrapesium.setOnClickListener { it
        var intent = Intent(this, TrapesiumActivity::class.java)
            startActivity(intent)
        }
        btnLingkaran.setOnClickListener { it
        var intent = Intent(this, LingkaranActivity::class.java)
            startActivity(intent)
        }
    }
}