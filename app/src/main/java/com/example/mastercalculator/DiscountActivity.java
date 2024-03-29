package com.example.mastercalculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DiscountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discount);

        LinearLayout lnrDisBack = findViewById(R.id.lnrDisBack);
        EditText edtDisPrice = findViewById(R.id.edtDisPrice);
        EditText edtDisDiscount = findViewById(R.id.edtDisDiscount);
        TextView txtDis_Count = findViewById(R.id.txtDis_Count);
        TextView txtPriceDis = findViewById(R.id.txtPriceDis);
        TextView txtSavedAmt = findViewById(R.id.txtSavedAmt);

        lnrDisBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtDis_Count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String DPrice = edtDisPrice.getText().toString();
                String DDiscount = edtDisDiscount.getText().toString();
                String DPriceDis = txtPriceDis.getText().toString();
                String DSavedAmt = txtSavedAmt.getText().toString();

                if(DPrice.isEmpty())
                {
                    edtDisPrice.setError("Enter Price");
                }
                else if (DDiscount.isEmpty())
                {
                    edtDisDiscount.setError("Enter Discount");
                }
                else
                {
                    int disPrice = Integer.parseInt(DPrice);
                    int disDisPer = Integer.parseInt(DDiscount);
                    int PAD,SA;

                    PAD = disPrice-(disDisPer*disPrice)/100;
                    SA= disPrice-PAD;

                    txtPriceDis.setText(""+PAD);
                    txtSavedAmt.setText(""+SA);
                }
            }
        });
    }
}