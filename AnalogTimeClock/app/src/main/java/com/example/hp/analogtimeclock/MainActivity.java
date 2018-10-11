package com.example.hp.analogtimeclock;

import android.support.constraint.solver.widgets.Analyzer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private AnalogClock analog;
    private TextClock textc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analog=(AnalogClock)findViewById(R.id.analog);
        textc=(TextClock)findViewById(R.id.textc);

        analog.setOnClickListener(this);
        textc.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        if(v.getId()==R.id.analog){
            Toast.makeText(MainActivity.this,"Analog is clicked",Toast.LENGTH_SHORT).show();
        }

       else if(v.getId()==R.id.textc){
            Toast.makeText(MainActivity.this,"Text is clicked",Toast.LENGTH_SHORT).show();
        }

    }
}
