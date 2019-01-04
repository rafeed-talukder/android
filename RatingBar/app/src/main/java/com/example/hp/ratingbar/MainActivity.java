package com.example.hp.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RatingBar ratingid;
    private TextView text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ratingid = (RatingBar) findViewById(R.id.ratingid);
        text1 =(TextView)  findViewById(R.id.text1) ;

        text1.setText("value "+ratingid.getProgress());

        ratingid.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                text1.setText("value "+rating);
            }
        });
    }
}
