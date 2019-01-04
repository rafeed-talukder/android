package com.example.hp.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private TimePicker time1;
    private TextView text1;
    private Button button1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        time1=(TimePicker)findViewById(R.id.time1) ;
        time1.setIs24HourView(true);
        text1= (TextView) findViewById(R.id.text1);
        button1= (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time =time1.getCurrentHour()+":"+time1.getCurrentMinute();
                text1.setText(time);
            }
        });
    }
}
