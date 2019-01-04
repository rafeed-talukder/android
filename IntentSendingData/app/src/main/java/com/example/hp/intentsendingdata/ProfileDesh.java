package com.example.hp.intentsendingdata;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ProfileDesh extends AppCompatActivity {

    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_desh);

        text1=(TextView)findViewById(R.id.text1);

        Bundle bundle =getIntent().getExtras();
        if (bundle!=null){
            String string = bundle.getString("tag");
            text1.setText(string);
        }

    }
}
