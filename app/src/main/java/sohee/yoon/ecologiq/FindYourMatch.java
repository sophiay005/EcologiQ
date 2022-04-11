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
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class FindYourMatch extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findyourmatch);

        WebView myWebView = (WebView) findViewById(R.id.webviewfindyourmatch);

        ImageButton imageButtonaxiologylipstick = findViewById(R.id.imageButtonaxiologylipstick);
        imageButtonaxiologylipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("hhttps://axiologybeauty.com/collections/best-sellers/products/the-goodness-vegan-lipstick");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondabherbmakeupmascarabar = findViewById(R.id.imageButtondabherbmakeupmascarabar);
        imageButtondabherbmakeupmascarabar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dabhms.com/product-page/organic-aloe-mascara-bar-cake-mascara-zero-waste-mascara");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondabhermakeupfoundation = findViewById(R.id.imageButtondabhermakeupfoundation);
        imageButtondabhermakeupfoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dabhms.com/product-page/serum-foundation");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondirtyhippiemascara = findViewById(R.id.imageButtondirtyhippiemascara);
        imageButtondirtyhippiemascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dirtyhippie.co.nz/collections/all-products/products/levitate-mascara");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonelatebeautyeyelinepencil = findViewById(R.id.imageButtonelatebeautyeyelinepencil);
        imageButtonelatebeautyeyelinepencil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/eyeline-pencil-onyx");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonelatebeautymascara = findViewById(R.id.imageButtonelatebeautymascara);
        imageButtonelatebeautymascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/essential-mascara-black");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonfatandthemoonbeamhighlighter = findViewById(R.id.imageButtonfatandthemoonbeamhighlighter);
        imageButtonfatandthemoonbeamhighlighter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.fatandthemoon.com/products/lit-1");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonriverorganicsmascara = findViewById(R.id.imageButtonriverorganicsmascara);
        imageButtonriverorganicsmascara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://riverorganics.org/products/vegan-zero-waste-black-mascara");
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