package com.example.tarifuyg;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class ListKadapter extends BaseAdapter {
    Context context;
    ArrayList<Integer> arrayList;
    LayoutInflater layoutInflater;

    public ListKadapter(Context context, ArrayList<Integer> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent) {
        View view =layoutInflater.inflate(R.layout.item_file,parent,false);
        ImageView imageView=view.findViewById(R.id.imgfor);
        imageView.setImageResource(arrayList.get(position));
        return view;
    }
}
