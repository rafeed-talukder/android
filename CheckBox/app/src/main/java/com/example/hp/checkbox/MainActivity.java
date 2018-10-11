package com.example.hp.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity  implements View.OnClickListener {

    private CheckBox milk,brade,water;
    private Button button1;
    private TextView text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milk= (CheckBox) findViewById(R.id.milk);
        brade= (CheckBox) findViewById(R.id.brade);
        water= (CheckBox) findViewById(R.id.water);

        button1=(Button)findViewById(R.id.button1);

        text2=(TextView)findViewById(R.id.text2);
    }


    @Override
    public void onClick(View v) {

            StringBuilder stringBuilder = new StringBuilder();

            if (milk.isChecked())
            {
                String string = milk.getText().toString();
                stringBuilder.append(string +"is odered" + "\n");
            }

            if (brade.isChecked())
            {
                String string = brade.getText().toString();
                stringBuilder.append(string +"is odered" + "\n");
            }

            if (water.isChecked())
            {
                String string = water.getText().toString();
                stringBuilder.append(string +"is odered");
            }

            text2.setText(stringBuilder);

    }
}
