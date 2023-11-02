package com.example.gajikaryawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
 CardView cvGajiahmad, cvPetunjukahmad, cvTentangahmad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cvGajiahmad = findViewById(R.id.cvGAjiahmad);
        cvPetunjukahmad = findViewById(R.id.cvPetunjukahmad);
        cvTentangahmad = findViewById(R.id.cvTentangahmad);

        cvGajiahmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent x = new Intent(MainActivity.this, DatagajiActivity.class);
                startActivity(x);
            }
        });
        cvPetunjukahmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PetunjukActivity.class);
                startActivity(i);
            }
        });
        cvTentangahmad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent y = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(y);
            }
        });
    }
}