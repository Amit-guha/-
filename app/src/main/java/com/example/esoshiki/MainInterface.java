package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainInterface extends AppCompatActivity {
    private Button btnlow, btnupp,btnCursive,btnSorborno,btn_banjonborno,btnEnglisnum,btnEngWord,btn1,btnSbakko,btn12Mas
            ,btn7days,btnEng7,btnEng12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        btnlow = findViewById(R.id.btnlow);
        btnupp = findViewById(R.id.btnupp);
        btnCursive=findViewById(R.id.btn_cursive);
        btnSorborno=findViewById(R.id.btn_sorborno);
        btn_banjonborno=findViewById(R.id.btn_banjonborno);
        btnEnglisnum=findViewById(R.id.btn_eng_num);
        btnEngWord=findViewById(R.id.btnEnglishWord);
        btn1=findViewById(R.id.btnOne);
        btnSbakko=findViewById(R.id.btnSBakko);
        btn12Mas=findViewById(R.id.btn12Mas);
        btn7days=findViewById(R.id.btn7days);
        btnEng7=findViewById(R.id.btnEng7);
        btnEng12=findViewById(R.id.btnEng12);

        btnlow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInterface.this, English_lowercase.class);
                startActivity(intent);
            }
        });

        btnupp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainInterface.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnCursive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Englsih_cursive.class);
                startActivity(intent);
            }
        });

        btnSorborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Bangla_Sorborno.class);
                startActivity(intent);
            }
        });

        btn_banjonborno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Bangal_banjonborno.class);
                startActivity(intent);
            }
        });

        btnEnglisnum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,English_numberSystem.class);
                startActivity(intent);
            }
        });

        btnEngWord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Sorbonrno_to_sobdo.class);
                startActivity(intent);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,One_two_three.class);
                startActivity(intent);
            }
        });

        btnSbakko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Sorborno_to_sobdo.class);
                startActivity(intent);
            }
        });

        btn12Mas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Bangal_12_mas.class);
                startActivity(intent);
            }
        });

        btn7days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,Bangla_Seven_days.class);
                startActivity(intent);
            }
        });

        btnEng7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,English_Seven_days.class);
                startActivity(intent);
            }
        });

        btnEng12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainInterface.this,English_12_month.class);
                startActivity(intent);
            }
        });
    }
}
