package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Bangal_12_mas extends AppCompatActivity {
    private List<Dataset> datasets;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangal_12_mas);

        recyclerView=findViewById(R.id.Recyclerview12mas);

        datasets=new ArrayList<>();
        datasets.add(new Dataset("১","বৈশাখ"));
        datasets.add(new Dataset("২","জ্যৈষ্ঠ"));
        datasets.add(new Dataset("৩","আষাঢ়"));
        datasets.add(new Dataset("৪","শ্রাবণ"));
        datasets.add(new Dataset("৫","ভাদ্র"));
        datasets.add(new Dataset("৬","আশ্বিন"));
        datasets.add(new Dataset("৭","কার্তিক"));
        datasets.add(new Dataset("৮","অগ্রাহায়ণ"));
        datasets.add(new Dataset("৯","পৌষ"));
        datasets.add(new Dataset("১০","মাঘ"));
        datasets.add(new Dataset("১১","ফাল্গুন"));
        datasets.add(new Dataset("১২","চৈত্র"));


        Bangla_12_mas_adapter adapter=new Bangla_12_mas_adapter(this,datasets);
        recyclerView.setLayoutManager(new GridLayoutManager(this,3));
        recyclerView.setAdapter(adapter);

    }
}
