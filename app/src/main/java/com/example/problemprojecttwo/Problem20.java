package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem20 extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button sumbtn;

    float basic, gross, da, hra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem20);


        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);


        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                basic = Float.parseFloat(one);


                /* Calculate D.A and H.R.A according to specified conditions */
                if(basic <= 10000)
                {
                    da  = (float) (basic * 0.8);
                    hra = (float) (basic * 0.2);
                }
                else if(basic <= 20000)
                {
                    da  = (float) (basic * 0.9);
                    hra = (float) (basic * 0.25);
                }
                else
                {
                    da  = (float) (basic * 0.95);
                    hra = (float) (basic * 0.3);
                }

                /* Calculate gross salary */
                gross = basic + hra + da;

                result.setText("GROSS SALARY OF EMPLOYEE = "+ gross);







            }
        });
    }
}