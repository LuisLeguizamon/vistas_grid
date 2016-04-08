package com.zentcode.cursapp;

import android.content.Intent;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.zentcode.cursapp.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            gridView.setNestedScrollingEnabled(true);
      }


        // Construct the data source
        ArrayList<Grid_Data> DATA=new ArrayList<Grid_Data>();

        // Populating Data into GridView
        DATA.add(new Grid_Data(0,"Agro"));
        DATA.add(new Grid_Data(1,"Artes"));
        DATA.add(new Grid_Data(2,"Electricidad"));
        DATA.add(new Grid_Data(3,"Finanzas"));
        DATA.add(new Grid_Data(4,"Gastronomía"));
        DATA.add(new Grid_Data(5,"Idiomas"));
        DATA.add(new Grid_Data(6,"Salud"));
        DATA.add(new Grid_Data(7,"Tecnología"));

        // Create the adapter to convert the array to views
        ImageAdapter adapter = new ImageAdapter(this, DATA);
// Attach the adapter to a GridView

        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ir(position);
            }
        });}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void ir(int position_grid) {
        Intent intent = new Intent(this,Listab.class);
        intent.putExtra("position", position_grid);
        startActivity(intent);
    }

}