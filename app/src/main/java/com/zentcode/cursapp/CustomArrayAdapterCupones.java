package com.zentcode.cursapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by luis on 13/04/16.
 */
public class CustomArrayAdapterCupones extends ArrayAdapter<Data_cupones>{

    public CustomArrayAdapterCupones (Context context, ArrayList<Data_cupones> values){
        super(context,0,values);
    }
@Override
   public View getView(int position,View convertView,ViewGroup parent){
    LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    View view = inflater.inflate(R.layout.cupones_item, parent, false);
    TextView txv_curso= (TextView)view.findViewById(R.id.txv_cupones_curso);
    TextView txv_contenido= (TextView) view.findViewById(R.id.txv_cupones_contenido);

    Data_cupones item = getItem(position);

    String curso = item.curso;
    txv_curso.setText(curso);

    String contenido = item.contenido;
    txv_contenido.setText(contenido);

    return view;
}
}
