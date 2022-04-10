package sohee.yoon.ecologiq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DirtyHippie extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dirtyhippie);

        WebView myWebView = (WebView) findViewById(R.id.webviewdirtyhippie);

        Button buttonlinklipbalm = findViewById(R.id.buttonlinklipbalm);
        buttonlinklipbalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dirtyhippie.co.nz/collections/all-products/products/lip-balms?variant=14433829650499");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        Button buttonlinklevitatemascara = findViewById(R.id.buttonlinklevitatemascara);
        buttonlinklevitatemascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/prep-primer");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        Button buttonlinklipstickcrayon = findViewById(R.id.buttonlinklipstickcrayon);
        buttonlinklipstickcrayon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/prep-primer");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });
    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest wrr) {
                Log.d("check URL", String.valueOf(wrr.getUrl()));
                view.loadUrl(String.valueOf(wrr.getUrl()));
                return true;
            }
        }
    }
