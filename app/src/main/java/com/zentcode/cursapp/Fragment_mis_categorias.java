package com.zentcode.cursapp;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
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
    private FragmentActivity myContext;
    @Override
    public View onCreateView (LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_mis_categorias,container,false);

        ListView listView= (ListView) view.findViewById(R.id.listview_cat);

        AdapterFragment_mis_categorias adapter = new AdapterFragment_mis_categorias(getActivity(),General.DATA_CAT);
        listView.setAdapter(adapter);

        FloatingActionButton fab = (FloatingActionButton) view.findViewById(R.id.fab_add_cat);
//        fab.setImageResource(R.mipmap.ic_add_white_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Snackbar.make(view, "Curso agregado a Favoritos", Snackbar.LENGTH_LONG)
                  //      .setAction("Action", null).show();
                Dialogshow();

            }
        });

        return view;

    }
    @Override
    public void onAttach(Activity activity) {
        myContext=(FragmentActivity) activity;
        super.onAttach(activity);
    }
    public void Dialogshow() {
        DialogFragment newFragment = new DialogChoice_categorias();
        FragmentManager fragManager = myContext.getSupportFragmentManager();
        newFragment.show(fragManager, "cateogorias");
    }

}
