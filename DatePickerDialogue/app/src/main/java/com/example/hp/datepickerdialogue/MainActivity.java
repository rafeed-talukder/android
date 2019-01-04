package com.example.hp.datepickerdialogue;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView text1;
    private Button button1;
    private DatePicker datePickerdialouge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1=(TextView)findViewById(R.id.text1);
        button1=(Button)findViewById(R.id.button1);

        button1.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        DatePicker datePicker =new DatePicker(this);

        int date =datePicker.getDayOfMonth();

        int month =(datePicker.getMonth())+1;

        int year=datePicker.getYear();


        datePickerdialouge = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                        text1.setText(dayOfMonth+"/"+(month+1)+"/"+year);

                    }
                }year,month,date);



        datePickerdialouge.show();
    }
}
