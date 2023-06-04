package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DonutActivity extends AppCompatActivity {
    VideoView vv16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donut);
        vv16=findViewById(R.id.vv16);
        vv16.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w16);
        MediaController med=new MediaController(this);
        vv16.setMediaController(med);
        med.setAnchorView(vv16);
        vv16.start();

    }
}