package com.example.hp.buttonclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int count=0;
    private Button button1,button2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        button1=  (Button) findViewById(R.id.button1);
        button2=(Button) findViewById(R.id.button2);
        text1= (TextView) findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                text1.setText("press onn login " +count
                 +" times");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                text1.setText("press on logout "+count +" times");
            }
        });




    }
}
