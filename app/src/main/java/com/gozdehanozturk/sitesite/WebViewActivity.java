package com.gozdehanozturk.sitesite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wang.avi.AVLoadingIndicatorView;

public class WebViewActivity extends AppCompatActivity {

    private AVLoadingIndicatorView avi;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        String url = getIntent().getExtras().getString("url");
        String title = getIntent().getExtras().getString("title");

        getSupportActionBar().setTitle(title);

        webView = (WebView) findViewById(R.id.webview);
        avi = (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator("");

        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);

        avi.show();
        webView.loadUrl(url);
        webView.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                webView.setVisibility(View.VISIBLE);
                avi.hide();
            }
        });
    }

}

