package sohee.yoon.ecologiq;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
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

        ImageButton imageButtonaxiologylipstick1 = findViewById(R.id.imageButtonaxiologylipstick1);
        imageButtonaxiologylipstick1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.setVisibility(View.VISIBLE);
                myWebView.loadUrl("https://axiologybeauty.com/collections/best-sellers/products/the-goodness-vegan-lipstick");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondabherbmakeupmascarabar1 = findViewById(R.id.imageButtondabherbmakeupmascarabar1);
        imageButtondabherbmakeupmascarabar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dabhms.com/product-page/organic-aloe-mascara-bar-cake-mascara-zero-waste-mascara");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondabhermakeupfoundation1 = findViewById(R.id.imageButtondabhermakeupfoundation1);
        imageButtondabhermakeupfoundation1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dabhms.com/product-page/serum-foundation");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondirtyhippiemascara1 = findViewById(R.id.imageButtondirtyhippiemascara1);
        imageButtondirtyhippiemascara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dirtyhippie.co.nz/collections/all-products/products/levitate-mascara");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonelatebeautyeyelinepencil1 = findViewById(R.id.imageButtonelatebeautyeyelinepencil1);
        imageButtonelatebeautyeyelinepencil1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/eyeline-pencil-onyx");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonelatebeautymascara1 = findViewById(R.id.imageButtonelatebeautymascara1);
        imageButtonelatebeautymascara1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/essential-mascara-black");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonfatandthemoonbeamhighlighter1 = findViewById(R.id.imageButtonfatandthemoonbeamhighlighter1);
        imageButtonfatandthemoonbeamhighlighter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.fatandthemoon.com/products/lit-1");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonriverorganicsmascara1 = findViewById(R.id.imageButtonriverorganicsmascara1);
        imageButtonriverorganicsmascara1.setOnClickListener(new View.OnClickListener() {
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