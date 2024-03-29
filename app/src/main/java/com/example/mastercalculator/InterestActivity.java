package com.example.mastercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class InterestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_interest);

        EditText edtIAmount = findViewById(R.id.edtIAmount);
        EditText edtIInterest = findViewById(R.id.edtIInterest);
        EditText edtITime = findViewById(R.id.edtITime);
        TextView txtIYears = findViewById(R.id.txtIYears);
        TextView txtICalculate = findViewById(R.id.txtICalculate);
        TextView txtAnsIntAmount = findViewById(R.id.txtIAnsIntAmount);
        LinearLayout lnrIBack = findViewById(R.id.lnrIBack);

        lnrIBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtICalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String IntAmount = edtIAmount.getText().toString();
                String IntInterest = edtIInterest.getText().toString();
                String IntTime = edtITime.getText().toString();

                if(IntAmount.isEmpty())
                {
                    edtIAmount.setError("Enter Amount");
                }
                else if(IntInterest.isEmpty())
                {
                    edtIInterest.setError("Enter Interest Rate");
                }
                if(IntTime.isEmpty())
                {
                    edtITime.setError("Enter Years");
                }
                else
                {
                    int intAmount = Integer.parseInt(IntAmount);
                    float intRate = Float.parseFloat(IntInterest);
                    int intYear = Integer.parseInt(IntTime);
                    float monthIntRate = intRate/(12*100);
                    int intMonth = intYear*12;
                    double ansIntAmount;

                    ansIntAmount=(intAmount*intRate*intYear)/100;
                    txtAnsIntAmount.setText(" "+ansIntAmount);
                }
            }
        });
    }
}