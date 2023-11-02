package com.example.gajikaryawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PetunjukActivity extends AppCompatActivity {
 Button btKembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_petunjuk);
        btKembali = findViewById(R.id.btKembali);
        btKembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(PetunjukActivity.this, MainActivity.class);
                startActivity(p);
            }
        });
    }
}