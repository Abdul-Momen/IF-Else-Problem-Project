package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem16 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int side1, side2, side3,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem16);


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

                side1 = Integer.parseInt(one);
                side2 = Integer.parseInt(two);
                side3 = Integer.parseInt(three);

                if(side1==side2 && side2==side3)
                {
                    /* If all sides are equal */
                    result.setText("Equilateral triangle.");
                }
                else if(side1==side2 || side1==side3 || side2==side3)
                {
                    /* If any two sides are equal */
                    result.setText("Isosceles triangle.");
                }
                else
                {
                    /* If none sides are equal */
                    result.setText("Scalene triangle.");
                }



            }
        });
    }
}