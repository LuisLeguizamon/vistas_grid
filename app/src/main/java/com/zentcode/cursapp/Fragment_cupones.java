package com.zentcode.cursapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by luis on 13/04/16.
 */
public class Fragment_cupones extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_cupones,container,false);

        ListView listView = (ListView) view.findViewById(R.id.list_cupones);

        ArrayList<Data_cupones> DATA = new ArrayList<>();
        DATA.add(new Data_cupones(0,"Diseño Gráfico","40 % de descuento"));
        DATA.add(new Data_cupones(1,"Introducción al Francés Jurídico","50% de descuento"));
        DATA.add(new Data_cupones(2,"Seminario Internacional de Seguridad Social","Acceso libre - 100% de descuento"));

        AdapterFragment_cupones adapter = new AdapterFragment_cupones(getActivity(),DATA);
        listView.setAdapter(adapter);

        return view;
    }
}
