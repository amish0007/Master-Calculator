package com.example.mastercalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class choosecalcActivity extends AppCompatActivity {

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
                Intent MutualIntent = new Intent(choosecalcActivity.this,mutualFundActivity.class);
                startActivity(MutualIntent);
            }
        });

        lnrInterest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent InterestIntent = new Intent(choosecalcActivity.this,interestActivity.class);
                startActivity(InterestIntent);
            }
        });
        lnrDiscount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DiscountIntent = new Intent(choosecalcActivity.this,discountActivity.class);
                startActivity(DiscountIntent);
            }
        });
        lnrEmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent EmiIntent = new Intent(choosecalcActivity.this,emiActivity.class);
                startActivity(EmiIntent);
            }
        });
        lnrSchoolResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SchoolResultIntent = new Intent(choosecalcActivity.this,schoolresultActivity.class);
                startActivity(SchoolResultIntent);
            }
        });
        lnrAgeCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SquareIntent = new Intent(choosecalcActivity.this, agecalculatorActivity.class);
                startActivity(SquareIntent);
            }
        });
    }
}