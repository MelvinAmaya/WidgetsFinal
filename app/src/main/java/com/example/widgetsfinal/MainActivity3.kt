package com.example.widgetsfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity3 : AppCompatActivity() {
    private var navegador: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        navegador = findViewById(R.id.NavegadorWeb)
        cargarNotas()
    }
    fun cargarNotas(){
        navegador?.webChromeClient = object : WebChromeClient(){
        }
        navegador?.webViewClient = object : WebViewClient(){
        }
        navegador?.clearCache(false)
        navegador?.settings?.javaScriptEnabled
        navegador?.loadUrl("https://estudiantes.ugb.edu.sv/Notas")
    }
}