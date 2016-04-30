package com.zentcode.cursapp;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by luis on 26/04/16.
 */
public class Fragment_mis_categorias extends Fragment {
    public String[] titles = General.toolbar_titles;
    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mis_categorias,container,false);

        ListView listView= (ListView) view.findViewById(R.id.listview_cat);

        ArrayList<Data_mis_categorias> DATA = new ArrayList<>();
        DATA.add(new Data_mis_categorias(0,titles[5]));
        DATA.add(new Data_mis_categorias(1,titles[7]));
        DATA.add(new Data_mis_categorias(2,titles[1]));
        DATA.add(new Data_mis_categorias(3,titles[1]));
        DATA.add(new Data_mis_categorias(4,titles[1]));
        DATA.add(new Data_mis_categorias(5,titles[1]));
        DATA.add(new Data_mis_categorias(6,titles[1]));
        DATA.add(new Data_mis_categorias(7,titles[1]));
        DATA.add(new Data_mis_categorias(8,titles[1]));
        DATA.add(new Data_mis_categorias(9,titles[1]));
        DATA.add(new Data_mis_categorias(10,titles[1]));
        DATA.add(new Data_mis_categorias(11,titles[1]));
        DATA.add(new Data_mis_categorias(12,titles[1]));
        DATA.add(new Data_mis_categorias(13,titles[1]));
        DATA.add(new Data_mis_categorias(14,titles[1]));
        DATA.add(new Data_mis_categorias(15,titles[1]));

        Fragment_mis_categorias_Adapter adapter = new Fragment_mis_categorias_Adapter(getActivity(),DATA);
        listView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_add_cat);
//        fab.setImageResource(R.mipmap.ic_add_white_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Curso agregado a Favoritos", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        return view;

    }
}
