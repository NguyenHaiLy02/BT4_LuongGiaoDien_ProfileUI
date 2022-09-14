package com.example.bt4_luonggiaodien_profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {
    //TextView tvUser,tvEmail,tvPhone,tvTwitter,tvFb;
    Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //tvUser = (TextView) findViewById(R.id.textUser);
        //        tvUser.setText(getIntent().getExtras().getString("User"));
        //
        //        tvEmail = (TextView) findViewById(R.id.textEmail);
        //        tvEmail.setText(getIntent().getExtras().getString("Email"));
        //
        //        tvPhone =(TextView) findViewById(R.id.textPhone);
        //        tvPhone.setText(getIntent().getExtras().getString("Phone"));
        //
        //        tvTwitter =(TextView) findViewById(R.id.textTwitter);
        //        tvTwitter.setText(getIntent().getExtras().getString("Twitter"));
        //
        //        tvFb =(TextView) findViewById(R.id.textFb);
        //        tvFb.setText(getIntent().getExtras().getString("FaceBook"));
        btnBack =(Button) findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(ProfileActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

    }
}
