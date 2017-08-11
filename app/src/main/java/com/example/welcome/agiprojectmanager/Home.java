package com.example.welcome.agiprojectmanager;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class Home extends AppCompatActivity {
    public Button Loginbt;
    public Button Regbt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Loginbt=(Button) findViewById(R.id.Loginbt);
        Regbt=(Button) findViewById(R.id.Regbt);
        Loginbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,Login.class);
                startActivity(i);
            }
        });
        Regbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Home.this,Registration.class);
                startActivity(j);
            }
        });

    }
}
