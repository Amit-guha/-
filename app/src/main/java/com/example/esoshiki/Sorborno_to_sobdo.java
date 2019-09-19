package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Sorborno_to_sobdo extends AppCompatActivity {

    private ListView listView;
    String [] bakko;
    String [] sobdo;
    String [] sorborno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorborno_to_sobdo);

        listView=findViewById(R.id.ListviewSobdo);
        sobdo=getResources().getStringArray(R.array.Sorborno_sobdo);
        bakko=getResources().getStringArray(R.array.bakko);
        sorborno=getResources().getStringArray(R.array.Bengali_sorborno);

        CustomAdapterWord customAdapterWord=new CustomAdapterWord(this,sorborno,sobdo,bakko);
        listView.setAdapter(customAdapterWord);


    }
}
