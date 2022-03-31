package sohee.yoon.ecologiq;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ElateBeauty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.elatebeauty);

        WebView myWebView = (WebView) findViewById(R.id.webview);


        Button buttonlinkprepprimer = findViewById(R.id.buttonlinkprepprimer);
        buttonlinkprepprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.naver.com/");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

    }

    private class WebViewClientClass extends WebViewClient {//페이지 이동
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            Log.d("check URL",url);
            view.loadUrl(url);
            return true;
        }
    }


}