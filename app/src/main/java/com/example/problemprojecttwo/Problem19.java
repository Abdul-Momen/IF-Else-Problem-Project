package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem19 extends AppCompatActivity {
    EditText num1, num2,num3,num4,num5;
    TextView result,result1;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    int phy, chem, bio, math, comp;
    float per;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem19);

        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);
        num2 = findViewById(R.id.et_two_id);
        num3 = findViewById(R.id.et_three_id);
        num4 = findViewById(R.id.et_four_id);
        num5 = findViewById(R.id.et_five_id);

        result = findViewById(R.id.result_tv);
        result1 = findViewById(R.id.result_tv1);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();
                String two = num2.getText().toString();
                String three = num3.getText().toString();
                String four = num4.getText().toString();
                String five = num5.getText().toString();

                phy = Integer.parseInt(one);
                chem = Integer.parseInt(two);
                bio = Integer.parseInt(three);
                math = Integer.parseInt(four);
                comp = Integer.parseInt(five);



                /* Calculate percentage */
                per = (float) ((phy + chem + bio + math + comp) / 5.0);

                result.setText("Percentage = "+ per);


                /* Find grade according to the percentage */
                if(per >= 90)
                {
                    result1.setText("Grade A");
                }
                else if(per >= 80)
                {
                    result1.setText("Grade B");
                }
                else if(per >= 70)
                {
                    result1.setText("Grade C");
                }
                else if(per >= 60)
                {
                    result1.setText("Grade D");
                }
                else if(per >= 40)
                {
                    result1.setText("Grade E");
                }
                else
                {
                    result1.setText("Grade F");
                }

            }
        });
    }
}