package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem1 extends AppCompatActivity {

    EditText num1, num2;
    TextView result;
    Button sumbtn;

    int n1, n2;
    int sum, sub, mult, mod;
    float div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem1);



            sumbtn = findViewById(R.id.sum_btn_id);



            num1 = findViewById(R.id.et_one_id);
            num2 = findViewById(R.id.et_two_id);

            result = findViewById(R.id.result_tv);

            sumbtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String one = num1.getText().toString();
                    String two = num2.getText().toString();

                    n1 = Integer.parseInt(one);
                    n2 = Integer.parseInt(two);


                    if(n1 > n2)
                    {
                        result.setText(n1+" is maximum " );
                    }

                    /* If num2 is maximum */
                    else if(n2 > n1)
                    {
                        result.setText(n2+" is maximum " );
                    }

                    /* Additional condition check for equality */
                    else if(n1 == n2)
                    {
                        result.setText(n2+n1+" Both are equal " );
                    }



                }
            });
    }
}