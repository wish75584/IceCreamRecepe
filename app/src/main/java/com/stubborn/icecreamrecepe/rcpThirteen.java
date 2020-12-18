package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpThirteen extends AppCompatActivity {

    WebView rcpThirteen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_thirteen);

        rcpThirteen = findViewById(R.id.rcpThirteen);

        rcpThirteen.loadUrl("file:///android_asset/rcp13.html");

        rcpThirteen.getSettings().setJavaScriptEnabled(true);

        rcpThirteen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpThirteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpThirteen.loadUrl("file:///android_asset/rcp13.html");
                return false;
            }
        });
    }
}
