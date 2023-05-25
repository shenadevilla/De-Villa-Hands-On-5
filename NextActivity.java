package com.example.a05handson;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {
    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        text = findViewById(R.id.textView);

        Intent intent = getIntent();
        String result = intent.getStringExtra("result");
        text.setText(result);
    }

    public void backToMain(View view) {
        finish();
    }
}