package com.example.tarifuyg;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DessertActivity extends AppCompatActivity {
    Button tatli1;
    Button tatli2;
    Button tatli3;
    Button tatli4;
    Button tatli5;
    Button tatli6;
    Button tatli7;
    Button tatli8;
    Button tatli9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
        tatli1=findViewById(R.id.btntatli1);
        tatli2=findViewById(R.id.btntatli2);
        tatli3=findViewById(R.id.btntatli3);
        tatli4=findViewById(R.id.btntatli4);
        tatli5=findViewById(R.id.btntatli5);
        tatli6=findViewById(R.id.btntatli6);
        tatli7=findViewById(R.id.btntatli7);
        tatli8=findViewById(R.id.btntatli8);
        tatli9=findViewById(R.id.btntatli9);

        tatli9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ekler=new Intent(DessertActivity.this,EclairActivity.class);
                startActivity(ekler);
            }
        });

        tatli8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent oreo=new Intent(DessertActivity.this,DorayakiActivity.class);
                startActivity(oreo);
            }
        });
        tatli7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent vanilla=new Intent(DessertActivity.this,CupcakeActivity.class);
                startActivity(vanilla);
            }
        });

        tatli6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tiramisu= new Intent(DessertActivity.this,TiramisuActivity.class);
                startActivity(tiramisu);
            }
        });

        tatli5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lokum=new Intent(DessertActivity.this,LokumActivity.class);
                startActivity(lokum);
            }
        });

        tatli4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent donut=new Intent(DessertActivity.this,DonutActivity.class);
                startActivity(donut);
            }
        });
        tatli3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cheesecake=new Intent(DessertActivity.this,CheesecakeActivity.class);
                startActivity(cheesecake);
            }
        });

        tatli2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent churros =new Intent(DessertActivity.this,ChurrosActivity.class);
                startActivity(churros);
            }
        });
        tatli1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent krembrule=new Intent(DessertActivity.this,CremeBruleActivity.class);
                startActivity(krembrule);
            }
        });
    }
}