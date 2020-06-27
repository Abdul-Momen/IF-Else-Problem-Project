package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem9 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    char ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem9);
        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);


        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                ch = one.charAt(ch);



                if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                {
                    result.setText(ch+" is alphabet.");
                }
                else if(ch >= '0' && ch <= '9')
                {
                    result.setText(ch+"' is digit.");
                }
                else
                {
                    result.setText(ch+" is special character.");
                }

            }
        });
    }
}