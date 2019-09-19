package com.example.esoshiki;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewadapter> {

    private Context context;
    private List<Dataset>datasets;

    public RecyclerViewAdapter(Context context, List<Dataset> datasets) {
        this.context = context;
        this.datasets = datasets;
    }

    @NonNull
    @Override
    public viewadapter onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater;

        inflater=LayoutInflater.from(context);
         View view= inflater.inflate(R.layout.cardview_sample,parent,false);

        return new viewadapter(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewadapter holder, int position) {

        Dataset mdata=datasets.get(position);
        holder.tv1.setText(mdata.getDigit());
        holder.tvone.setText(mdata.getFull());

    }

    @Override
    public int getItemCount() {
        return datasets.size();
    }

    public static class viewadapter extends RecyclerView.ViewHolder {

        TextView tv1,tvone;

        public viewadapter(@NonNull View itemView) {
            super(itemView);

            tv1=itemView.findViewById(R.id.tvNumber1);
            tvone=itemView.findViewById(R.id.tvNumberOne);

        }
    }

}
