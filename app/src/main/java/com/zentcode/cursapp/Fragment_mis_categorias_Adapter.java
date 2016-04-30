package com.zentcode.cursapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by luis on 27/04/16.
 */
public class Fragment_mis_categorias_Adapter extends ArrayAdapter<Data_mis_categorias> {
    public Fragment_mis_categorias_Adapter(Context context, ArrayList<Data_mis_categorias> values){
        super(context,0,values);
    }
    @Override
    public View getView(int position,View convertView,ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.mis_categorias_item,parent,false);
        TextView textView = (TextView)view.findViewById(R.id.txv_miscat);

        Data_mis_categorias item = getItem(position);

        String mi_categoria = item.miscat;
        textView.setText(mi_categoria);

        return view;

    }
}
