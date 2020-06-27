package com.example.problemprojecttwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Problem8 extends AppCompatActivity {
    EditText num1, num2,num3;
    TextView result;
    Button sumbtn, differencebtn, productbtn, quotientbtn, modulusbtn;
    char ch;
    private static final String TAG = "Problem8";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem8);

        sumbtn = findViewById(R.id.sum_btn_id);


        num1 = findViewById(R.id.et_one_id);


        result = findViewById(R.id.result_tv);

        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = num1.getText().toString();

                ch = one.charAt(ch);


                /* Condition for vowel */
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
                        ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                {
                    result.setText(ch+"' is Vowel.");
                    Log.d(TAG, "Some logging");
                }
                else if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                {
                    /* Condition for consonant */
                    result.setText(ch+"' is Consonant.");
                    Log.d(TAG, "Some logging");
                }
                else
                {
                    /*
                     * If it is neither vowel nor consonant
                     * then it is not an alphabet.
                     */
                    result.setText(ch+" is not an alphabet.");
                    Log.d(TAG, "Some logging");
                }


            }
        });
    }
}