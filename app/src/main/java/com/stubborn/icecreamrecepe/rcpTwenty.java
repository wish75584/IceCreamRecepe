package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpTwenty extends AppCompatActivity {

    WebView rcpTwenty;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_twenty);
        rcpTwenty = findViewById(R.id.rcpTwenty);

        rcpTwenty.loadUrl("file:///android_asset/rcp20.html");

        rcpTwenty.getSettings().setJavaScriptEnabled(true);

        rcpTwenty.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpTwenty.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpTwenty.loadUrl("file:///android_asset/rcp20.html");
                return false;
            }
        });


    }
}
