package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class CupcakeActivity extends AppCompatActivity {
    VideoView vv20;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cupcake);

        vv20=findViewById(R.id.vv20);
        vv20.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w20);
        MediaController med=new MediaController(this);
        vv20.setMediaController(med);
        med.setAnchorView(vv20);
        vv20.start();
    }
}