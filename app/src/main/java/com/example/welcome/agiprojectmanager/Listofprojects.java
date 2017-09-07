package com.example.welcome.agiprojectmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;

public class Listofprojects extends AppCompatActivity {
private WebView webview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listofprojects);webview1=(WebView)findViewById(R.id.webview1);

        webview1.getSettings().setJavaScriptEnabled(true);
        String pdf="https://firebasestorage.googleapis.com/v0/b/agi-pm.appspot.com/o/A%20Project%20Report%20on%20BlueMike_cse_2012-2016.pdf?alt=media&token=86c616b3-d294-40da-8f00-734a808b4017";
        webview1.loadUrl("http://drive.google.com/viewerng/viewer?embedded=true&url="+pdf);



    }
}
