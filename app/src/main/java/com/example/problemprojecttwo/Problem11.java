package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem11 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    int week;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem11);

        sumbtn = findViewById(R.id.sum_btn_id);
        num1 = findViewById(R.id.et_one_id);
        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                week = Integer.parseInt(one);


                if(week == 1)
                {
                    result.setText("Monday");
                }
                else if(week == 2)
                {
                    result.setText("Tuesday");
                }
                else if(week == 3)
                {
                    result.setText("Wednesday");
                }
                else if(week == 4)
                {
                    result.setText("Thursday");
                }
                else if(week == 5)
                {
                    result.setText("Friday");
                }
                else if(week == 6)
                {
                    result.setText("Saturday");
                }
                else if(week == 7)
                {
                    result.setText("Sunday");
                }
                else
                {
                    result.setText("Invalid Input! Please enter week number between 1-7.");
                }



            }
        });
    }
}