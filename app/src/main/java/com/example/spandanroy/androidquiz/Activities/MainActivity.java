package com.example.spandanroy.androidquiz.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.spandanroy.androidquiz.R;

public class MainActivity extends AppCompatActivity {

    int score;
    RadioButton ans1_choiceB, //Question 1
            ans2_choiceB,//Question 2
            ans4_choiceA,//Question 4
            ans5_choiceA,//Question 5
            ans6_choiceA,//Question 6
            ans7_choiceB,//Question 7
            ans8_choiceC;//Question 8
    CheckBox ans3_choiceA, ans3_choiceB, ans3_choiceC, ans3_choiceD,// Question 3
            ans10_choiceA, ans10_choiceB, ans10_choiceC, ans10_choiceD;//question 10
    EditText ans9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ans1_choiceB = findViewById(R.id.op_1_b);
        ans2_choiceB = findViewById(R.id.op_2_b);
        ans3_choiceA = findViewById(R.id.op_3_a);
        ans3_choiceB = findViewById(R.id.op_3_b);
        ans3_choiceC = findViewById(R.id.op_3_c);
        ans3_choiceD = findViewById(R.id.op_3_d);
        ans4_choiceA = findViewById(R.id.op_4_a);
        ans5_choiceA = findViewById(R.id.op_5_a);
        ans6_choiceA = findViewById(R.id.op_6_a);
        ans7_choiceB = findViewById(R.id.op_7_b);
        ans8_choiceC = findViewById(R.id.op_8_c);
        ans9 = findViewById(R.id.op_9);
        ans10_choiceA = findViewById(R.id.op_10_a);
        ans10_choiceB = findViewById(R.id.op_10_b);
        ans10_choiceC = findViewById(R.id.op_10_c);
        ans10_choiceD = findViewById(R.id.op_10_d);

    }

    public void submitAnswers(View view) {

        score = 0;// Score initially zero

        /*------------------------------------------------------------
        Question 1-Option B is correct                      2 marks
        --------------------------------------------------------------*/

        if (ans1_choiceB.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 2-Option B is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans2_choiceB.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 3-Option A,B,C are correct                 4 marks
        --------------------------------------------------------------*/
        if (ans3_choiceA.isChecked() && ans3_choiceB.isChecked() && ans3_choiceC.isChecked() && !ans3_choiceD.isChecked())
            score += 4;

        /*------------------------------------------------------------
        Question 4-Option A is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans4_choiceA.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 5-Option A is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans5_choiceA.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 6-Option A is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans6_choiceA.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 7-Option B is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans7_choiceB.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 8-Option C is correct                      2 marks
        --------------------------------------------------------------*/
        if (ans8_choiceC.isChecked())
            score += 2;

        /*------------------------------------------------------------
        Question 9-"2007" is correct                        2 marks
        --------------------------------------------------------------*/
        if (ans9.getText().toString().equals("2007"))
            score += 3;

        /*------------------------------------------------------------
        Question 10-Option A,B,C,D are correct              4 marks
        --------------------------------------------------------------*/
        if (ans10_choiceA.isChecked() && ans10_choiceB.isChecked() && ans10_choiceC.isChecked() && ans10_choiceD.isChecked())
            score += 4;

        /*------------------------------------------------------------
        Final Score
        --------------------------------------------------------------*/
        if (score == 25)

            Toast.makeText(this, "Perfect! You scored 25 out of 25", Toast.LENGTH_SHORT).show();
        else

            Toast.makeText(this, "You scored " + score + " out of 25. Try to get a perfect score.", Toast.LENGTH_LONG).show();

    }
}
