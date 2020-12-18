package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpFive extends AppCompatActivity {

    WebView rcpFive;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_five);

        rcpFive = findViewById(R.id.rcpFive);

        rcpFive.loadUrl("file:///android_asset/rcp5.html");

        rcpFive.getSettings().setJavaScriptEnabled(true);

        rcpFive.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpFive.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpFive.loadUrl("file:///android_asset/rcp5.html");
                return false;
            }
        });

    }
}
