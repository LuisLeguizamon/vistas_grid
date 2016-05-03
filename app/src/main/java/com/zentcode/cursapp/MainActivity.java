package com.zentcode.cursapp;

import android.content.Intent;
import android.os.Build;
import android.support.design.widget.AppBarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View colap = findViewById(R.id.collapsing_toolbar);

        gridView = (GridView) findViewById(R.id.grid_view);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            gridView.setNestedScrollingEnabled(true);
      }
       else if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            AppBarLayout.LayoutParams p = (AppBarLayout.LayoutParams) colap.getLayoutParams();
            p.setScrollFlags(0);
            colap.setLayoutParams(p);
        }
        View ll = findViewById(R.id.linearlayout);
        ll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(),ProfileActivity.class);
                startActivity(intent);
            }
        });

        //colap.setOnClickListener(AdapterView.OnItemClickListener){
        //Intent intent = new Intent(this,Fragment_profile.class);
        //};
        //public void onClick (View v){};

        // Construct the data source
        ArrayList<Data_Grid> DATA=new ArrayList<Data_Grid>();

        // Populating Data into GridView
        DATA.add(new Data_Grid(0,"Favoritos"));
        DATA.add(new Data_Grid(1,"Recomendados"));
        DATA.add(new Data_Grid(2,"Agro"));
        DATA.add(new Data_Grid(3,"Artes"));
        DATA.add(new Data_Grid(4,"Electricidad"));
        DATA.add(new Data_Grid(5,"Finanzas"));
        DATA.add(new Data_Grid(6,"Gastronomía"));
        DATA.add(new Data_Grid(7,"Idiomas"));
        DATA.add(new Data_Grid(8,"Salud"));
        DATA.add(new Data_Grid(9,"Tecnología"));

        // Create the adapter to convert the array to views
        MainAdapter adapter = new MainAdapter(this, DATA);
// Attach the adapter to a GridView

        gridView.setAdapter(adapter);

       }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.action_settings:
                Intent intent = new Intent(getApplicationContext(),Configuracion.class);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}