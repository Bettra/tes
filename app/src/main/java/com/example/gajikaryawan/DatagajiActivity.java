package com.example.gajikaryawan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DatagajiActivity extends AppCompatActivity {
    EditText edNikahmad, edNkahmad, edGjpahmad, edTjahmad, edJhkahmad,
             edTmahmad, edTtahmad, edGkahmad, edGbahmad;
    Button btHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datagaji);

        edNikahmad = findViewById(R.id.edNikahmad);
        edNkahmad = findViewById(R.id.edNkahmad);
        edGjpahmad = findViewById(R.id.edGjpahmad);
        edTjahmad = findViewById(R.id.edTjahmad);
        edJhkahmad = findViewById(R.id.edJhkahmad);
        edTmahmad = findViewById(R.id.edTmahmad);
        edTtahmad = findViewById(R.id.edTtahmad);
        edGkahmad = findViewById(R.id.edGkahmad);
        edGbahmad = findViewById(R.id.edGbahmad);

        btHitung = findViewById(R.id.btHitung);
        btHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                HitungHasil();
            }
        });
    }

    public void HitungHasil(){
        double GajiPokok = Double.parseDouble(edGjpahmad.getText().toString());
        double TunjanganJabatan = Double.parseDouble(edTjahmad.getText().toString());
        int JumlahHari = Integer.parseInt(edJhkahmad.getText().toString());

        double TunjanganMakan = JumlahHari * 10000;
        double TunjanganTransportasi = JumlahHari * 5000;

        double GajiKotor = GajiPokok + TunjanganJabatan + TunjanganMakan + TunjanganTransportasi;
        double Pajak = 0.1 * GajiKotor;

        double GajiBersih = GajiKotor - Pajak;

        edTmahmad.setText(String.valueOf(TunjanganMakan));
        edTtahmad.setText(String.valueOf(TunjanganTransportasi));
        edGkahmad.setText(String.valueOf(GajiKotor));
        edGbahmad.setText(String.valueOf(GajiBersih));
    }
}