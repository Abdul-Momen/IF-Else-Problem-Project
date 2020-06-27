package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem12 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    int month;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem12);

        sumbtn = findViewById(R.id.sum_btn_id);
        num1 = findViewById(R.id.et_one_id);
        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                month = Integer.parseInt(one);


                if(month == 1)
                {
                    result.setText("31 days");
                }
                else if(month == 2)
                {
                    result.setText("28 or 29 days");
                }
                else if(month == 3)
                {
                    result.setText("31 days");
                }
                else if(month == 4)
                {
                    result.setText("30 days");
                }
                else if(month == 5)
                {
                    result.setText("31 days");
                }
                else if(month == 6)
                {
                    result.setText("30 days");
                }
                else if(month == 7)
                {
                    result.setText("31 days");
                }
                else if(month == 8)
                {
                    result.setText("31 days");
                }
                else if(month == 9)
                {
                    result.setText("30 days");
                }
                else if(month == 10)
                {
                    result.setText("31 days");
                }
                else if(month == 11)
                {
                    result.setText("30 days");
                }
                else if(month == 12)
                {
                    result.setText("31 days");
                }
                else
                {
                    result.setText("Invalid input! Please enter month number between (1-12).");
                }


            }
        });
    }
}