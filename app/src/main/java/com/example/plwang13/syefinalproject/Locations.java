package com.example.plwang13.syefinalproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Locations extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locations);

        Button madill = (Button) findViewById(R.id.madill);
        Button ody = (Button) findViewById(R.id.ody);

        madill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Locations.this, MadillFloors.class);
                Locations.this.startActivity(intent);
            }
        });

        ody.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Locations.this, ODYFloors.class);
                Locations.this.startActivity(intent);
            }
        });
    }
}
