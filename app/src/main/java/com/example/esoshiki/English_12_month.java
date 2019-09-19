package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class English_12_month extends AppCompatActivity {
    private RecyclerView English12;
    private List<Dataset>datasets;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_12_month);

        English12=findViewById(R.id.RecylerEnglish12);
        datasets=new ArrayList<>();

        datasets.add(new Dataset("1","January"));
        datasets.add(new Dataset("2","February"));
        datasets.add(new Dataset("3","March"));
        datasets.add(new Dataset("4","April"));
        datasets.add(new Dataset("5","May"));
        datasets.add(new Dataset("6","June"));
        datasets.add(new Dataset("7","July"));
        datasets.add(new Dataset("8","August"));
        datasets.add(new Dataset("9","September"));
        datasets.add(new Dataset("10","October"));
        datasets.add(new Dataset("11","November"));
        datasets.add(new Dataset("12","December"));

        English12adapter adapter=new English12adapter(this,datasets);
        English12.setLayoutManager(new GridLayoutManager(this,2));
        English12.setAdapter(adapter);
    }
}
