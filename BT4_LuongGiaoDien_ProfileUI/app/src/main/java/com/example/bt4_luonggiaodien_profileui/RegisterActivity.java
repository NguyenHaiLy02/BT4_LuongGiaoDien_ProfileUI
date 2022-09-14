package com.example.bt4_luonggiaodien_profileui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {
    TextView tvBackuser;
    TextView edtUser,edtPass,edtEmail,edtPhone,edtTwitter,edtFb;
    Button btnRegister;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tvBackuser =(TextView) findViewById(R.id.textBackUser);
        edtUser =(TextView) findViewById(R.id.editText_user);
        edtPass =(TextView) findViewById(R.id.editText_pass);
        edtEmail=(TextView) findViewById(R.id.editText_email);
        edtPhone=(TextView) findViewById(R.id.editText_phone);
        edtTwitter=(TextView) findViewById(R.id.editText_twitter);
        edtFb =(TextView) findViewById(R.id.editText_fb);
        btnRegister =(Button) findViewById(R.id.buttonRegister);

        tvBackuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(myIntent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(RegisterActivity.this, ProfileActivity.class);
                startActivity(myIntent);
            }
        });
        //btnRegister.setOnClickListener(new View.OnClickListener() {
        //            @Override
        //            public void onClick(View view) {
        //                String user=edtUser.getText().toString();
        //                String pass=edtPass.getText().toString();
        //                if (user.equals("")==true||pass.equals("")==true){
        //                    Toast.makeText(RegisterActivity.this, "Yêu Cầu Nhập UserName và Password", Toast.LENGTH_SHORT).show();
        //                }else {
        //                    if (user.equals("admin")==true){
        //                        Toast.makeText(RegisterActivity.this, "UserName Đã Tồn Tại", Toast.LENGTH_SHORT).show();
        //                    }else {
        //                        Toast.makeText(RegisterActivity.this, "Tạo Tài Khoản Thành Công", Toast.LENGTH_SHORT).show();
        //                        Intent intent=new Intent(getApplicationContext(),ProfileActivity.class);
        //                        intent.putExtra("User",user);
        //
        //                        String email=edtEmail.getText().toString();
        //                        intent.putExtra("Email",email);
        //
        //                        String phone=edtPhone.getText().toString();
        //                        intent.putExtra("Phone",phone);
        //
        //                        String twitter=edtTwitter.getText().toString();
        //                        intent.putExtra("Twitter",twitter);
        //
        //                        String fb=edtFb.getText().toString();
        //                        intent.putExtra("FaceBook",fb);
        //                        startActivity(intent);
        //                    }}
        //            }
        //        });
    }
}