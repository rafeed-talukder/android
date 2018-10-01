package com.example.hp.buttononclick1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count=0;
    private Button button,button1;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button= (Button) findViewById(R.id.buttonid1);
        button1= (Button)   findViewById(R.id.buttonid2);

        textView= (TextView) findViewById(R.id.textid1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("button is on click "+count +" times");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                textView.setText("logout is on click "+count +" times");

            }
        });
    }
}
