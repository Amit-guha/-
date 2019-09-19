package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class English_Seven_days extends AppCompatActivity {
    private RecyclerView English7;
    List<Dataset>datasets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english__seven_days);

        English7=findViewById(R.id.RecyEng7Days);
        datasets=new ArrayList<>();

        datasets.add(new Dataset("1","Saturday"));
        datasets.add(new Dataset("2","Sunday"));
        datasets.add(new Dataset("3","Monday"));
        datasets.add(new Dataset("4","Tuesday"));
        datasets.add(new Dataset("5","Wednesday"));
        datasets.add(new Dataset("6","Thursday"));
        datasets.add(new Dataset("7","Friday"));

       SevendaysAdapter adapter=new SevendaysAdapter(this,datasets);
       English7.setLayoutManager(new GridLayoutManager(this,2));
       English7.setAdapter(adapter);
    }
}
