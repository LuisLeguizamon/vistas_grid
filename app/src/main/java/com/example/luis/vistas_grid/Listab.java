package com.example.luis.vistas_grid;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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

/*        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //add the white line divider
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));


        //get data from another activity
        int position = getIntent().getExtras().getInt("position");

        if(position==0){
            valores = new String[]{"Expoagro 2016","Inseminación artificial",
                    "Feria del Productor al Consumidor en la Facultad de Agronomía",
                    "XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología " +
                            "de los Alimentos y de las XI Jornadas Uruguayas de Ciencia y Tecnología de Alimentos",
                    };
           // getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4caf50")));
            getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.agro_b));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.green));
        }

        else if(position==1){
            valores = new String[]{"Diseño Gráfico","Encuadernación","Impresión Offset","Serigrafía"};
           getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e91e63")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.pink));
        }

        else if(position==2){
            valores = new String[]{"Automatización industrial","Arrancadores suaves (Soft - starter)",
                    "Corrección de factor de potencia en instalaciones eléctricas",
                    "Controladores lógicos programables (PLCs)",
                    "Generadores de emergencia",
                    "Protección y puesta a tierra de instalaciones eléctricas",
                    "Sistema SCADA"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#607d8b")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.blue_grey));
        }

        else if(position==3){
            valores = new String[]{"Atención al Cliente","Como elaborar un plan de marketing","Excel Avanzado","Flujo de Caja","Gestión de Caja y Tesorería"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#009688")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.teal));
        }

        else if(position==4){
            valores = new String[]{"Bartender",
                    "Catering para eventos",
                    "Cocina Dietética","Chocolatería","Pastelería Básica y de Autor",
                    "Panadería Básica",
                    "Protocolo y Ceremonial","Petit Chef – Cocina para niños","Sushi","Tortas y Pasteles"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#f57c00")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.orange_dark));
        }

        else if(position==5){
            valores = new String[]{"Alemán","Castellano","Francés","Guarani","Italiano","Japonés","Mandarín","Portugués"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#673ab7")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.deep_purple));
        }

        else if(position==6){
            valores = new String[]{"Jornadas de Capacitación de Bioética","Jornada de Actualización en Medicina Interna","XIII Congreso Paraguayo de Medicina Interna"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196f3")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.blue));
        }

        else if(position==7){
            valores = new String[]{"Desarrollador Java","MySQL","Php Avanzado","Web Master"};
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
            mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.indigo));

        }

        //Log.d("position",String.valueOf(position));

        //specify an adapter
        mAdapter = new MyAdapterb(valores);
        mRecyclerView.setAdapter(mAdapter);

//        vh.itemView.setBackgroundColor(parent.getContext().getResources().getColor(R.color.blue_grey));
    }
}

