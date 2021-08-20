package com.com.blog.view.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.R;
import com.com.blog.view.InitActivity;
import com.google.android.material.textfield.TextInputEditText;


public class JoinActivity extends AppCompatActivity implements InitActivity {

    private Button btnJoin,btnGoLogin;
    private TextInputEditText tvUsername, tvPassword,tvEmail;
    private JoinActivity mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

    @Override
    public void init() {
        btnGoLogin = findViewById(R.id.btngoLogin);
    btnJoin = findViewById(R.id.btnJoin);
    tvUsername= findViewById(R.id.tvUsername);
    tvPassword = findViewById(R.id.tvPassword);
    tvEmail = findViewById(R.id.tvEmail);
    }

    @Override
    public void initLr() {
        btnGoLogin.setOnClickListener(v -> {
        Intent intent = new Intent(

              mContext,
                LoginActivity.class
        );
        startActivity(intent);
    });
    }

    @Override
    public void initSetting() {

    }
}