package com.example.webview;

import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyBrowser extends WebViewClient {
    public boolean shouldOverrideUrlLoadung(WebView view,String url){
         view.loadUrl(url);
        return true;
    }
}
