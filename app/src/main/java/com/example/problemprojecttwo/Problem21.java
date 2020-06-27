package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem21 extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button sumbtn;

    int unit;
    float amt, total_amt, sur_charge;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem21);


        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);


        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                unit = Integer.parseInt(one);

                /* Calculate electricity bill according to given conditions */
                if(unit <= 50)
                {
                    amt = (float) (unit * 0.50);
                }
                else if(unit <= 150)
                {
                    amt = (float) (25 + ((unit-50) * 0.75));
                }
                else if(unit <= 250)
                {
                    amt = (float) (100 + ((unit-150) * 1.20));
                }
                else
                {
                    amt = (float) (220 + ((unit-250) * 1.50));
                }

                /*
                 * Calculate total electricity bill
                 * after adding surcharge
                 */
                sur_charge = (float) (amt * 0.20);
                total_amt  = amt + sur_charge;

                result.setText("Electricity Bill = Rs."+ total_amt);






            }
        });
    }
}