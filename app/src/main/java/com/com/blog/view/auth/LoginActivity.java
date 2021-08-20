package com.com.blog.view.auth;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.MainActivity;
import com.com.blog.R;
import com.com.blog.view.InitActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import org.w3c.dom.Text;


public class LoginActivity extends AppCompatActivity implements InitActivity {
private TextInputEditText tvUsername,tvPassword;
private MaterialButton btnLogin;
private TextView goJoin;
private LoginActivity mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    public void init() {
        tvUsername = findViewById(R.id.tvUsername);
        tvPassword = findViewById(R.id.tvPassword);
        btnLogin = findViewById(R.id.btnLogin);
        goJoin = findViewById(R.id.goJoin);
    }

    @Override
    public void initLr() {
    btnLogin.setOnClickListener(v -> {
        Intent intent = new Intent(
                mContext,
                MainActivity.class
        );
        startActivity(intent);
    });
    goJoin.setOnClickListener(v -> {
        Intent intent = new Intent(
                mContext,
                JoinActivity.class

        );
        startActivity(intent);
    });
    }

    @Override
    public void initSetting() {

    }
}