package com.example.mastercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class EmiActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emi);

        LinearLayout lnrEmiBack = findViewById(R.id.lnrEmiBack);
        EditText edtEmiAmount = findViewById(R.id.edtEmiAmount);
        EditText edtEmiInterest = findViewById(R.id.edtEmiInterest);
        EditText edtEmiTime = findViewById(R.id.edtEmiTime);
        TextView txtEmiYears = findViewById(R.id.txtEmiYears);
        TextView txtEmiCalculator = findViewById(R.id.txtEmiCalculator);
        TextView txtAnsTotInterest = findViewById(R.id.txtAnsTotInterest);
        TextView txtAnsIntAmount = findViewById(R.id.txtAnsIntAmount);
        TextView txtAnsTotPayAmount = findViewById(R.id.txtAnsTotPayAmoount);

        lnrEmiBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });

        txtEmiCalculator.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                String EmiAmount = edtEmiAmount.getText().toString();
                String EmiInterest = edtEmiInterest.getText().toString();
                String EmiTime = edtEmiTime.getText().toString();
                String EmiTotInterest = txtAnsTotInterest.getText().toString();
                String EmiIntAmount = txtAnsIntAmount.getText().toString();
                String EmiTotPayAmount = txtAnsTotPayAmount.getText().toString();

                if(EmiAmount.isEmpty())
                {
                    edtEmiAmount.setError("Enter Amount");
                }
                else if (EmiInterest.isEmpty())
                {
                    edtEmiInterest.setError("Enter Interest");
                }
                else if (EmiTime.isEmpty())
                {
                    edtEmiTime.setError("Enter Years");
                }
                else
                {
                    int amounts = Integer.parseInt(EmiAmount);
                    float rates = Float.parseFloat(EmiInterest);
                    int years = Integer.parseInt(EmiTime);
                    float monthlyRate = rates/(12*100);
                    int months = years*12;
                    double totalInt;
                    double totalPay;

                    totalInt = (amounts * rates * years) / 100;

                    totalPay = totalInt+amounts;

                    (txtAnsIntAmount).setText(""+totalInt);
                    (txtAnsTotInterest).setText(""+rates);
                    (txtAnsTotPayAmount).setText(""+totalPay);
                }
            }
        });
    }
}