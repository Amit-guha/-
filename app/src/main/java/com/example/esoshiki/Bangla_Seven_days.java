package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bangla_Seven_days extends AppCompatActivity {
    private RecyclerView Bangla7Days;
    private List<Dataset>datasets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangla__seven_days);

        Bangla7Days=findViewById(R.id.RecyclerviewBangalSevendays);
        datasets=new ArrayList<>();

        datasets.add(new Dataset("১","শনিবার"));
        datasets.add(new Dataset("২","রবিবার"));
        datasets.add(new Dataset("৩","সোমবার"));
        datasets.add(new Dataset("৪","মঙ্গলবার"));
        datasets.add(new Dataset("৫","বুধবার"));
        datasets.add(new Dataset("৬","বৃহঃস্পতিবার"));
        datasets.add(new Dataset("৭","শুক্রবার"));

        SevendaysAdapter adapter=new SevendaysAdapter(this,datasets);
        Bangla7Days.setLayoutManager(new GridLayoutManager(this,2));
        Bangla7Days.setAdapter(adapter);


    }
}
