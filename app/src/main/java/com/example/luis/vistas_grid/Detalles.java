package com.example.luis.vistas_grid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    public String[] cat = new String[]{"Agro","Artes","Electricidad","Finanzas","Gastronomía","Idiomas","Salud","Tecnología"};

    public String[] Agro= new String[]{"Expoagro 2016", "Inseminación artificial",
            "Feria del Productor al Consumidor en la Facultad de Agronomía",
            "XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología " +
                    "de los Alimentos y de las XI Jornadas Uruguayas de Ciencia y Tecnología de Alimentos"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        //get data from MyAdapterb
        int position_list = getIntent().getExtras().getInt("position_list");
        Log.d("r=", String.valueOf(position_list));
        int position_grid= position_list;

//        int position_grid = getIntent().getExtras().getInt("position_grid");

  //      Log.d("position_grid=", String.valueOf(position_grid));

        // String[] titles = getIntent().getExtras().getStringArray("toolbar_titles");
        // Log.d("R=",titles[position]);

        //get data from MyAdapterb activity
      //  int position_lista = getIntent().getExtras().getInt("position");

        getSupportActionBar().setTitle("Detalles");
        if (position_grid== 0) {
        }
        else if (position_grid==1){

        }
        else if (position_grid==2){

        }
        else if (position_grid==3){

        }
        else if (position_grid==4){

        }
        else if (position_grid==5){

        }
        else if (position_grid==6){

        }
        else if (position_grid==7){

        }

        // public void set_title(int position, String[] titles){}

    }
}
