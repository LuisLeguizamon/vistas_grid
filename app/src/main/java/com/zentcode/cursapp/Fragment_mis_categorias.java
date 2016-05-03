package com.zentcode.cursapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        AdapterFragment_mis_categorias adapter = new AdapterFragment_mis_categorias(getActivity(),DATA);
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
