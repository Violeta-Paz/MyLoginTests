package com.login.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TimerTask home = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, Activity_login.class);
                startActivity(intent);
                finish();
            }
        };
        Timer time = new Timer();
        time.schedule(home, 3000);
    }
}