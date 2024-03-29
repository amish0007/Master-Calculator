package com.example.mastercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SchoolResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schoolresult);

        LinearLayout lnrSchoolBack = findViewById(R.id.lnrSchoolBack);
        TextView txtSchoolCalculator = findViewById(R.id.txtSchoolCalculator);
        TextView txtSchoolAnswer = findViewById(R.id.txtSchoolAnswer);
        EditText edtSchoolTMarks = findViewById(R.id.edtSchoolTMarks);
        EditText edtSchoolYMarks = findViewById(R.id.edtSchoolYMarks);

        lnrSchoolBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtSchoolCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String SYourMarks = edtSchoolYMarks.getText().toString();
                String STotalMarks = edtSchoolTMarks.getText().toString();

                if(STotalMarks.isEmpty())
                {
                    edtSchoolTMarks.setError("Enter Total Marks");
                }
                else if(SYourMarks.isEmpty())
                {
                    edtSchoolYMarks.setError("Enter Your Marks");
                }
                else
                {
                    double schoolTMarks = Double.parseDouble(STotalMarks);
                    double schoolYMarks = Double.parseDouble(SYourMarks);
                    double sum = schoolYMarks/schoolTMarks;
                    double YPercentage = sum*100;
                    YPercentage=Math.floor(YPercentage);

                    txtSchoolAnswer.setText(" "+YPercentage+"%");

                }
            }
        });
    }
}