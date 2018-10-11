package com.example.hp.customtoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1= (Button) findViewById(R.id.button1) ;


    }

    public void show (View v){

        LayoutInflater inflater = getLayoutInflater();
        View customview = inflater.inflate(R.layout.customlayout, (ViewGroup) findViewById(R.id.customid));

        Toast toast = new Toast (MainActivity.this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER,0,0);
        toast.setView(customview);
        toast.show();




    }
}
