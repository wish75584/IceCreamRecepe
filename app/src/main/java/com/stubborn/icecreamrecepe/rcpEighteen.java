package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpEighteen extends AppCompatActivity {

    WebView rcpEighteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_eighteen);

        rcpEighteen = findViewById(R.id.rcpEighteen);

        rcpEighteen.loadUrl("file:///android_asset/rcp18.html");

        rcpEighteen.getSettings().setJavaScriptEnabled(true);

        rcpEighteen.setWebViewClient(new WebViewClient() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpEighteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpEighteen.loadUrl("file:///android_asset/rcp18.html");
                return false;
            }
        });

    }
}

