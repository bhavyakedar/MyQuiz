package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class question2 extends AppCompatActivity {
    Button option12,option22,option32,option42;
    TextView result2;
    int score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        Intent intent = getIntent();
        score = intent.getIntExtra("sc",0);
        option12 = (Button) findViewById(R.id.option12);
        option22 = (Button) findViewById(R.id.option22);
        option32 = (Button) findViewById(R.id.option32);
        option42 = (Button) findViewById(R.id.option42);
        result2 = (TextView) findViewById(R.id.result2);
        option12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result2.setText("Wrong Answer :(");
                Intent intent2 = new Intent(question2.this, result.class);
                intent2.putExtra("sc2",score);
                startActivity(intent2);
            }
        });
        option22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2.setText("Wrong Answer :(");
                Intent intent2 = new Intent(question2.this, result.class);
                intent2.putExtra("sc2",score);
                startActivity(intent2);
            }
        });
        option32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2.setText("Wrong Answer :(");
                Intent intent2 = new Intent(question2.this, result.class);
                intent2.putExtra("sc2",score);
                startActivity(intent2);
            }
        });
        option42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result2.setText("Correct Answer :)");
                score = score + 1;
                Intent intent2 = new Intent(question2.this, result.class);
                intent2.putExtra("sc2",score);
                startActivity(intent2);
            }
        });
    }
}

