package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Bangla_Sorborno extends AppCompatActivity {
    private GridView grid_sorborno;
    String[]sorborno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla__sorborno);

        grid_sorborno=findViewById(R.id.Grid_sorborno);
        sorborno=getResources().getStringArray(R.array.Bengali_sorborno);

        CustomAdapter customAdapter=new CustomAdapter(this,sorborno);
        grid_sorborno.setAdapter(customAdapter);

    }
}
