package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class BstavukActivity extends AppCompatActivity {
    VideoView uu1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bstavuk);
        uu1=findViewById(R.id.uu1);
        uu1.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u1);
        MediaController med=new MediaController(this);
        uu1.setMediaController(med);
        med.setAnchorView(uu1);
        uu1.start();
    }
}