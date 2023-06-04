package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class KofteActivity extends AppCompatActivity {
    VideoView uu4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kofte);
        uu4=findViewById(R.id.uu4);
        uu4.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.u4);
        MediaController med=new MediaController(this);
        uu4.setMediaController(med);
        med.setAnchorView(uu4);
        uu4.start();
    }
}