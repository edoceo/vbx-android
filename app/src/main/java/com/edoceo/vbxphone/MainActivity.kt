package com.edoceo.vbxphone

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.Manifest
import android.content.pm.PackageManager
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import com.edoceo.vbxphone.VBXWebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Microphone?
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.RECORD_AUDIO), 1)

        }

        // https://developer.android.com/guide/webapps/webview
        this.webView.settings.javaScriptEnabled = true
        this.webView.webViewClient = VBXWebViewClient()

        this.webView.loadUrl("http://vbx.io/");

        this.button01.setOnClickListener {
            this.webView.loadUrl("http://vbx.io/auth/open");
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

        this.button02.setOnClickListener {
            // this.webView.loadUrl("http://vbx.io/auth/sign-in");
            //Toast.makeText(this@MainActivity, "You clicked me.", Toast.LENGTH_SHORT).show()
        }

    }
}
