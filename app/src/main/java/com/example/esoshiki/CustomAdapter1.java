package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

public class CustomAdapter1 extends BaseAdapter {
    Context context;
    String [] lowercase;
    LayoutInflater inflater;

    CustomAdapter1(Context context,String [] lowercase){
        this.context=context;
        this.lowercase=lowercase;

    }
    @Override
    public int getCount() {
        return lowercase.length;
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
            convertView=inflater.inflate(R.layout.number,parent,false);
        }

       Button btn= convertView.findViewById(R.id.btn_number);
        btn.setText(lowercase[position]);

        return convertView;
    }
}
