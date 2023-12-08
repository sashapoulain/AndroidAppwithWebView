package com.example.webviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {


    WebView webapp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect();
        download();
        webapp.setWebViewClient(new WebViewClient());
    }

    public void connect(){
        webapp = findViewById(R.id.webapp);
    }

    public void download(){
        webapp.loadUrl("https://github.com/sashapoulain");
        webapp.getSettings().setJavaScriptEnabled(true);
    }
}