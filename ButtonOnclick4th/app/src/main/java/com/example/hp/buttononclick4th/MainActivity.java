package com.example.hp.buttononclick4th;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button ami1,ami2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ami1=(Button) findViewById(R.id.ami1);
        ami2=(Button) findViewById(R.id.ami2);

        text1=(TextView)findViewById(R.id.text1);



    }

    public void showMessage (View v){

        if (v.getId()==R.id.ami1 )
        {
            text1.setText("login is clicked");
        }
        else
        {
          text1.setText("logout button is clicked");
        }



    }
}
