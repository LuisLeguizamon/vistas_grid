package com.example.luis.vistas_grid;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;

public class Listab extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public String[] valores = new String[] {"Aaaa","Bbbbb","Ccccc","Dddddd","Eeeeee"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listab);
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

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));

        int position = getIntent().getExtras().getInt("position");

        if(position==0){
            valores = new String[]{"Expoagro 2016","Inseminación artificial",
                    "Feria del Productor al Consumidor en la Facultad de Agronomía",
                    "XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología " +
                            "de los Alimentos y de las XI Jornadas Uruguayas de Ciencia y Tecnología de Alimentos",

                    };

        }

        else if(position==1){
            valores = new String[]{"Diseño Gráfico","Encuadernación","Impresión Offset","Serigrafía"};
        }

        else if(position==2){
            valores = new String[]{"Automatización industrial","Arrancadores suaves (Soft - starter)",
                    "Corrección de factor de potencia en instalaciones eléctricas",
                    "Controladores lógicos programables (PLCs)",
                    "Generadores de emergencia",
                    "Protección y puesta a tierra de instalaciones eléctricas",
                    "Sistema SCADA"};
        }



        else if(position==3){
            valores = new String[]{"Ddd","d","d","d","d"};
        }

        else if(position==4){
            valores = new String[]{"Eee","e","e","e","e"};
        }

        else if(position==5){
            valores = new String[]{"Fff","f","f","f","f"};
        }

        else if(position==6){
            valores = new String[]{"Ggg","g","g","g","g"};
        }

        else if(position==7){
            valores = new String[]{"Hhh","h","h","h","h"};
        }

        //Log.d("position",String.valueOf(position));



        //specify an adapter
        mAdapter = new MyAdapterb(valores);
        mRecyclerView.setAdapter(mAdapter);

        //mRecyclerView.addItemDecoration(new DividerItemDecoration(this));

    }

}

