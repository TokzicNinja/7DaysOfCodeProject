package com.example.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnQuizMe = (Button) findViewById(R.id.btnQuizMe);

        btnQuizMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),QuestionsActivity.class);
                startActivity(i);
                Toast.makeText(v.getContext(),"You've just started Quiz",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
