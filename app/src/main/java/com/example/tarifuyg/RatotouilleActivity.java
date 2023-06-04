package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class RatatouilleActivity extends AppCompatActivity {
    VideoView uu8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratatouille);
        uu8=findViewById(R.id.uu8);
        uu8.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u8);
        MediaController med=new MediaController(this);
        uu8.setMediaController(med);
        med.setAnchorView(uu8);
        uu8.start();
    }
}