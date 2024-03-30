package com.example.mastercalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MutualFundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mutual_fund);

        LinearLayout lnrMBack = findViewById(R.id.lnrMBack);
        EditText edtMInvest = findViewById(R.id.edtMInvest);
        EditText edtMReturn = findViewById(R.id.edtMReturn);
        EditText edtMYear = findViewById(R.id.edtMYear);
        TextView txtMClear = findViewById(R.id.txtMClear);
        TextView txtMCalculate = findViewById(R.id.txtMCalculate);
        TextView txtAnsMFInv = findViewById(R.id.txtAnsMFInv);
        TextView txtAnsMFEstRet = findViewById(R.id.txtAnsMFEstRet);
        TextView txtAnsMFTotal = findViewById(R.id.txtAnsMFTotal);

        lnrMBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        txtMClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtMInvest.setText("");
                edtMReturn.setText("");
                edtMYear.setText("");
                txtAnsMFInv.setText("---");
                txtAnsMFEstRet.setText("---");
                txtAnsMFTotal.setText("---");
            }
        });
        txtMCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String monInvest = edtMInvest.getText().toString();
                String expReturn = edtMReturn.getText().toString();
                String timeYear = edtMYear.getText().toString();

                if(monInvest.isEmpty())
                {
                    edtMInvest.setError("Please Enter the Investment");
                }
                else if(expReturn.isEmpty())
                {
                    edtMReturn.setError("Please Enter the Return");
                }
                 else if(timeYear.isEmpty()) {
                    edtMYear.setError("Please Enter the Years");
                }
                else
                {
                    int p = Integer.parseInt(monInvest);
                    double i = Double.parseDouble(expReturn)/100/12;
                    int n = Integer.parseInt(timeYear)*12;
                    double total = p*((Math.pow(1+i,n)-1)/i)*(i+1);
                    int totInv = (p*n);
                    double estRet = total-totInv;

                    txtAnsMFInv.setText(""+totInv);
                    txtAnsMFEstRet.setText(String.format("%.2f",estRet));
                    txtAnsMFTotal.setText(String.format("%.2f",total));
                    Log.v("TAG", "onClick: ================ "+total );
                }
            }
        });
    }
}