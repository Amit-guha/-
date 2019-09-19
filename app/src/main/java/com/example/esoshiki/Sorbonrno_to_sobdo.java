package com.example.esoshiki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Sorbonrno_to_sobdo extends AppCompatActivity {
    private ListView listView;
    private String[]English_word;
   // int []images={R.drawable.mango};
    private String [] alphabet;
    private  String [] Bangla;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorbonrno_to_sobdo);

        listView=findViewById(R.id.ListSobdo);
        English_word=getResources().getStringArray(R.array.English_word);
        alphabet=getResources().getStringArray(R.array.English_Alphabet);
        Bangla=getResources().getStringArray(R.array.englishtobangla);

        CustomAdapterWord adapterWord=new CustomAdapterWord(this,alphabet,English_word,Bangla);
        listView.setAdapter(adapterWord);
    }
}
