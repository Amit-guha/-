package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

public class CustomAdapterWord extends BaseAdapter {
    Context context;
    String [] English_word;
    String [] alphabet;
    //int [] images;
    String [] Bangla;
    LayoutInflater inflater;


    CustomAdapterWord(Context context,String [] alphabet,String [] English_word, String [] Bangla){
        this.context=context;
        this.English_word=English_word;
        this.alphabet=alphabet;
        this.Bangla=Bangla;
    }

    @Override
    public int getCount() {
        return English_word.length;
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
           convertView=inflater.inflate(R.layout.mangoupdate,parent,false);
        }

       TextView tv_borno= convertView.findViewById(R.id.tvBorno);
       TextView tv_word= convertView.findViewById(R.id.tvMango);
       TextView tvbangla=convertView.findViewById(R.id.tvM);
       // CircleImageView circleImageView=convertView.findViewById(R.id.Circle_contact);

        tv_borno.setText(English_word[position]);
        tv_word.setText(Bangla[position]);
        tvbangla.setText(alphabet[position]);
       // circleImageView.setImageResource(images[position]);

        return convertView;
    }
}
