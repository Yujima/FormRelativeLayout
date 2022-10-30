package com.mdp.if3a.formulirrelatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TekanDaftar extends AppCompatActivity {

    private TextView tvnpm, tvnama, tvjk, tvprodi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tekan_daftar);

        tvnpm = findViewById(R.id.dp_npm);
        tvnama = findViewById(R.id.dp_nama);
        tvjk = findViewById(R.id.dp_jk);
        tvprodi = findViewById(R.id.dp_prodi);

        Intent intent = getIntent();
        tvnpm.setText(intent.getStringExtra("varNPM"));
        tvnama.setText(intent.getStringExtra("varNama"));
        tvjk.setText(intent.getStringExtra("varJK"));
        tvprodi.setText(intent.getStringExtra("varProdi"));
    }
}