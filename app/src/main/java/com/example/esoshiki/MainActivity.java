package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    String [] Alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gridView=findViewById(R.id.GridView);
        Alphabet=getResources().getStringArray(R.array.English_Alphabet);

        CustomAdapter adapter=new CustomAdapter(this,Alphabet);
        gridView.setAdapter(adapter);


    }
}
