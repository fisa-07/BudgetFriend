package com.example.budgetfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView monthly,bills,extras,dues;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        monthly = findViewById(R.id.monthly);
        bills = findViewById(R.id.bills);
        extras = findViewById(R.id.extras);
        dues = findViewById(R.id.dues);

        monthly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,MonthlyExpense.class));
            }
        });

        bills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,BillExpense.class));
            }
        });

        extras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,ExtraExpense.class));
            }
        });

        dues.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(HomeActivity.this,Dues.class));
            }
        });
    }
}