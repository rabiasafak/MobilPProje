package com.example.tarifuyg;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class TariflerimActivity extends AppCompatActivity {
    EditText name,tarif;
    Button insert,view;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tariflerim);
        name=findViewById(R.id.name);
        tarif=findViewById(R.id.tarif);
        insert=findViewById(R.id.btninsert);
        view=findViewById(R.id.btnview);
        DB=new DBHelper(this);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TariflerimActivity.this,TarifList.class));
            }
        });
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT= name.getText().toString();
                String tarifTXT= tarif.getText().toString();


                Boolean checkinsertdata= DB.inserttarifdata(nameTXT,tarifTXT);
                if (checkinsertdata==true){
                    Toast.makeText(TariflerimActivity.this, "New Entry Inserted", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(TariflerimActivity.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}