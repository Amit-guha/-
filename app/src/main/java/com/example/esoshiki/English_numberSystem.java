package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class English_numberSystem extends AppCompatActivity {
    private GridView EnglishNumber;
    String [] number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_number_system);

        EnglishNumber=findViewById(R.id.GridNumber);
        number=getResources().getStringArray(R.array.Math);
        CustomAdapter1 customAdapter=new CustomAdapter1(this,number);
        EnglishNumber.setAdapter(customAdapter);

    }
}
