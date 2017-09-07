package com.example.welcome.agiprojectmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MiniProject extends AppCompatActivity {
    public Button upbtn;
    public Button Vibtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mini_project);
        upbtn=(Button) findViewById(R.id.upbtn);
        Vibtn=(Button) findViewById(R.id.Vibtn);
        upbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MiniProject.this,Upload.class);
                startActivity(i);
            }
        });
        Vibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(MiniProject.this,ViewProjects.class);
                startActivity(j);            }
        });
    }
}
