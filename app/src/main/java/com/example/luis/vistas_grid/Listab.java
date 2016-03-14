package com.example.luis.vistas_grid;

import android.content.Intent;
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

public class Listab extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    public String[] valores = new String[] {"Aaaa","Bbbbb","Ccccc","Dddddd","Eeeeee"};
    public String[] toolbar_titles = new String[]{"Agro","Artes","Electricidad","Finanzas","Gastronomía","Idiomas","Salud","Tecnología"};
    public String[] Agro= new String[]{"Expoagro 2016", "Inseminación artificial",
            "Feria del Productor al Consumidor en la Facultad de Agronomía",
            "XIX Seminario Latinoamericano y del Caribe de Ciencia y Tecnología " +
                    "de los Alimentos y de las XI Jornadas Uruguayas de Ciencia y Tecnología de Alimentos"};
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

        //get data from MainActivity
        int position_grid = getIntent().getExtras().getInt("position");


        if (position_grid == 0) {
            valores = Agro;
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.green_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#4caf50")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);

            // getSupportActionBar().setBackgroundDrawable(getResources().getDrawable(R.drawable.agro_b));
            //getSupportActionBar().setTitle("Agro");
            // mRecyclerView.setBackgroundColor(getBaseContext().getResources().getColor(R.color.green));

        } else if (position_grid == 1) {
            valores = new String[]{"Diseño Gráfico", "Encuadernación", "Impresión Offset", "Serigrafía"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.pink_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#e91e63")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 2) {
            valores = new String[]{"Automatización industrial", "Arrancadores suaves (Soft - starter)",
                    "Corrección de factor de potencia en instalaciones eléctricas",
                    "Controladores lógicos programables (PLCs)",
                    "Generadores de emergencia",
                    "Protección y puesta a tierra de instalaciones eléctricas",
                    "Sistema SCADA"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.blue_grey_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#607d8b")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 3) {
            valores = new String[]{"Análisis del mercado", "Atención al cliente", "Como elaborar un plan de marketing", "Excel avanzado", "Flujo de caja", "Gestión de caja y tesorería"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.teal_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#009688")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 4) {
            valores = new String[]{"Bartender",
                    "Catering para eventos",
                    "Cocina Dietética", "Chocolatería", "Pastelería Básica y de Autor",
                    "Panadería Básica",
                    "Protocolo y Ceremonial", "Petit Chef – Cocina para niños", "Sushi", "Tortas y Pasteles"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.orange_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#ff9800")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 5) {
            valores = new String[]{"Alemán", "Castellano", "Francés", "Guarani", "Italiano", "Japonés", "Mandarín", "Portugués"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.purple_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#9c27b0")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 6) {
            valores = new String[]{"Jornadas de Capacitación de Bioética", "Jornada de Actualización en Medicina Interna", "XIII Congreso Paraguayo de Medicina Interna"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.blue_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#2196f3")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        } else if (position_grid == 7) {
            valores = new String[]{"Desarrollador Java", "MySQL", "Php Avanzado", "Web Master"};
            getWindow().setStatusBarColor(getBaseContext().getResources().getColor(R.color.indigo_dark));
            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(Color.parseColor("#3f51b5")));
            getSupportActionBar().setTitle(toolbar_titles[position_grid]);
        }

        Intent intentb = new Intent(this,MyAdapterb.class);
        intentb.putExtra("position_grid",position_grid);
        //specify an adapter
        mAdapter = new MyAdapterb(valores);
        mRecyclerView.setAdapter(mAdapter);

    }

}