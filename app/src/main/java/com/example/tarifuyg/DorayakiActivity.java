package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class DorayakiActivity extends AppCompatActivity {
    VideoView vv15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dorayaki);
        vv15=findViewById(R.id.vv15);
        vv15.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w15);
        MediaController med=new MediaController(this);
        vv15.setMediaController(med);
        med.setAnchorView(vv15);
        vv15.start();
    }
}