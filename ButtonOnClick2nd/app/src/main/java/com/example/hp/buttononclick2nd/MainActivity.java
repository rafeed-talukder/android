package com.example.hp.buttononclick2nd;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int count=0;

    private Button b1,b2;
    private TextView text1;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button)  findViewById(R.id.b1);
        b2= (Button)  findViewById(R.id.b2);
        text1= (TextView) findViewById(R.id.text1);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {

        if( v.getId()== R.id.b1)
            count++;

        {
            text1.setText("login is clicked " +count+ " times");
        }
        if (v.getId() == R.id.b2)

        {
            text1.setText("logout is clicked");
        }

    }
}
