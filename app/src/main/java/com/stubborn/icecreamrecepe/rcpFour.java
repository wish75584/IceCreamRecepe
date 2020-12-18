package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpFour extends AppCompatActivity {

    WebView rcpFour;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_four);
        rcpFour = findViewById(R.id.rcpFour);

        rcpFour.loadUrl("file:///android_asset/rcp4.html");

        rcpFour.getSettings().setJavaScriptEnabled(true);

        rcpFour.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpFour.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpFour.loadUrl("file:///android_asset/rcp4.html");
                return false;
            }
        });

    }

    }

