package com.com.blog.view.post;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.com.blog.R;
import com.com.blog.view.CustomAppBarActivity;
import com.com.blog.view.InitActivity;


public class PostDetailActivity extends CustomAppBarActivity implements InitActivity {
    private Button btnUpdateForm,btnDelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        init();
        initLr();
        initSetting();
    }

    @Override
    public void init() {
    btnDelete = findViewById(R.id.btnDelete);
    btnUpdateForm = findViewById(R.id.btnUpdateForm);
    }

    @Override
    public void initLr() {
        btnDelete.setOnClickListener(v -> {});
        btnUpdateForm.setOnClickListener(v ->{});

    }

    @Override
    public void initSetting() {
        onAppBarSettings(true, "Detail");
    }
}