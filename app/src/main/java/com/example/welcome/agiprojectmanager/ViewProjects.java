package com.example.welcome.agiprojectmanager;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.storage.StorageReference;

public class ViewProjects extends AppCompatActivity {
   private WebView webview1;
    private Uri file;
    private StorageReference storageRef;
    ListView listView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_projects);
        listView=(ListView)findViewById(R.id.listv);
        String[] projects={"BlueMike","BILITY FOR DATA SHARING IN CLOUd","FABRICATION OF CENTRIFUGAL CASTING SETUP FOR INVESTINGATION OF SURFACE QUALITY OF ALUMINIUM 6063"};
        ArrayAdapter<String> adp=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,projects);
        listView.setAdapter(adp);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:

                        Intent intent=new Intent(ViewProjects.this,Listofprojects.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent i=new Intent(ViewProjects.this,lsp1.class);
                        startActivity(i);
                        break;
                    case 2:
                        Intent j=new Intent(ViewProjects.this,lsp2.class);
                        startActivity(j);
                        break;



                }

            }
        });
    }

}
