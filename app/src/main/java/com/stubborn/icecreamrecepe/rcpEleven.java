package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpEleven extends AppCompatActivity {

    WebView rcpEleven;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_eleven);

        rcpEleven = findViewById(R.id.rcpEleven);

        rcpEleven.loadUrl("file:///android_asset/rcp11.html");

        rcpEleven.getSettings().setJavaScriptEnabled(true);

        rcpEleven.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpEleven.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpEleven.loadUrl("file:///android_asset/rcp11.html");
                return false;
            }
        });

    }
}
