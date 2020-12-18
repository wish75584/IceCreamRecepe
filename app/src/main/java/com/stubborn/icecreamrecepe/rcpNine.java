package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpNine extends AppCompatActivity {

    WebView rcpNine;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_nine);

        rcpNine = findViewById(R.id.rcpNine);

        rcpNine.loadUrl("file:///android_asset/rcp9.html");

        rcpNine.getSettings().setJavaScriptEnabled(true);

        rcpNine.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpNine.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpNine.loadUrl("file:///android_asset/rcp9.html");
                return false;
            }
        });

    }
}
