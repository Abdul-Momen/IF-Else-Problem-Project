package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem2 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int n1, n2, n3,max;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem2);


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

                n1 = Integer.parseInt(one);
                n2 = Integer.parseInt(two);
                n3 = Integer.parseInt(three);




                if((n1 > n2) && (n1 > n3))
                {
                    /* If num1 is greater than both */
                    max = n1;

                }
                else if((n2 > n1) && (n2 > n3))
                {
                    /* If num2 is greater than both */
                    max = n2;
                }
                else if((n3 > n1) && (n3 > n2))
                {
                    /* If num3 is greater than both */
                    max = n3;
                }

                result.setText("Maximum among all three numbers "+max );




            }
        });
    }
}