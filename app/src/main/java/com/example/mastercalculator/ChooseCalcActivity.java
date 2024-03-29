package com.example.mastercalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class ChooseCalcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecalc);

        LinearLayout lnrBack = findViewById(R.id.lnrBack);
        LinearLayout lnrMutual = findViewById(R.id.lnrMutual);
        LinearLayout lnrInterest = findViewById(R.id.lnrInterest);
        LinearLayout lnrDiscount = findViewById(R.id.lnrDicount);
        LinearLayout lnrEmi = findViewById(R.id.lnrEmi);
        LinearLayout lnrSchoolResult = findViewById(R.id.lnrSchoolResult);
        LinearLayout lnrAgeCalc = findViewById(R.id.lnrAgeCalc);

        lnrBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        lnrMutual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MutualIntent = new Intent(ChooseCalcActivity.this, MutualFundActivity.class);
                startActivity(MutualIntent);
            }
        });

        lnrInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InterestIntent = new Intent(ChooseCalcActivity.this, InterestActivity.class);
                startActivity(InterestIntent);
            }
        });
        lnrDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DiscountIntent = new Intent(ChooseCalcActivity.this, DiscountActivity.class);
                startActivity(DiscountIntent);
            }
        });
        lnrEmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EmiIntent = new Intent(ChooseCalcActivity.this, EmiActivity.class);
                startActivity(EmiIntent);
            }
        });
        lnrSchoolResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SchoolResultIntent = new Intent(ChooseCalcActivity.this, SchoolResultActivity.class);
                startActivity(SchoolResultIntent);
            }
        });
        lnrAgeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SquareIntent = new Intent(ChooseCalcActivity.this, AgeCalculatorActivity.class);
                startActivity(SquareIntent);
            }
        });
    }
}