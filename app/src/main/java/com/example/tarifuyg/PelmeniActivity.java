package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class PelmeniActivity extends AppCompatActivity {
    VideoView uu7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pelmeni);
        uu7=findViewById(R.id.uu7);
        uu7.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u7);
        MediaController med=new MediaController(this);
        uu7.setMediaController(med);
        med.setAnchorView(uu7);
        uu7.start();
    }
}