package com.example.blackhats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    private Button corona;
    private Button qrRead;
    private Button heatProfile;
    private Button studentIssue;
    private Button moneyTracker;
    private Button myProfile;
    private Button notification;
    private Button about;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        corona= findViewById(R.id.buttoncorona1);
        qrRead= findViewById(R.id.buttoncorona0);
        heatProfile= findViewById(R.id.buttoncorona2);
        studentIssue= findViewById(R.id.buttoncorona3);
        moneyTracker= findViewById(R.id.buttoncorona5);
        myProfile= findViewById(R.id.buttoncorona6);
        notification= findViewById(R.id.buttoncorona7);
        about=findViewById(R.id.buttoncorona9);


        corona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , CovidActivity.class));
            }
        });

        qrRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , AttendanceActivity.class));
            }
        });

         heatProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , HeatActivity.class));
            }
        });

        studentIssue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this ,lghelpActivity.class));
            }
        });

       moneyTracker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , MoneyActivity.class));
            }
        });

       myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , MainprofileActivity.class));
            }
        });

        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this ,NotificationActivity.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this , AboutusActivity.class));
            }
        });

    }
}
