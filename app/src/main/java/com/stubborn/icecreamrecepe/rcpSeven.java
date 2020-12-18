package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpSeven extends AppCompatActivity {

    WebView rcpSeven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_seven);

        rcpSeven = findViewById(R.id.rcpSeven);

        rcpSeven.loadUrl("file:///android_asset/rcp7.html");

        rcpSeven.getSettings().setJavaScriptEnabled(true);

        rcpSeven.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpSeven.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpSeven.loadUrl("file:///android_asset/rcp7.html");
                return false;
            }
        });

    }
}
