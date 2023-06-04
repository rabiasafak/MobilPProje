package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ChurrosActivity extends AppCompatActivity {
    VideoView vv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_churros);

        vv3=findViewById(R.id.vv3);
        vv3.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w3);
        MediaController med=new MediaController(this);
        vv3.setMediaController(med);
        med.setAnchorView(vv3);
        vv3.start();
    }
}