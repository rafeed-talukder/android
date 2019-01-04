package com.example.hp.firstandroidprojectcountrydetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProActivity extends AppCompatActivity {

    private ImageView imgid;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        imgid=(ImageView)findViewById(R.id.imgid);
        text1=(TextView)findViewById(R.id.text1);

        Bundle bundle =getIntent().getExtras();

        if (bundle!=null)
        {
            String countryName=bundle.getString("tag1");

            showDetails (countryName);
        }



    }

   void showDetails(String countryName){

        if (countryName.equals("Bangladesh"))
        {
            imgid.setImageResource(R.drawable.bd);
            text1.setText(R.string.ban);

        }

       if (countryName.equals("india"))
       {
           imgid.setImageResource(R.drawable.ind);
           text1.setText(R.string.ind);

       }

       if (countryName.equals("pakistan"))
       {
           imgid.setImageResource(R.drawable.pakis);
           text1.setText(R.string.pak);

       }

   }

}