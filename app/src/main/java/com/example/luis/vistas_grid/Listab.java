package com.example.luis.vistas_grid;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Listab extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public String[] toolbar_titles = new String[]{"Agro","Artes","Electricidad","Finanzas","Gastronomía","Idiomas","Salud","Tecnología"};
    public String[] bar_color = new String[]{"#4caf50","#e91e63","#607d8b","#009688","#ff9800","#9c27b0","#2196f3","#3f51b5"};
    public String[] statusbar_color = new String[]{"green_dark","pink_dark","blue_grey_dark","teal_dark","orange_dark","purple_dark","blue_dark","indigo_dark"};
    int position_list;
    String[] val = {};
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
        List<Listab_Data> DATA = new ArrayList<>();


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        //use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        //add the white line divider
        mRecyclerView.addItemDecoration(new DividerItemDecoration(this));

        //get data from MainActivity
        int position_grid = getIntent().getExtras().getInt("position");


        if (position_grid == 0) {
           // DATA.add(new Listab_Data(0,0,"ExpoAgro 2016"));
            val= new String[]{"Feria del Productor al Consumidor en la Facultad de Agronomía","Inseminación Artificial","XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología de los Alimentos"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.green_dark));
            // getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.agro_b));
        } else if (position_grid == 1) {
            val=new String[]{"Diseño Gráfico","Encuadernación","Impresión Offset","Serigrafía"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.pink_dark));
        } else if (position_grid == 2) {
            val= new String[]{"Automatización industrialo","Arrancadores suaves (Soft - starter)","Corrección de factor de potencia en instalaciones eléctricas","Controladores lógicos programables (PLCs)","Generadores de emergencia","Protección y puesta a tierra de instalaciones eléctricas","Sistema SCADA"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.blue_grey_dark));
        } else if (position_grid == 3) {
            val = new String[]{"Análisis del mercado", "Atención al cliente", "Como elaborar un plan de marketing", "Excel avanzado", "Flujo de caja", "Gestión de caja y tesorería"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.teal_dark));
        } else if (position_grid == 4) {
           val = new String[]{"Bartender","Catering para eventos","Cocina Dietética", "Chocolatería", "Pastelería Básica y de Autor",
                    "Panadería Básica","Protocolo y Ceremonial","Petit Chef – Cocina para niños", "Sushi", "Tortas y Pasteles"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.orange_dark));
        } else if (position_grid == 5) {
            val = new String[]{"Alemán", "Castellano", "Francés", "Guarani", "Italiano", "Japonés", "Mandarín", "Portugués"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.purple_dark));
        } else if (position_grid == 6) {
            val = new String[]{"Jornadas de Capacitación de Bioética", "Jornada de Actualización en Medicina Interna", "XIII Congreso Paraguayo de Medicina Interna"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.blue_dark));
        } else if (position_grid == 7) {
            val = new String[]{"Desarrollador Java", "MySQL", "Php Avanzado", "Web Master"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.indigo_dark));
        }

        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(bar_color[position_grid])));
        getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        populate(position_grid,position_list,DATA, val);
        //Intent intentb = new Intent(this,ListabAdapter.class);
        //intentb.putExtra("position_grid",position_grid);
        //specify an adapter

        mAdapter = new ListabAdapter(DATA);
        mRecyclerView.setAdapter(mAdapter);

    }

    public void populate(int grid,int i,List<Listab_Data> DATA,String[] val){
        for(i=0;i<val.length;i=i+1){
            DATA.add(new Listab_Data(grid,i,val[i]));
        }
    }

}