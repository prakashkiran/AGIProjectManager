package com.example.welcome.agiprojectmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class Departments extends AppCompatActivity {
    public Button cseb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departments);
        cseb=(Button) findViewById(R.id.cseb);
        cseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Departments.this,Projects.class);
                startActivity(i);
            }
        });
    }
}
