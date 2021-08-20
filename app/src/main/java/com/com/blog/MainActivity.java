package com.com.blog;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;

import com.com.blog.view.auth.LoginActivity;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private MainActivity mContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Intent intent = new Intent(
                    mContext,
                    LoginActivity.class
            );
            startActivity(intent);
        });
    }
}