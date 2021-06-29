package com.example.display_toast_message;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBtn_one;
    private Button mBtn_two;
    private Button mBtn_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtn_one = findViewById(R.id.btn_one);
        mBtn_two = findViewById(R.id.btn_two);
        mBtn_three = findViewById(R.id.btn_three);
        mBtn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 1 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
            }
        });
        mBtn_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Button 3 clicked", Toast.LENGTH_SHORT).show();
            }
        });

    }
}