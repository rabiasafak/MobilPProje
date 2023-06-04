package com.example.tarifuyg;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class AnaYemekActivity extends AppCompatActivity {
    Button btnymk1;
    Button btnymk2;
    Button btnymk3;
    Button btnymk4;
    Button btnymk5;
    Button btnymk6;
    Button btnmyk7;
    Button btnymk8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ana_yemek);

        btnymk1=findViewById(R.id.btnyemek1);
        btnymk2=findViewById(R.id.btnyemek2);
        btnymk3=findViewById(R.id.btnyemek3);
        btnymk4=findViewById(R.id.btnyemek4);
        btnymk5=findViewById(R.id.btnyemek5);
        btnymk6=findViewById(R.id.btnyemek6);
        btnmyk7=findViewById(R.id.btnyemek7);
        btnymk8=findViewById(R.id.btnyemek8);

        btnymk8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bstavuk=new Intent(AnaYemekActivity.this,BstavukActivity.class);
                startActivity(bstavuk);
            }
        });




        btnmyk7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gnocci=new Intent(AnaYemekActivity.this,GnocciActivity.class);
                startActivity(gnocci);
            }
        });

        btnymk6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent osso=new Intent(AnaYemekActivity.this,OssoActivity.class);
                startActivity(osso);
            }
        });
        btnymk5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pelmeni=new Intent(AnaYemekActivity.this,PelmeniActivity.class);
                startActivity(pelmeni);
            }
        });

        btnymk4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kofte=new Intent(AnaYemekActivity.this,KofteActivity.class);
                startActivity(kofte);
            }
        });

        btnymk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kebap=new Intent(AnaYemekActivity.this,KebapActivity.class);
                startActivity(kebap);
            }
        });

        btnymk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kori=new Intent(AnaYemekActivity.this,KoriActivity.class);
                startActivity(kori);

            }
        });

        btnymk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ratato=new Intent(AnaYemekActivity.this,RatatouilleActivity.class);
                startActivity(ratato);

            }
        });
    }
}