package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpTwelve extends AppCompatActivity {

    WebView rcpTwelve;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_twelve);

        rcpTwelve = findViewById(R.id.rcpTwelve);

        rcpTwelve.loadUrl("file:///android_asset/rcp12.html");

        rcpTwelve.getSettings().setJavaScriptEnabled(true);

        rcpTwelve.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpTwelve.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpTwelve.loadUrl("file:///android_asset/rcp12.html");
                return false;
            }
        });

    }
    }

