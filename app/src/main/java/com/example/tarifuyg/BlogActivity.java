package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BlogActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Integer> arrayList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        listView=findViewById(R.id.listview);
        arrayList.add(R.drawable.sunum1);
        arrayList.add(R.drawable.sunum4);
        arrayList.add(R.drawable.sunum3);
        arrayList.add(R.drawable.sunum5);
        arrayList.add(R.drawable.sunum6);
        arrayList.add(R.drawable.sunum7);
        arrayList.add(R.drawable.sunum8);
        arrayList.add(R.drawable.sunum9);
        arrayList.add(R.drawable.sunum10);
        arrayList.add(R.drawable.sunum11);
        arrayList.add(R.drawable.sunum12);
        arrayList.add(R.drawable.sunum13);
        arrayList.add(R.drawable.sunum14);
        arrayList.add(R.drawable.sunum15);
        arrayList.add(R.drawable.sunum16);
        arrayList.add(R.drawable.sunum19);
        arrayList.add(R.drawable.sunum20);
        arrayList.add(R.drawable.sunum22);
        arrayList.add(R.drawable.sunum23);
        ListKadapter listKadapter=new ListKadapter(BlogActivity.this,arrayList);
        listView.setAdapter(listKadapter);

    }
}
    }
