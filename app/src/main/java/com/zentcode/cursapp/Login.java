package com.zentcode.cursapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button btn_login = (Button) findViewById(R.id.btn_acceder_fb);
        // btn_login.setOnClickListener(View.OnClickListener(){

        //});

      /*  View.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(final View v) {

            }
        };
        Intent intent = new Intent(v.getContext(),MainActivity.class);
        startActivity(intent);
    }*/
    }
}