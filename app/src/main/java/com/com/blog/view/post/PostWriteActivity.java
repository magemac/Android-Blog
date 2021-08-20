package com.com.blog.view.post;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.R;
import com.com.blog.view.CustomAppBarActivity;
import com.com.blog.view.InitActivity;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;


public class PostWriteActivity extends CustomAppBarActivity implements InitActivity {
    private MaterialButton btnWrite;
    private TextInputEditText tvContent, tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_write);

        init();
        initLr();
        initSetting();
    }

    @Override
    public void init() {
    btnWrite = findViewById(R.id.btnWrite);
    tvContent = findViewById(R.id.tvContent);
    tvTitle = findViewById(R.id.tvTitle);
    }

    @Override
    public void initLr() {
    btnWrite.setOnClickListener(v -> {});
    }

    @Override
    public void initSetting() {
        onAppBarSettings(true, "Write");
    }
}