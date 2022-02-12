package com.example.blackhats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AttendanceActivity extends AppCompatActivity {

      ImageView homeButton;
      ImageView touch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attendance);

        homeButton = findViewById(R.id.menu);
        touch = findViewById(R.id.touchit);



        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttendanceActivity.this , HomeActivity.class));
            }
        });

        touch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(AttendanceActivity.this ,testqr.class));
            }
        });
    }
}