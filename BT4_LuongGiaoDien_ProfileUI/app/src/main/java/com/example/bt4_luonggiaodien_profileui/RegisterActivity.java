package com.example.bt4_luonggiaodien_profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    TextView tvBackuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvBackuser =(TextView) findViewById(R.id.textBackUser);

        tvBackuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });
    }
}