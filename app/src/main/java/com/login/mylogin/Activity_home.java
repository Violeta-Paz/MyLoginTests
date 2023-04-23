package com.login.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Activity_home extends AppCompatActivity {

    TextView welcome;
    Button finish;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        welcome = (TextView)findViewById(R.id.welcome);
        finish = (Button)findViewById(R.id.finish);

        Bundle sent = getIntent().getExtras();
        String data = sent.getString("name");

        welcome.setText(data);


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "bye!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Activity_home.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}