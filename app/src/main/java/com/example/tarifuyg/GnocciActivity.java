package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class GnocciActivity extends AppCompatActivity {
    VideoView uu2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gnocci);
        uu2=findViewById(R.id.uu2);
        uu2.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u2);
        MediaController med=new MediaController(this);
        uu2.setMediaController(med);
        med.setAnchorView(uu2);
        uu2.start();
    }
}