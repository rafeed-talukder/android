package com.example.hp.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView text1;
    private Button button1;
    private DatePicker date1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView)findViewById(R.id.text1);
        button1=(Button)findViewById(R.id.button1);
        date1=(DatePicker)findViewById(R.id.date1);

        text1.setText(cuttentdate ());


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text1.setText(cuttentdate ());
            }
        });

    }

    String cuttentdate(){

        StringBuilder stringBuilder =new StringBuilder();

        stringBuilder.append(date1.getDayOfMonth() + "/");
        stringBuilder.append((date1.getMonth()+1) +"/");
        stringBuilder.append(date1.getYear());

        return stringBuilder.toString();
    }
}
