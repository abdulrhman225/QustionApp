package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class mainActivity1 extends AppCompatActivity {
    TextView tv_firstView , tv_secondView , tv_thirdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        tv_firstView = findViewById(R.id.main_activity_tv_firstView);
        tv_secondView = findViewById(R.id.main_activity_tv_secondView);
        tv_thirdView = findViewById(R.id.main_activity_tv_thirdView);


        tv_firstView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent first_View_intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(first_View_intent);

            }
        });

        tv_secondView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Second_view_intent = new Intent(getBaseContext(),SecondView.class);
                startActivity(Second_view_intent);
            }
        });

        tv_thirdView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Third_View_intent = new Intent(getBaseContext(),ThirdView.class);
                startActivity(Third_View_intent);
            }
        });
    }
}