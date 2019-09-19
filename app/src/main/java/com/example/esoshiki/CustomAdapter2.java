package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter2 extends BaseAdapter {


    Context context;
    String [] Cursive;
    LayoutInflater inflater;

    CustomAdapter2(Context context,String [] Cursive){
        this.context=context;
        this.Cursive=Cursive;

    }
    @Override
    public int getCount() {
        return Cursive.length;
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
            convertView=inflater.inflate(R.layout.custom_font,parent,false);
        }

        TextView tv= convertView.findViewById(R.id.tvCusive);
        tv.setText(Cursive[position]);

        return convertView;
    }
}
