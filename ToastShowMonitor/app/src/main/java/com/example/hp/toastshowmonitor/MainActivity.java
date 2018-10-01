package com.example.hp.toastshowmonitor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;
    TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button1=(Button)findViewById(R.id.button2);
        text1=(TextView)findViewById(R.id.text1);

    }

    public void showMessage(View v){
        if (v.getId()==R.id.button1)
        {
            Log.d("tag","login is clicked");
        }
        else{
            Log.d("tag","logout is clicked");
        }

    }
}
