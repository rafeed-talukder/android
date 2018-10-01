package com.example.hp.buttononclickinnerclass3rd;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button a, b, c;
    private TextView d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a = (Button) findViewById(R.id.a);
        b = (Button) findViewById(R.id.b);
        c = (Button) findViewById(R.id.c);
        d = (TextView) findViewById(R.id.d);


        Handler handler = new Handler();

        a.setOnClickListener(handler);
        b.setOnClickListener(handler);
        c.setOnClickListener(handler);


    }

    class Handler implements View.OnClickListener {

        @Override
        public void onClick(View v) {

            if (v.getId() == R.id.a) {
                d.setText("clicked on login");
            }
            else if (v.getId() == R.id.b) {
                d.setText("clicked on logout");
            }
            else {
                d.setText("clicked on login");
            }
        }
    }
}