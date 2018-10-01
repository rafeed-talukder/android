package com.example.hp.edittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private EditText edittext1, edittext2;
    private Button button1, button2;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext1 = (EditText) findViewById(R.id.edittext1);
        edittext2 = (EditText) findViewById(R.id.edittext2);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);

        text1 = (TextView) findViewById(R.id.text1);


    }

    public void show(View v) {

        try {
            //convert to string

            String num1 = edittext1.getText().toString();
            String num2 = edittext2.getText().toString();

            //convert to double

            double n1 = Double.parseDouble(num1);
            double n2 = Double.parseDouble(num2);

            if (v.getId() == R.id.button1) {
                double sum = n1 + n2;
                text1.setText("Result " + sum);

            }

            if (v.getId() == R.id.button2) {
                double sub = n1 - n2;
                text1.setText("Result " + sub);

            }
        }
        catch (Exception e) {

            Toast.makeText(MainActivity.this, "enter number", Toast.LENGTH_SHORT).show();
        }
    }
}