package com.example.bt4_luonggiaodien_profileui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText edtUser,edtPass;
    Button btnLogin;
    TextView tvNewuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUser = (EditText) findViewById(R.id.editText_user);
        edtPass = (EditText) findViewById(R.id.editText_pass);
        btnLogin = (Button) findViewById(R.id.buttonLogin);
        tvNewuser =(TextView) findViewById(R.id.textNewuser);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user="NguyenHaiLy";
                String pass ="123456";
                if(edtUser.getText().toString().equals(user) && edtPass.getText().toString().equals(pass)){
                    Toast.makeText(MainActivity.this, "ĐĂNG NHẬP THÀNH CÔNG", Toast.LENGTH_SHORT).show();
                    Intent myIntent=new Intent(MainActivity.this, ProfileActivity.class);
                    startActivity(myIntent);
                }else {
                    Toast.makeText(MainActivity.this, "ĐĂNG NHẬP THẤT BẠI", Toast.LENGTH_SHORT).show();
                }
            }
        });
        tvNewuser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(myIntent);
            }
        });
    }
}