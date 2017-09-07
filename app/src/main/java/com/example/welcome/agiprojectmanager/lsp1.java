package com.example.welcome.agiprojectmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

 public class lsp1 extends AppCompatActivity {
private WebView webview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lsp1);webview1=(WebView)findViewById(R.id.webview1);
        webview1.getSettings().setJavaScriptEnabled(true);
        String pdf="https://firebasestorage.googleapis.com/v0/b/agi-pm.appspot.com/o/ENSURING%20DISTRIBUTED%20ACCOUNTABILITY%20FOR%20DATA%20SHARING%20IN%20CLOUD_cse_2012-16.pdf?alt=media&token=01ff8065-77de-4145-834f-796f10763f9e";
        webview1.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url="+pdf);

    }
}
