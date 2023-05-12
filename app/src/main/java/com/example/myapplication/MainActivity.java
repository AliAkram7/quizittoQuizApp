package com.example.myapplication;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit_answer(View view) {
        int score = answers();
        String total = String.valueOf(score);

        Toast.makeText(this, "Your Total Score is " + total + " Out of 10!", Toast.LENGTH_SHORT).show();
    }


    public int answers() {
        RadioGroup rg;


        int q1ans = R.id.radioAnsOne;
        int q2ans = R.id.radioAnsTwo;
        int q3ans = R.id.radioAnsThree;
        int q4ans = R.id.radioAnsFour;
        int q5ans = R.id.radioAnsFive;
        int q6ans = R.id.radioAnsSex;
        int q7ans = R.id.radioAnsSeven;
        int q8ans = R.id.radioAnsEight;
        int q9ans = R.id.radioAnsNine;
        int q10ans = R.id.radioAnsTen;

        int Points = 0;

        rg = (RadioGroup) findViewById(R.id.radioGroupOne);
        int value = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupTwo);
        int value2 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupThree);
        int value3 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupFour);
        int value4 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupFive);
        int value5 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupSex);
        int value6 = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupSeven);
        int value7 = rg.getCheckedRadioButtonId();

        rg = (RadioGroup) findViewById(R.id.radioGroupEight);
        int value8  = rg.getCheckedRadioButtonId();

        rg = (RadioGroup) findViewById(R.id.radioGroupNine);
        int value9  = rg.getCheckedRadioButtonId();
        rg = (RadioGroup) findViewById(R.id.radioGroupTen);
        int value10  = rg.getCheckedRadioButtonId();





        if (q1ans == value) {
            Points += 1;
        }
        if (q2ans == value2) {
            Points += 1;
        }
        if (q3ans == value3) {
            Points +=  1;
        }
        if (q4ans == value4) {
            Points += 1;
        }
        if (q5ans == value5) {
            Points += 1;
        }
        if(q6ans == value6){
            Points += 1;
        }

        if(q7ans == value7){
            Points += 1;
        }

        if(q8ans == value8){
            Points += 1;
        }


        if(q9ans == value9){
            Points += 1;
        }


        if(q10ans == value10){
            Points += 1;
        }


        return Points;
    }

}