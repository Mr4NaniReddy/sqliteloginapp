package com.example.sqliteapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button back;
    TextView welcometxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        welcometxt = (TextView) findViewById(R.id.homemsg);
        back = (Button) findViewById(R.id.backbtn);
        Bundle bundle = getIntent().getExtras();
        String username1 = bundle.getString("userna");
        welcometxt.setText("Welcome Mr. "+ username1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}