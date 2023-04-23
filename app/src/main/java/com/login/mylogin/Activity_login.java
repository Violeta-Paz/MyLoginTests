package com.login.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_login extends AppCompatActivity {

    EditText name, pass;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        name = (EditText)findViewById(R.id.name);
        pass = (EditText)findViewById(R.id.pass);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation();
            }
        });

    }

    private void validation(){
        String name_value = name.getText().toString();
        String pass_value = pass.getText().toString();

        if (name_value.length() >= 3 && pass_value.length() >= 8){

            Bundle send = new Bundle();
            send.putString("name", name_value);

            Intent intent = new Intent(Activity_login.this, Activity_home.class);

            intent.putExtras(send);
            startActivity(intent);
            finish();
        }else {
            Toast.makeText(this, "Invalid fields", Toast.LENGTH_LONG).show();
        }

    }


}