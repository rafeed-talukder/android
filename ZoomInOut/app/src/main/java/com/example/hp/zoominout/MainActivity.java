package com.example.hp.zoominout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView img;
    private ZoomControls zoom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.img);
        zoom=(ZoomControls)findViewById(R.id.zoom);

        zoom.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=img.getScaleX();
                float y=img.getScaleY();

                Toast.makeText(MainActivity.this,"ZOOM IN",Toast.LENGTH_SHORT).show();

                if (x<5 && y<5)
                {
                    img.setScaleX((float)x+1);
                    img.setScaleY((float)y+1);
                }
            }
        });


        zoom.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x=img.getScaleX();
                float y=img.getScaleY();

                Toast.makeText(MainActivity.this,"ZOOM OUT",Toast.LENGTH_SHORT).show();

                if (x>1 && y>1)
                {
                    img.setScaleX((float)x-1);
                    img.setScaleY((float)y-1);
                }
            }
        });

    }
}
