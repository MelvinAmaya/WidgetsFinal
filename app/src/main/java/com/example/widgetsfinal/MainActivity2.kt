package com.example.widgetsfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity2 : AppCompatActivity() {
    private var navegadorCanvas: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        navegadorCanvas=findViewById(R.id.navegadorCanvas)

        cargarcanvas()
    }
    fun cargarcanvas(){
        navegadorCanvas?.webChromeClient = object : WebChromeClient(){
        }
        navegadorCanvas?.webViewClient = object : WebViewClient(){
        }
        navegadorCanvas?.clearCache(false)
        navegadorCanvas?.settings?.javaScriptEnabled
        navegadorCanvas?.loadUrl("https://ugb.instructure.com/")
    }
}