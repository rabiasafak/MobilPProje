package com.example.tarifuyg;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class TarifList extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> name,tarif;
    DBHelper DB;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarif_list);
        DB= new DBHelper(this);
        name=new ArrayList<>();
        tarif=new ArrayList<>();
        recyclerView=findViewById(R.id.recyclerview);
        adapter=new MyAdapter(this,name,tarif);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        displayData();

    }

    private void displayData() {

        Cursor cursor=DB.getData();
        if(cursor.getCount()==0){
            Toast.makeText(TarifList.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            while(cursor.moveToNext())
            {
                name.add(cursor.getString(0));
                tarif.add(cursor.getString(1));
            }
        }

    }
}