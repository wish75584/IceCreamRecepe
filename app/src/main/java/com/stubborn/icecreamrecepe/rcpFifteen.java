package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpFifteen extends AppCompatActivity {

    WebView rcpFifteen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_fifteen);


        rcpFifteen = findViewById(R.id.rcpFifteen);

        rcpFifteen.loadUrl("file:///android_asset/rcp15.html");

        rcpFifteen.getSettings().setJavaScriptEnabled(true);

        rcpFifteen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpFifteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpFifteen.loadUrl("file:///android_asset/rcp15.html");
                return false;
            }
        });

    }
}
