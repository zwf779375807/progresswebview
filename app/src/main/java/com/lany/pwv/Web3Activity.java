package com.lany.pwv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Web3Activity extends AppCompatActivity {

    private ProgressWebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web3);
        webView = (ProgressWebView) findViewById(R.id.baseweb_webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.baidu.com");
    }
}
