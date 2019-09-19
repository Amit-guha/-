package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SevendaysAdapter extends RecyclerView.Adapter<SevendaysAdapter.viewadater> {
    Context context;
    List<Dataset>datasets;

    public SevendaysAdapter(Context context, List<Dataset> datasets) {
        this.context = context;
        this.datasets = datasets;
    }

    @NonNull
    @Override
    public viewadater onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);

        View view=inflater.inflate(R.layout.seven_days,parent,false);


        return new viewadater(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewadater holder, int position) {
            Dataset dataset=datasets.get(position);
            holder.tv1.setText(dataset.getDigit());
            holder.tvword.setText(dataset.getFull());

    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    public  static class viewadater extends RecyclerView.ViewHolder{

        TextView tv1;
        TextView tvword;

        public viewadater(@NonNull View itemView) {
            super(itemView);

            tv1=itemView.findViewById(R.id.tvNumber1);
            tvword=itemView.findViewById(R.id.tvNumberOne);
        }
    }
}
