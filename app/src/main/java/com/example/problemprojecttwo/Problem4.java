package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem4 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int n1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem4);


        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);


        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                n1 = Integer.parseInt(one);


                if((n1 % 5 == 0) && (n1 % 11 == 0))
                {
                    result.setText("Number is divisible by 5 and 11" );
                }
                else
                {
                    result.setText("Number is not divisible by 5 and 11" );
                }







            }
        });
    }
}