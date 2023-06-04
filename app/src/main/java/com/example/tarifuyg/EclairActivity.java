package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class EclairActivity extends AppCompatActivity {
    VideoView vv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eclair);
        vv2=findViewById(R.id.vv2);
        vv2.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w2);
        MediaController med=new MediaController(this);
        vv2.setMediaController(med);
        med.setAnchorView(vv2);
        vv2.start();
    }
}