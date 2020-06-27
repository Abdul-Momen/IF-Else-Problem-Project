package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem10 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    char ch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem10);

        sumbtn = findViewById(R.id.sum_btn_id);
        num1 = findViewById(R.id.et_one_id);
        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                ch = one.charAt(ch);


                if(ch >= 'A' && ch <= 'Z')
                {
                    result.setText(ch+"' is uppercase alphabet.");
                }
                else if(ch >= 'a' && ch <= 'z')
                {
                    result.setText(ch+" is lowercase alphabet.");
                }
                else
                {
                    result.setText(ch+"' is not an alphabet.");
                }




            }
        });
    }
}