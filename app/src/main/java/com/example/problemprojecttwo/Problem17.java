package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class Problem17 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;

    float a, b, c;
    float root1, root2, imaginary;
    float discriminant;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem17);


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

                a = Float.parseFloat(one);
                b = Float.parseFloat(two);
                c = Float.parseFloat(three);


                discriminant = (b * b) - (4 * a * c);


                /* Find the nature of discriminant */
                if(discriminant > 0)
                {
                    root1 = (float) ((-b + sqrt(discriminant)) / (2*a));
                    root2 = (float) ((-b - sqrt(discriminant)) / (2*a));

                    result.setText("Two distinct and real roots exists:"+ root1+" and " + root2);
                }
                else if(discriminant == 0)
                {
                    root1 = root2 = -b / (2 * a);

                    result.setText("Two equal and real roots exists: "+ root1+" and " +root2);
                }
                else if(discriminant < 0)
                {
                    root1 = root2 = -b / (2 * a);
                    imaginary = (float) (sqrt(-discriminant) / (2 * a));

                    result.setText("Two distinct complex roots exists:"+root1+"+"+imaginary+"and "+root2+"-"+imaginary
                            );
                }

            }
        });
    }
}