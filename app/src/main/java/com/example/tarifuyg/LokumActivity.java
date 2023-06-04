package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class LokumActivity extends AppCompatActivity {
    VideoView vv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lokum);
        vv7=findViewById(R.id.vv7);
        vv7.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w7);
        MediaController med=new MediaController(this);
        vv7.setMediaController(med);
        med.setAnchorView(vv7);
        vv7.start();
    }
}