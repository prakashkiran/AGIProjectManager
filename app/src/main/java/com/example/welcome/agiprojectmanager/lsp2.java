package com.example.welcome.agiprojectmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class lsp2 extends AppCompatActivity {
 private WebView webview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsp2);webview1=(WebView)findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        String pdf="https://firebasestorage.googleapis.com/v0/b/agi-pm.appspot.com/o/FABRICATION%20OF%20CENTRIFUGAL%20CASTING%20SETUP%20FOR%20INVESTINGATION%20OF%20SURFACE%20QUALITY%20OF%20ALUMINIUM%206063.pdf?alt=media&token=fd845bdb-f795-4dc7-834d-8f1490814021";
        webview1.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url="+pdf);

    }
}
