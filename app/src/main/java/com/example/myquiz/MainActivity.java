package com.example.myquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button option1,option2,option3,option4;
    TextView result;
    int score=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        score=0;
        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);
        result = (TextView) findViewById(R.id.result);
        option1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                result.setText("Wrong Answer :(");
                Intent intent = new Intent(MainActivity.this, question2.class);
                intent.putExtra("sc", score );
                startActivity(intent);
            }
        });
        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Correct Answer :)");
                score = score + 1;
                Intent intent = new Intent(MainActivity.this, question2.class);
                intent.putExtra("sc", score );
                startActivity(intent);
            }
        });
        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Wrong Answer :(");
                Intent intent = new Intent(MainActivity.this, question2.class);
                intent.putExtra("sc", score );
                startActivity(intent);
            }
        });
        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("Wrong Answer :(");
                Intent intent = new Intent(MainActivity.this, question2.class);
                intent.putExtra("sc", score );
                startActivity(intent);
            }
        });
    }

}
