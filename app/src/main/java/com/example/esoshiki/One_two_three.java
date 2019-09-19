package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class One_two_three extends AppCompatActivity {

    private List<Dataset>datasets;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_two_three);

        recyclerView=findViewById(R.id.Recyclerview);

        datasets=new ArrayList<>();
       datasets.add(new Dataset("১","এক"));
       datasets.add(new Dataset("২","দুই"));
       datasets.add(new Dataset("৩","তিন"));
       datasets.add(new Dataset("৪","চার"));
       datasets.add(new Dataset("৫","পাঁচ"));
       datasets.add(new Dataset("৬","ছয়"));
       datasets.add(new Dataset("৭","সাত"));
       datasets.add(new Dataset("৮","আট"));
       datasets.add(new Dataset("৯","নয়"));
       datasets.add(new Dataset("৯","নয়"));
       datasets.add(new Dataset("১০","দশ"));
       datasets.add(new Dataset("১১","এগারো"));
       datasets.add(new Dataset("১২","বারো"));
       datasets.add(new Dataset("১৩","তের"));
       datasets.add(new Dataset("১৪","চৌদ্দ"));
       datasets.add(new Dataset("১৫","পনেরো"));
       datasets.add(new Dataset("১৬","ষোল"));
       datasets.add(new Dataset("১৭","সতেরো"));
       datasets.add(new Dataset("১৮","আঠারো"));
       datasets.add(new Dataset("১৯","উনিশ"));
       datasets.add(new Dataset("২০","বিশ"));
       datasets.add(new Dataset("২১","একুশ"));
       datasets.add(new Dataset("২২","বাইশ"));
       datasets.add(new Dataset("২৩","তেইশ"));
       datasets.add(new Dataset("২৪","চব্বিশ"));
       datasets.add(new Dataset("২৫","পঁচিশ"));
       datasets.add(new Dataset("২৬","ছাব্বিশ"));
       datasets.add(new Dataset("২৭","সাতাশ"));
       datasets.add(new Dataset("২৮","আটাশ"));
       datasets.add(new Dataset("২৯","উনত্রিশ"));
       datasets.add(new Dataset("৩০","ত্রিশ"));
       datasets.add(new Dataset("৩১","একত্রিশ"));
       datasets.add(new Dataset("৩২","বত্রিশ"));
       datasets.add(new Dataset("৩৩","তেতত্রিশ"));
       datasets.add(new Dataset("৩৪","চৌত্রিশ"));
       datasets.add(new Dataset("৩৫","পঁয়ত্রিশ"));
       datasets.add(new Dataset("৩৬","ছত্রিশ"));
       datasets.add(new Dataset("৩৭","সাঁইত্রিশ"));
       datasets.add(new Dataset("৩৮","আটত্রিশ"));
       datasets.add(new Dataset("৩৯","উনচল্লিশ"));
       datasets.add(new Dataset("৪০","চল্লিশ"));
       datasets.add(new Dataset("৪১","একচল্লিশ"));
       datasets.add(new Dataset("৪২","বিয়াল্লিশ"));
       datasets.add(new Dataset("৪৩","তেতাল্লিশ"));
       datasets.add(new Dataset("৪৪","চুয়াল্লিশ"));
       datasets.add(new Dataset("৪৫","পঁয়তাল্লিশ"));
       datasets.add(new Dataset("৪৬","ছেচল্লিশ"));
       datasets.add(new Dataset("৪৭","সাতচল্লিশ"));
       datasets.add(new Dataset("৪৮","আটচল্লিশ"));
       datasets.add(new Dataset("৪৯","উনপঞ্চাশ"));
       datasets.add(new Dataset("৫০","পঞ্চাশ"));
       datasets.add(new Dataset("৫১","একান্ন"));
       datasets.add(new Dataset("৫২","বাহান্ন"));
       datasets.add(new Dataset("৫৩","তিপ্পান্ন"));
       datasets.add(new Dataset("৫৪","চুয়ান্ন"));
       datasets.add(new Dataset("৫৫","পঞ্চান্ন"));
       datasets.add(new Dataset("৫৬","ছাপ্পান্ন"));
       datasets.add(new Dataset("৫৭","সাতান্ন"));
       datasets.add(new Dataset("৫৮","আটান্ন"));
       datasets.add(new Dataset("৫৯","উনষাট"));
       datasets.add(new Dataset("৬০","ষাট"));
       datasets.add(new Dataset("৬১","একষাট্টি"));
       datasets.add(new Dataset("৬২","বাষট্টি"));
       datasets.add(new Dataset("৬৩","তেষট্টি"));
       datasets.add(new Dataset("৬৪","চৌষট্টি"));
       datasets.add(new Dataset("৬৫","পঁয়ষট্টি"));
       datasets.add(new Dataset("৬৬","ছেষট্টি"));
       datasets.add(new Dataset("৬৭","সাতষট্টি"));
       datasets.add(new Dataset("৬৮","আটষট্টি"));
       datasets.add(new Dataset("৬৯","উনসত্তর"));
       datasets.add(new Dataset("৭০","সত্তর"));
       datasets.add(new Dataset("৭১","একাত্তর"));
       datasets.add(new Dataset("৭২","বাহাত্তর"));
       datasets.add(new Dataset("৭৩","তিয়াত্তর"));
       datasets.add(new Dataset("৭৪","চুয়াত্তর"));
       datasets.add(new Dataset("৭৫","পঁচাত্তর"));
       datasets.add(new Dataset("৭৬","ছিয়াত্তর"));
       datasets.add(new Dataset("৭৭","সাতাত্তর"));
       datasets.add(new Dataset("৭৮","আটাত্তর"));
       datasets.add(new Dataset("৭৯","উনআশি"));
       datasets.add(new Dataset("৮০","আশি"));
       datasets.add(new Dataset("৮১","একাশি"));
       datasets.add(new Dataset("৮২","বিরাশি"));
       datasets.add(new Dataset("৮৩","তিরাশি"));
       datasets.add(new Dataset("৮৪","চুরাশি"));
       datasets.add(new Dataset("৮৫","পঁচাশি"));
       datasets.add(new Dataset("৮৬","ছিয়াশি"));
       datasets.add(new Dataset("৮৭","সাতাশি"));
       datasets.add(new Dataset("৮৮","আটাশি"));
       datasets.add(new Dataset("৮৯","উননব্বই"));
       datasets.add(new Dataset("৯০","নব্বই"));
       datasets.add(new Dataset("৯১","একানব্বই"));
       datasets.add(new Dataset("৯২","বিরানব্বই"));
       datasets.add(new Dataset("৯৩","তিরানব্বই"));
       datasets.add(new Dataset("৯৪","চুরানব্বই"));
       datasets.add(new Dataset("৯৫","পঁচানব্বই"));
       datasets.add(new Dataset("৯৬","ছিয়ানব্বই"));
       datasets.add(new Dataset("৯৭","সাতানব্বই"));
       datasets.add(new Dataset("৯৮","আটানব্বই"));
       datasets.add(new Dataset("৯৯","নিরানব্বই"));
       datasets.add(new Dataset("১০০","একশত"));

       RecyclerViewAdapter adapter=new RecyclerViewAdapter(this,datasets);
       recyclerView.setLayoutManager(new GridLayoutManager(this,3));
       recyclerView.setAdapter(adapter);



    }
}
