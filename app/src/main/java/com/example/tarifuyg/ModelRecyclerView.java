package com.example.tarifuyg;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ModelRecyclerView extends RecyclerView.Adapter<ModelRecyclerView.ViewHolder> {
    Context context;
    ArrayList<Model> arrayList=new ArrayList<>();
    public ModelRecyclerView(Context context,ArrayList<Model>arrayList){


        this.context= context;
        this.arrayList=arrayList;

    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(context).inflate(R.layout.card_view,parent,false);

        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        holder.imageView.setImageResource(arrayList.get(position).getImage());
        holder.textView1.setText(arrayList.get(position).getName());
        holder.textView2.setText(arrayList.get(position).getTarif());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "Tarif"+ position, Toast.LENGTH_LONG).show();
                Intent intent= new Intent(context,MainActivity2.class);
                intent.putExtra("yemekresmi",arrayList.get(position).getImage());
                intent.putExtra("name",arrayList.get(position).getName());
                intent.putExtra("tarif",arrayList.get(position).getTarif());
                context.startActivity(intent);


            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView1,textView2;
        CardView cardView;



        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageView);
            textView2=itemView.findViewById(R.id.textView2);
            textView1=itemView.findViewById(R.id.textView);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
