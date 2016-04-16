package com.zentcode.cursapp;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.zentcode.cursapp.R;

import java.util.ArrayList;
import java.util.List;

public class Listab extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public String[] bar_color = General.bar_color;
    public int[] statusbar_color = General.statusbar_color;
    public String[] toolbar_titles = General.toolbar_titles;
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


        if (position_grid == 1) {
            val= new String[]{"Feria del Productor al Consumidor en la Facultad de Agronomía","Inseminación Artificial","XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología de los Alimentos"};
            // getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.agro_b));
        } else if (position_grid == 2) {
            val=new String[]{"Diseño Gráfico","Encuadernación","Impresión Offset","Serigrafía"};
        } else if (position_grid == 4) {
            val= new String[]{"Automatización industrialo","Arrancadores suaves (Soft - starter)","Corrección de factor de potencia en instalaciones eléctricas","Controladores lógicos programables (PLCs)","Generadores de emergencia","Protección y puesta a tierra de instalaciones eléctricas","Sistema SCADA"};
        } else if (position_grid == 5) {
            val = new String[]{"Análisis del mercado", "Atención al cliente", "Como elaborar un plan de marketing", "Excel avanzado", "Flujo de caja", "Gestión de caja y tesorería"};
        } else if (position_grid == 6) {
           val = new String[]{"Bartender","Catering para eventos","Cocina Dietética", "Chocolatería", "Pastelería Básica y de Autor",
                    "Panadería Básica","Protocolo y Ceremonial","Petit Chef – Cocina para niños", "Sushi", "Tortas y Pasteles"};
        } else if (position_grid == 7) {
            val = new String[]{"Alemán", "Castellano", "Francés", "Guarani", "Italiano", "Japonés", "Mandarín", "Portugués"};
        } else if (position_grid == 8) {
            val = new String[]{"Jornadas de Capacitación de Bioética", "Jornada de Actualización en Medicina Interna", "XIII Congreso Paraguayo de Medicina Interna"};
        } else if (position_grid == 9) {
            val = new String[]{"Desarrollador Java", "MySQL", "Php Avanzado", "Web Master"};
        }
        if(Build.VERSION.SDK_INT>=21){getWindow().setStatusBarColor(ContextCompat.getColor(this.getApplicationContext(), statusbar_color[position_grid]));}
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor(bar_color[position_grid])));
        getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        populate(position_grid,position_list,DATA, val);

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