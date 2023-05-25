package com.example.a05handson;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText input1, input2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input1 = findViewById(R.id.userInput1);
        input2 = findViewById(R.id.userInput2);
    }

    public void swapTextFields(View view) {
        String temp = input1.getText().toString();
        input1.setText(input2.getText().toString());
        input2.setText(temp);
    }

    public void compareTextFields(View view) {
        String text1 = input1.getText().toString();
        String text2 = input2.getText().toString();

        Intent intent = new Intent(this, NextActivity.class);
        if (text1.equals(text2)) {
            intent.putExtra("result", "SAME");
        } else {
            intent.putExtra("result", "NOT THE SAME");
        }
        startActivity(intent);
    }
}