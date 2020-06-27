package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem18 extends AppCompatActivity {
    EditText num1, num2;
    TextView result;
    Button sumbtn;

    int sp, cp,amt;
    int sum, sub, mult, mod;
    float div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem18);


        sumbtn = findViewById(R.id.sum_btn_id);



        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);

        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();

                cp  = Integer.parseInt(one);
                sp  = Integer.parseInt(two);




                if(sp > cp)
                {
                    /* Calculate Profit */
                    amt = sp - cp;
                    result.setText("Profit = "+ amt);
                }
                else if(cp > sp)
                {
                    /* Calculate Loss */
                    amt = cp - sp;
                    result.setText("Loss = "+ amt);
                }
                else
                {
                    /* Neither profit nor loss */
                    result.setText("No Profit No Loss.");
                }



            }
        });
    }
}