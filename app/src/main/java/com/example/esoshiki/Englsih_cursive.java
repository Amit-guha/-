package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class Englsih_cursive extends AppCompatActivity {
    private GridView gridView;
    String [] Cursive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englsih_cursive);

        gridView=findViewById(R.id.Grid_cursive);
        Cursive=getResources().getStringArray(R.array.English_Alphabet);

        CustomAdapter2 customAdapter=new CustomAdapter2(this,Cursive);
        gridView.setAdapter(customAdapter);

    }
}
