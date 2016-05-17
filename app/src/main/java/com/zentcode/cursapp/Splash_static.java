package com.zentcode.cursapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by luis on 17/05/16.
 */
public class Splash_static extends AppCompatActivity {
    public int counter = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        ImageView logo_splash = (ImageView) findViewById(R.id.img_logo);



        View.OnClickListener clickListener = new View.OnClickListener() {

            @Override
            public void onClick(final View v) {
                counter++;
                String counter_string= String.valueOf(counter);
                Toast.makeText(v.getContext(), counter_string, Toast.LENGTH_SHORT).show();
                if (counter==7){
                    counter=1;
                    Intent intent = new Intent(v.getContext(),MainActivity.class);
                    startActivity(intent);
                }
            }
        };

        logo_splash.setOnClickListener(clickListener);
    }
}
