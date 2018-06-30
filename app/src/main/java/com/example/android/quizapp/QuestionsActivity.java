package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class QuestionsActivity extends AppCompatActivity {

    int x =0;
    int y =0;
    int z =0;
    int scoreVar =1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
    }
    public void show(View view)
    {
        RadioButton btnA = findViewById(R.id.radioButtonA);
        RadioButton btnB = findViewById(R.id.radioButtonB);
        RadioButton btnC = findViewById(R.id.radioButtonC);
        RadioButton btnD = findViewById(R.id.radioButtonD);

        boolean checked = ((RadioButton) view).isChecked();

                if(btnA.isPressed())
                {
                    btnA.toggle();
                    x =1;
                    Toast.makeText(this, "A has been checked " +x, Toast.LENGTH_SHORT).show();
                }
                else {
                    btnA.setChecked(false);
                }
                if(btnB.isPressed())
                {
                    btnB.toggle();
                    x =2;
                    Toast.makeText(this, "B has been checked "+x, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btnB.setChecked(false);
                }
                if(btnC.isPressed())
                {
                    btnC.toggle();
                    x=3;
                    Toast.makeText(this, "C has been checked "+x, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btnC.setChecked(false);
                }
                if(btnD.isPressed())
                {
                    btnD.toggle();
                    x=4;
                    Toast.makeText(this, "D has been checked "+x, Toast.LENGTH_SHORT).show();
                }
                else
                {
                    btnD.setChecked(false);
                }
    }

    public void showB(View view)
    {
        RadioButton btnA = findViewById(R.id.radioButtonA1);
        RadioButton btnB = findViewById(R.id.radioButtonB1);
        RadioButton btnC = findViewById(R.id.radioButtonC1);
        RadioButton btnD = findViewById(R.id.radioButtonD1);


        if(btnA.isPressed())
        {
            btnA.toggle();
            y=1;
            Toast.makeText(this, "A has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else {
            btnA.setChecked(false);
        }
        if(btnB.isPressed())
        {
            btnB.toggle();
            y=2;
            Toast.makeText(this, "B has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else
        {
            btnB.setChecked(false);
        }
        if(btnC.isPressed())
        {
            btnC.toggle();
            y=3;
            Toast.makeText(this, "C has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else
        {
            btnC.setChecked(false);
        }
        if(btnD.isPressed())
        {
            btnD.toggle();
            y=4;
            Toast.makeText(this, "D has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else
        {
            btnD.setChecked(false);
        }
    }

    public void showC(View view)
    {
        RadioButton btnYes = findViewById(R.id.radBtnYes);
        RadioButton btnNo = findViewById(R.id.radBtnNo);

        if(btnYes.isPressed())
        {
            btnYes.toggle();
            z=1;
            Toast.makeText(this, "C has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else
        {
            btnYes.setChecked(false);
        }
        if(btnNo.isPressed())
        {
            btnNo.toggle();
            z=2;
            Toast.makeText(this, "D has been checked "+y, Toast.LENGTH_SHORT).show();
        }
        else
        {
            btnNo.setChecked(false);
        }
    }

    public void score(View view)
    {
        if(x==1)
        {
            scoreVar = scoreVar+2;
        }
        if(y==1)
        {
            scoreVar = scoreVar+2;
        }
        if(z==1)
        {
            scoreVar = scoreVar+2;
        }

        Toast.makeText(view.getContext(),"Your final score is "+scoreVar+" second last question is free marks",Toast.LENGTH_SHORT).show();
        scoreVar =0;
    }
}
