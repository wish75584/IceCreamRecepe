package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpSixteen extends AppCompatActivity {


    WebView rcpSxiteen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_sixteen);

        rcpSxiteen = findViewById(R.id.rcpSixteen);

        rcpSxiteen.loadUrl("file:///android_asset/rcp16.html");

        rcpSxiteen.getSettings().setJavaScriptEnabled(true);

        rcpSxiteen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpSxiteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpSxiteen.loadUrl("file:///android_asset/rcp16.html");
                return false;
            }
        });

    }
    }

