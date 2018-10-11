package com.example.hp.alertdialouge;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button button;
    private AlertDialog.Builder alertdialougebuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        alertdialougebuilder=new AlertDialog.Builder(MainActivity.this);

        alertdialougebuilder.setIcon(R.drawable.login);
        alertdialougebuilder.setTitle("Alert Tittle");
        alertdialougebuilder.setMessage("Do you want to exit");

        alertdialougebuilder.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        alertdialougebuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        alertdialougebuilder.setNeutralButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this,"U Clicked cancle",Toast.LENGTH_SHORT).show();
            }
        });

        AlertDialog alertDialog =alertdialougebuilder.create();
        alertDialog.show();


    }
}
