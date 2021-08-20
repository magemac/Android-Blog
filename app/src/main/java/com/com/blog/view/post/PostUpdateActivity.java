package com.com.blog.view.post;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.R;
import com.com.blog.view.CustomAppBarActivity;
import com.com.blog.view.InitActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class PostUpdateActivity extends CustomAppBarActivity implements InitActivity {
private TextInputEditText tvTitle,tvContent;
private MaterialButton btnUpdate;

    public PostUpdateActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_update);

        init();
        initLr();
        initSetting();
    }

    @Override
    public void init() {
    tvTitle=findViewById(R.id.tvTitle);
    tvContent = findViewById(R.id.tvContent);
    btnUpdate = findViewById(R.id.btnUpdate);
    }

    @Override
    public void initLr() {
btnUpdate.setOnClickListener(v -> {});
    }

    @Override
    public void initSetting() {
        onAppBarSettings(true, "Update");
    }
}