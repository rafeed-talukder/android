package com.example.hp.firstandroidprojectcountrydetails;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button bangladeshid,indiaid,pakistanid;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshid=(Button)findViewById(R.id.bangladeshid);
        indiaid=(Button)findViewById(R.id.indiaid);
        pakistanid=(Button)findViewById(R.id.pakistanid);

        bangladeshid.setOnClickListener(this);
        indiaid.setOnClickListener(this);
        pakistanid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.bangladeshid)
        {
            Intent intent=new Intent(MainActivity.this,ProActivity.class);
            intent.putExtra("tag1","Bangladesh");
            startActivity(intent);
        }

        if (v.getId()==R.id.indiaid)
        {
            Intent intent=new Intent(MainActivity.this,ProActivity.class);
            intent.putExtra("tag1","india");
            startActivity(intent);
        }

        if (v.getId()==R.id.pakistanid)
        {
            Intent intent=new Intent(MainActivity.this,ProActivity.class);
            intent.putExtra("tag1","pakistan");
            startActivity(intent);
        }

    }
}
