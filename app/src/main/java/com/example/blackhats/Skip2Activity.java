package com.example.blackhats;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Skip2Activity extends AppCompatActivity {

    private Button nextb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skip2);


        nextb = findViewById(R.id.next2);
        nextb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Skip2Activity.this , Skip3Activity.class));
            }
        });
    }
}