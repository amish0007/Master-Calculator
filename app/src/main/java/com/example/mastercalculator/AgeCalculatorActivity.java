package com.example.mastercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AgeCalculatorActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agecalculator);

        LinearLayout lnrAgeBack = findViewById(R.id.lnrAgeBack);
        TextView txtAgeCalculate = findViewById(R.id.txtAgeCalculate);
        EditText edtBDate = findViewById(R.id.edtBDate);
        EditText edtBMonth = findViewById(R.id.edtBMonth);
        EditText edtBYear  = findViewById(R.id.edtBYear);
        EditText edtPDate = findViewById(R.id.edtPDate);
        EditText edtPMonth = findViewById(R.id.edtPMonth);
        EditText edtPYear  = findViewById(R.id.edtPYear);
        TextView txtAnsAgeDate = findViewById(R.id.txtAgeAnsDate);
        TextView txtAnsAgeMonth = findViewById(R.id.txtAgeAnsMonth);
        TextView txtAnsAgeYear = findViewById(R.id.txtAgeAnsYear);

        lnrAgeBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtAgeCalculate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String BDate = edtBDate.getText().toString();
                String BMonth = edtBMonth.getText().toString();
                String BYear = edtBYear.getText().toString();
                String PDate = edtPDate.getText().toString();
                String PMonth = edtPMonth.getText().toString();
                String PYear = edtPYear.getText().toString();

                if(BDate.isEmpty())
                {
                    edtBDate.setError("Enter Birth Date");
                }
                else if(BMonth.isEmpty())
                {
                    edtBMonth.setError("Enter Birth Month");
                }
                else if(BYear.isEmpty())
                {
                    edtBYear.setError("Enter Birth Year");
                }
                else if(PDate.isEmpty())
                {
                    edtPDate.setError("Enter Present Date");
                }
                else if(PMonth.isEmpty())
                {
                    edtPMonth.setError("Enter Present Month");
                }
                else if(PYear.isEmpty())
                {
                    edtPYear.setError("Enter Present Year");
                }
                else
                {
                    int Date,Month,Year;

                    int BiDate = Integer.parseInt(BDate);
                    int BiMonth = Integer.parseInt(BMonth);
                    int BiYear = Integer.parseInt(BYear);
                    int CDate = Integer.parseInt(PDate);
                    int CMonth = Integer.parseInt(PMonth);
                    int CYear = Integer.parseInt(PYear);

                    Year = CYear-BiYear;
                    if(CDate>BiDate && CMonth>BiMonth)
                    {
                        Date = CDate - BiDate;
                        Month = CMonth - BiMonth;
                    }
                    else
                    {
                        if(CMonth<BiMonth)
                        {
                            Year = Year-1;
                            CMonth = CMonth+12;
                            Month = CMonth-BiMonth;
                        }
                        else
                        {
                            Month = CMonth-BiMonth;
                        }
                        if(CDate<BiDate)
                        {
                            Month = Month-1;
                            CDate = CDate+30;
                            Date = CDate - BiDate;
                        }
                        else
                        {
                            Date = CDate-BiDate;
                        }
                    }

                    (txtAnsAgeYear).setText(" "+Year+" Years");
                    (txtAnsAgeMonth).setText(" "+Month+" Months");
                    (txtAnsAgeDate).setText(" "+Date+" Days");

                }
            }
        });

    }
}