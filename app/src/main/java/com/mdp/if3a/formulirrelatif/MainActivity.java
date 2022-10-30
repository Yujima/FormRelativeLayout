package com.mdp.if3a.formulirrelatif;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private EditText tvNpm, tvNama;
    private RadioGroup rgJk;
    private RadioButton rbJk;
    private Spinner spProdi;
    private Button btnDaftar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvNama = findViewById(R.id.tv_nama);
        tvNpm = findViewById(R.id.tv_npm);
        rgJk = findViewById(R.id.rg_jk);
        spProdi = findViewById(R.id.sp_prodi);
        btnDaftar = findViewById(R.id.btn_daftar);

        btnDaftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String npm, nama, jk, prodi;
                int selectedID;

                npm = tvNpm.getText().toString();
                nama = tvNama.getText().toString();
                prodi = spProdi.getSelectedItem().toString();

                selectedID = rgJk.getCheckedRadioButtonId();
                rbJk = findViewById(selectedID);
                jk = rbJk.getText().toString();

                if(npm.trim().equals("") && nama.trim().equals("")){
                    tvNpm.setError("NPM Tidak Boleh Kosong");
                    tvNama.setError("Nama Tidak Boleh Kosong");
                }else if(npm.trim().equals("")){
                    tvNpm.setError("NPM Tidak Boleh Kosong");
                }else if(nama.trim().equals("")){
                    tvNama.setError("Nama Tidak Boleh Kosong");
                }else{
                    Intent intent = new Intent(MainActivity.this,TekanDaftar.class);
                    intent.putExtra("varNPM", npm);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varJK", jk);
                    intent.putExtra("varProdi", prodi);
                    startActivity(intent);
                }
            }
        });
    }
}