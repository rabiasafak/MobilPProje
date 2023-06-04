package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class KoriActivity extends AppCompatActivity {
    VideoView uu5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kori);
        uu5=findViewById(R.id.uu5);
        uu5.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u5);
        MediaController med=new MediaController(this);
        uu5.setMediaController(med);
        med.setAnchorView(uu5);
        uu5.start();
    }
}