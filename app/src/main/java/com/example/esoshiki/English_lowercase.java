package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class English_lowercase extends AppCompatActivity {
    private GridView English_lowercase;
    String [] lowerCase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_lowercase);

        English_lowercase=findViewById(R.id.Grid_english_low);
        lowerCase=getResources().getStringArray(R.array.English_Alphabet_lower);

        CustomAdapter adapter=new CustomAdapter(this,lowerCase);
        English_lowercase.setAdapter(adapter);
    }
}
