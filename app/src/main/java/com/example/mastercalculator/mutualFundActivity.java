package com.example.mastercalculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class mutualFundActivity extends AppCompatActivity {

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
//                    Log.e("TAG", "onClick: ================ "+ans );
                }
            }
        });
    }
}