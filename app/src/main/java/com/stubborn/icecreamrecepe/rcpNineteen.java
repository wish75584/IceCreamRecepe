package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpNineteen extends AppCompatActivity {

    WebView rcpNineteen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_nineteen);

        rcpNineteen = findViewById(R.id.rcpNineteen);

        rcpNineteen.loadUrl("file:///android_asset/rcp19.html");

        rcpNineteen.getSettings().setJavaScriptEnabled(true);

        rcpNineteen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpNineteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpNineteen.loadUrl("file:///android_asset/rcp19.html");
                return false;
            }
        });

    }

}
