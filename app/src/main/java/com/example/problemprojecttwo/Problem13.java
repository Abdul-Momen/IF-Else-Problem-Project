package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem13 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    int amount;
    int note500, note100, note50, note20, note10, note5, note2, note1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem13);
        sumbtn = findViewById(R.id.sum_btn_id);
        num1 = findViewById(R.id.et_one_id);
        result = findViewById(R.id.result_tv);

        note500 = note100 = note50 = note20 = note10 = note5 = note2 = note1 = 0;

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                amount = Integer.parseInt(one);

                if(amount >= 500)
                {
                    note500 = amount/500;
                    amount -= note500 * 500;
                }
                if(amount >= 100)
                {
                    note100 = amount/100;
                    amount -= note100 * 100;
                }
                if(amount >= 50)
                {
                    note50 = amount/50;
                    amount -= note50 * 50;
                }
                if(amount >= 20)
                {
                    note20 = amount/20;
                    amount -= note20 * 20;
                }
                if(amount >= 10)
                {
                    note10 = amount/10;
                    amount -= note10 * 10;
                }
                if(amount >= 5)
                {
                    note5 = amount/5;
                    amount -= note5 * 5;
                }
                if(amount >= 2)
                {
                    note2 = amount /2;
                    amount -= note2 * 2;
                }
                if(amount >= 1)
                {
                    note1 = amount;
                }

                /* Print required notes */
                result.setText("Total number of notes = \n"
                                +"500 = " +note500+"\n"
                                +
                "100 = "+ note100+"\n"
                +"50 = "+ note50+"\n"
                +"20 = "+ note20+"\n"
                +"10 = "+ note10+"\n"
                +"5 = "+ note5+"\n"
                +"2 = "+ note2+"\n"
                +"1 = "+ note1+"\n"
                );


            }
        });
    }
}