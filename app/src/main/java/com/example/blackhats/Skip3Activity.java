package com.example.blackhats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skip3Activity extends AppCompatActivity {

    private Button nextc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip3);

        nextc= findViewById(R.id.next3);

        nextc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Skip3Activity.this , Skip4Activity.class));
            }
        });


    }
}