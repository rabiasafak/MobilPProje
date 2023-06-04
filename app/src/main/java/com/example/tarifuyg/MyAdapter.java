package com.example.tarifuyg;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyVievHolder>{

    private Context context;
    private ArrayList name_id,tarif_id;

    public MyAdapter(Context context, ArrayList name_id, ArrayList tarif_id) {
        this.context = context;
        this.name_id = name_id;
        this.tarif_id = tarif_id;
    }

    @NonNull
    @Override
    public MyVievHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.tarifentry,parent,false);
        return new MyVievHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyVievHolder holder, int position) {
        holder.name_id.setText(String.valueOf(name_id.get(position)));
        holder.tarif_id.setText(String.valueOf(tarif_id.get(position)));

    }

    @Override
    public int getItemCount() {
        return name_id.size();
    }

    public class MyVievHolder extends RecyclerView.ViewHolder {
        TextView name_id,tarif_id;
        public MyVievHolder(@NonNull View itemView) {
            super(itemView);
            name_id=itemView.findViewById(R.id.textname);
            tarif_id=itemView.findViewById(R.id.texttarif);

        }
    }
}
