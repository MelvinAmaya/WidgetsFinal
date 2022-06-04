package com.example.widgetsfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 : Button = findViewById(R.id.btnIr)
        val boton2 : Button = findViewById(R.id.btnIr2)

        boton1.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }

        boton2.setOnClickListener {
            val i = Intent(this,MainActivity3::class.java)
            startActivity(i)
        }

    }
}