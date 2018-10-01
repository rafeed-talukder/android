package com.example.hp.toast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button1,button2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        text1=(TextView) findViewById(R.id.text1);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()== R.id.button1 ){
            Toast.makeText(MainActivity.this,"login is clicked",Toast.LENGTH_SHORT).show();



        }

        else if (v.getId()==R.id.button2)
        {
            Toast.makeText(MainActivity.this,"logout is clicked",Toast.LENGTH_SHORT).show();
        }
    }
}
