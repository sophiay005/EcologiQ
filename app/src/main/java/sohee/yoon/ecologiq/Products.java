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

public class Products extends AppCompatActivity {
    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.products);

        WebView myWebView = (WebView) findViewById(R.id.webviewproducts);

        ImageButton imageButtonaxiologybalmie = findViewById(R.id.imageButtonaxiologybalmie);
        imageButtonaxiologybalmie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.setVisibility(View.VISIBLE);
                myWebView.loadUrl("https://axiologybeauty.com/collections/balmies/products/cotton-candy-skies-vegan-balmies-set");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonaxiologylipstick = findViewById(R.id.imageButtonaxiologylipstick);
        imageButtonaxiologylipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://axiologybeauty.com/collections/best-sellers/products/the-goodness-vegan-lipstick");
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

        ImageButton imageButtondabhermakeuppowder = findViewById(R.id.imageButtondabhermakeuppowder);
        imageButtondabhermakeuppowder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dabhms.com/product-page/acne-petal-translucent-powder");
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

        ImageButton imageButtondirtyhippielipbalm = findViewById(R.id.imageButtondirtyhippielipbalm);
        imageButtondirtyhippielipbalm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dirtyhippie.co.nz/collections/all-products/products/lip-balms?variant=14433829650499");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtondirtyhippielipstickcrayon = findViewById(R.id.imageButtondirtyhippielipstickcrayon);
        imageButtondirtyhippielipstickcrayon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.dirtyhippie.co.nz/collections/all-products/products/luk-lipstick-crayons?variant=39505734697148");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton dirtyhippiemascara = findViewById(R.id.imageButtondirtyhippiemascara);
        dirtyhippiemascara.setOnClickListener(new View.OnClickListener() {
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

        ImageButton imageButtonelatebeautyprepprimer = findViewById(R.id.imageButtonelatebeautyprepprimer);
        imageButtonelatebeautyprepprimer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://elatebeauty.com/collections/best-sellers/products/prep-primer");
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

        ImageButton imageButtonfatandthemooneyecoal = findViewById(R.id.imageButtonfatandthemooneyecoal);
        imageButtonfatandthemooneyecoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.fatandthemoon.com/collections/adornments/products/eye-coal");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonfatandthemoonlippaint = findViewById(R.id.imageButtonfatandthemoonlippaint);
        imageButtonfatandthemoonlippaint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://www.fatandthemoon.com/products/dusk-lip-paint-25-oz");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonodyliqueconcealer = findViewById(R.id.imageButtonodyliqueconcealer);
        imageButtonodyliqueconcealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://odylique.co.uk/organic-mineral-concealer-medium.htmlhttps://odylique.co.uk/organic-mineral-concealer-medium.html");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonodyliqueeyeshadow = findViewById(R.id.imageButtonodyliqueeyeshadow);
        imageButtonodyliqueeyeshadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://odylique.co.uk/mineral-eye-shadow-bark.html");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonodyliquelipstick = findViewById(R.id.imageButtonodyliquelipstick);
        imageButtonodyliquelipstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://odylique.co.uk/organic-lipstick-praline.htmlv");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonriverorganicsblushstick = findViewById(R.id.imageButtonriverorganicsblushstick);
        imageButtonriverorganicsblushstick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://riverorganics.org/products/zero-waste-vegan-blush-stick");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonriverorganicsconcealer = findViewById(R.id.imageButtonriverorganicsconcealer);
        imageButtonriverorganicsconcealer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://riverorganics.org/products/copy-of-zero-waste-concealer");
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

        ImageButton imageButtonplantmakeupbrowgloss = findViewById(R.id.imageButtonplantmakeupbrowgloss);
        imageButtonplantmakeupbrowgloss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://plantmakeup.com/products/chicorybrow?pr_prod_strat=copurchase&pr_rec_id=8ccbfd15d&pr_rec_pid=6312059371711&pr_ref_pid=7540942602495&pr_seq=uniform");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonplantmakeupcheekliptint = findViewById(R.id.imageButtonplantmakeupcheekliptint);
        imageButtonplantmakeupcheekliptint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://plantmakeup.com/products/ultimatestick");
                WebSettings webSettings = myWebView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                myWebView.setWebViewClient(new WebViewClientClass());
            }
        });

        ImageButton imageButtonplantmakeupshimmermist = findViewById(R.id.imageButtonplantmakeupshimmermist);
        imageButtonplantmakeupshimmermist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myWebView.loadUrl("https://plantmakeup.com/products/rosestar");
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