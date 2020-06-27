package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem14 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int angle1, angle2, angle3,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem14);

        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        num3 = findViewById(R.id.et_three_id);

        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();
                String three = num3.getText().toString();

                angle1 = Integer.parseInt(one);
                angle2 = Integer.parseInt(two);
                angle3 = Integer.parseInt(three);

                sum = angle1 + angle2 + angle3;

                if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
                {
                    result.setText("Triangle is valid.");
                }
                else
                {
                    result.setText("Triangle is not valid.");
                }



            }
        });
    }
}