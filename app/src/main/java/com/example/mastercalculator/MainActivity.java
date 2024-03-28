package com.example.mastercalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout lnrStart = findViewById(R.id.lnrStart);
        LinearLayout lnrAbout = findViewById(R.id.lnrAbout);
        TextView txtShare = findViewById(R.id.txtShare);
        TextView txtRate = findViewById(R.id.txtRate);

        lnrStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StartApp = new Intent(MainActivity.this,choosecalcActivity.class);
                startActivity(StartApp);
            }
        });
        lnrAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutUs = new Intent(MainActivity.this,aboutusActivity.class);
                startActivity(AboutUs);
            }
        });
    }
}