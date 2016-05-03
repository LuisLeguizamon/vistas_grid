package com.zentcode.cursapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by luis on 02/05/16.
 */
public class Configuracion extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_configuracion);

        View btn_cerrar_sesion = findViewById(R.id.btn_cerrar_sesion);
        btn_cerrar_sesion.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v){
            Dialogshow();
        }});

    }

    public void Dialogshow() {
        DialogFragment newFragment = new DialogAlert_Logout();
        newFragment.show(getSupportFragmentManager(), "cerrar_sesion");
    }
}

