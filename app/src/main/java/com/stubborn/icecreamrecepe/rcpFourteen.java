package com.stubborn.icecreamrecepe;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class rcpFourteen extends AppCompatActivity {

    WebView  rcpFourteen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcp_fourteen);

        rcpFourteen = findViewById(R.id.rcpFourteen);

        rcpFourteen.loadUrl("file:///android_asset/rcp14.html");

        rcpFourteen.getSettings().setJavaScriptEnabled(true);

        rcpFourteen.setWebViewClient(new WebViewClient(){
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                view.loadUrl(request.getUrl().toString());
                return false;
            }
        });

        rcpFourteen.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                rcpFourteen.loadUrl("file:///android_asset/rcp14.html");
                return false;
            }
        });

    }
}
