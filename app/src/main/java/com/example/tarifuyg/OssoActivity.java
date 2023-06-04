package com.example.tarifuyg;


import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class OssoActivity extends AppCompatActivity {
    VideoView uu6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_osso);
        uu6=findViewById(R.id.uu6);
        uu6.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u6);
        MediaController med=new MediaController(this);
        uu6.setMediaController(med);
        med.setAnchorView(uu6);
        uu6.start();
    }
}