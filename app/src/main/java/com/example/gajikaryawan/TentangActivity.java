package com.example.gajikaryawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TentangActivity extends AppCompatActivity {
Button btKembali1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);
        btKembali1 = findViewById(R.id.btKembali1);
        btKembali1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l = new Intent(TentangActivity.this, MainActivity.class);
                startActivity(l);
            }
        });
    }
}