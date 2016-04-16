package com.zentcode.cursapp;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by luis on 13/04/16.
 */
public class Fragment_notif extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        final String[] values = new String[] {"Solo faltan 7 días para Introducción al Francés Jurídico - CEDEP",
                "Tenés un nuevo Cupón Cursapp","a","v","c","d","a","v","c","d","a","v","c","d"};

        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,values);
        setListAdapter(adapter);
    }

}
