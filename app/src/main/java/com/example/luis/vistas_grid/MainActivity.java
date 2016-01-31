package com.example.luis.vistas_grid;

import android.content.Intent;
import android.media.Image;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    static final String[] valores = new String[] {"Agro","Artes","Electricidad","Finanzas","Gastronomía","Tecnología","Idiomas","Salud"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);

        gridView.setAdapter(new ImageAdapter(this, valores));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "Wrong Input", Toast.LENGTH_LONG).show();
            }
        });}


    public void ir(View vista){
        Intent intent = new Intent(this,Listab.class);
        startActivity(intent);}



}


