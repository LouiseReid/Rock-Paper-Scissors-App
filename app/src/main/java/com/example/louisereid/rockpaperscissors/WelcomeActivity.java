package com.example.louisereid.rockpaperscissors;

import android.content.Intent;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        start = (Button)findViewById(R.id.startBtn);
    }

    public void onStartButtonClicked(View button){
        Intent i = new Intent(this, Main2Activity.class);
        startActivity(i);
    }


}
