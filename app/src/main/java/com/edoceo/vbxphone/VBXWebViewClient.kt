/**
 * Override WebViewClient
 */

package com.edoceo.vbxphone

import android.webkit.WebView
import android.webkit.WebViewClient

class VBXWebViewClient : WebViewClient() {

    override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
//        if (Uri.parse(url).host == "www.example.com") {
//            // This is my web site, so do not override; let my WebView load the page
//            return false
//        }
//        // Otherwise, the link is not for a page on my site, so launch another Activity that handles URLs
//        Intent(Intent.ACTION_VIEW, Uri.parse(url)).apply {
//            startActivity(this)
//        }
        return false
    }
}
