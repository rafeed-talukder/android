package com.example.hp.imgview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView img1,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img1=(ImageView) findViewById(R.id.img1);
        img2=(ImageView) findViewById(R.id.img2);
    }


    public void show (View v)
    {
        if(v.getId()==R.id.img1)
        {
            Toast.makeText(MainActivity.this,"1 is clicked",Toast.LENGTH_SHORT).show();
        }

        if(v.getId()==R.id.img2)
        {
            Toast.makeText(MainActivity.this,"2 is clicked",Toast.LENGTH_SHORT).show();
        }
    }
}
