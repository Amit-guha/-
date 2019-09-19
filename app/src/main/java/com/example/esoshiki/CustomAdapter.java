package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String [] Alphabet;
    LayoutInflater inflater;

    CustomAdapter(Context context,String [] Alphabet){
        this.context=context;
        this.Alphabet=Alphabet;
    }
    @Override
    public int getCount() {
        return Alphabet.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
           convertView= inflater.inflate(R.layout.english_alphabet,parent,false);
        }

        Button btn= convertView.findViewById(R.id.btnEng_alphabet);
        btn.setText(Alphabet[position]);

       // TextView tv=convertView.findViewById(R.id.tvCusive);
        //tv.setText(Alphabet[position]);

        return convertView;
    }
}
