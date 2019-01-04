package com.example.hp.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioid;
    private RadioButton gender;
    private Button button1;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioid=(RadioGroup)findViewById(R.id.radioid);
        button1=(Button) findViewById(R.id.button1);
        text1=(TextView) findViewById(R.id.text1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               int radio= radioid.getCheckedRadioButtonId();
               gender= (RadioButton) findViewById(radio);
                String string = gender.getText().toString();

                text1.setText("you have selected " + string);
                
            }
        });
        }

    }

