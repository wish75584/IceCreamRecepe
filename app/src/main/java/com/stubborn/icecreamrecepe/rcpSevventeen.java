package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpSevventeen extends AppCompatActivity {

    WebView rcpSeventeen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_sevventeen);

        rcpSeventeen = findViewById(R.id.rcpSeventeen);

        rcpSeventeen.loadUrl("file:///android_asset/rcp17.html");

        rcpSeventeen.getSettings().setJavaScriptEnabled(true);

        rcpSeventeen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpSeventeen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpSeventeen.loadUrl("file:///android_asset/rcp17.html");
                return false;
            }
        });

    }
    }

