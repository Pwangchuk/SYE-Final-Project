package com.example.plwang13.syefinalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MadillFloors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madill_floors);

        Button first = (Button) findViewById(R.id.madillfirst);
        Button second = (Button) findViewById(R.id.madillsecond);

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MadillFloors.this, MadillSecond.class);
                MadillFloors.this.startActivity(intent);
            }
        });
    }
}
