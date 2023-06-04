package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class KebapActivity extends AppCompatActivity {
    VideoView uu3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kebap);
        uu3=findViewById(R.id.uu3);
        uu3.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u3);
        MediaController med=new MediaController(this);
        uu3.setMediaController(med);
        med.setAnchorView(uu3);
        uu3.start();
    }
}