package com.example.hp.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URI;

public class MainActivity extends AppCompatActivity {
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video=(VideoView)findViewById(R.id.video);

        Uri uri =Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.new);

    }
}
