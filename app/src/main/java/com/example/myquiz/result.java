package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent3 = getIntent();
        int score = intent3.getIntExtra("sc2",0);
        result = (TextView) findViewById(R.id.score);
        result.setText("Your Score : "+String.valueOf(score));
    }
}
