package com.websarva.wings.android.vulndeeplink_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.widget.Toast

class WebViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web_view)

        // ディープリンクとWebViewを使用した脆弱性でコメントアウトしてください。
       /* val webView = findViewById<WebView>(R.id.webView)
        val uri = intent.data
        val query = uri?.getQueryParameter("data")
        webView.loadUrl(query!!)*/
    }
}