package com.zentcode.cursapp;

import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

/**
 * Created by luis on 21/04/16.
 */
public class Fragment_mis_favoritos extends ListFragment {
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
    super.onActivityCreated(savedInstanceState);
        String[] values = new String[] {"Excel Avanzado","Mandarín"};

        ArrayAdapter adapter = new ArrayAdapter(getActivity(),android.R.layout.simple_list_item_1,values);
        setListAdapter(adapter);
    }
}