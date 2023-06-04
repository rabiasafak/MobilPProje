package com.example.tarifuyg;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class CheesecakeActivity extends AppCompatActivity {
    VideoView vv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheesecake);
        vv4=findViewById(R.id.vv4);
        vv4.setVideoPath("android.resource://" +getPackageName()+ "/" + R.raw.w4);
        MediaController med=new MediaController(this);
        vv4.setMediaController(med);
        med.setAnchorView(vv4);
        vv4.start();
    }
}