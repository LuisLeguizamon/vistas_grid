package com.zentcode.cursapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Detalles extends AppCompatActivity {
    List<Data_Detalles> DATA = new ArrayList<>();
    public String[] bar_color = General.bar_color;
    public int[] statusbar_color = General.statusbar_color;
    public String[] toolbar_titles = General.toolbar_titles;

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
                Snackbar.make(view, "Curso agregado a Favoritos", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


        DATA.add(new Data_Detalles(2, 0, "Feria del productor al consumidor en la Facultad de Agronomía",
                "Las mejores propuestas gastronómicas y renovados eventos, pasá una tarde diferente rodeada de más de 120 productores, economía social y solidaria y comercio justo, en un espacio verde pensado para relajarse",
                "10 de marzo - 13 de marzo / 8:00 a 11:00 hs", "100.000 Gs",
                "Facultad de Agronomía UNA", "0981200100"));

        DATA.add(new Data_Detalles(2, 1, "Inseminación artificial",
                "Las mejores propuestas gastronómicas y renovados eventos, pasá una tarde diferente rodeada de más de 120 productores, economía social y solidaria y comercio justo, en un espacio verde pensado para relajarse",
                "10 de marzo - 13 de marzo / 8:00 a 11:00 hs", "100.000 Gs",
                "Facultad de Agronomía UNA", "0981200100"));

        DATA.add(new Data_Detalles(2, 2, "XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología de los Alimentos",
                "Las mejores propuestas gastronómicas y renovados eventos, pasá una tarde diferente rodeada de más de 120 productores, economía social y solidaria y comercio justo, en un espacio verde pensado para relajarse",
                "10 de marzo - 13 de marzo / 8:00 a 11:00 hs", "100.000 Gs",
                "Facultad de Agronomía UNA", "0981200100"));

        DATA.add(new Data_Detalles(3, 0, "Diseño Gráfico",
                "Las mejores propuestas gastronómicas y renovados eventos, pasá una tarde diferente rodeada de más de 120 productores, economía social y solidaria y comercio justo, en un espacio verde pensado para relajarse",
                "10 de marzo - 13 de marzo / 8:00 a 11:00 hs", "100.000 Gs",
                "SNPP", "0981200100"));

        DATA.add(new Data_Detalles(3, 1, "Encuadernación",
                "Las mejores propuestas gastronómicas y renovados eventos, pasá una tarde diferente rodeada de más de 120 productores, economía social y solidaria y comercio justo, en un espacio verde pensado para relajarse",
                "10 de marzo - 13 de marzo / 8:00 a 11:00 hs", "100.000 Gs",
                "SNPP", "0981200100"));

        //get data from ListabAdapter

        int position_grid = getIntent().getExtras().getInt("position_grid");
        int position_list = getIntent().getExtras().getInt("position_list");

        int position_detalle=1;
        if(position_grid ==2 && position_list ==0){position_detalle=0;}
        else if(position_grid ==2 && position_list ==1){position_detalle=1;}
        else if(position_grid ==2 && position_list ==2){position_detalle=2;}
        else if(position_grid ==3 && position_list ==0){position_detalle=3;}
        else if(position_grid ==3 && position_list ==1){position_detalle=4;}


        asign(DATA, position_detalle);
        if(Build.VERSION.SDK_INT>=21){getWindow().setStatusBarColor(ContextCompat.getColor(this.getApplicationContext(), statusbar_color[position_grid]));}
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(bar_color[position_grid])));
        getSupportActionBar().setTitle(toolbar_titles[position_grid]);

    }
    public void asign(List<Data_Detalles> DATA,int position){

        TextView titulo= (TextView)findViewById(R.id.txv_titulo);
        titulo.setText(DATA.get(position).titulo);

        TextView descripcion = (TextView) findViewById(R.id.txv_descripcion);
        descripcion.setText(DATA.get(position).descripcion);

        TextView duracion_horario= (TextView)findViewById(R.id.txv_duracion);
        duracion_horario.setText(DATA.get(position).duracion_horario);

        TextView costo= (TextView)findViewById(R.id.txv_costo);
        costo.setText(DATA.get(position).costo);

        TextView lugar = (TextView) findViewById(R.id.txv_lugar);
        lugar.setText(DATA.get(position).lugar);

        TextView contacto = (TextView) findViewById(R.id.txv_contacto);
        contacto.setText(DATA.get(position).contacto);
    }
}
