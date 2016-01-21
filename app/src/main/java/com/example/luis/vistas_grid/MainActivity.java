package com.example.luis.vistas_grid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    static final String[] valores = new String[] {"Agro","Artes","Electricidad","Finanzas","Gastronomía","Tecnología","Idiomas","Salud"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = (GridView) findViewById(R.id.grid_view);

        gridView.setAdapter(new ImageAdapter(this,valores));

    }
}
