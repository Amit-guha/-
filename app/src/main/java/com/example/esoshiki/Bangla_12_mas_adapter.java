package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Bangla_12_mas_adapter extends RecyclerView.Adapter<Bangla_12_mas_adapter.Viewadapter> {
    Context context;
    private List<Dataset>datasets;

    public Bangla_12_mas_adapter(Context context, List<Dataset> datasets) {
        this.context = context;
        this.datasets = datasets;
    }

    @NonNull
    @Override
    public Viewadapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater=LayoutInflater.from(context);
       View view= layoutInflater.inflate(R.layout.cardview12mas,parent,false);

        return new Viewadapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Viewadapter holder, int position) {
        Dataset mdata=datasets.get(position);
        holder.tv1.setText(mdata.getDigit());
        holder.tvword.setText(mdata.getFull());

    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    public  static class Viewadapter extends RecyclerView.ViewHolder{

        TextView tv1;
        TextView tvword;

        public Viewadapter(@NonNull View itemView) {
            super(itemView);

            tv1=itemView.findViewById(R.id.tvNumber1);
            tvword=itemView.findViewById(R.id.tvNumberOne);
        }
    }
}
