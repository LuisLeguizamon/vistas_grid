package com.example.luis.vistas_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by luis on 18/01/16.
 */
public class ImageAdapter extends BaseAdapter {

    private Context contexto;
    private final String[] valores;

    public ImageAdapter(Context context, String[] values){
        this.contexto=context;
        this.valores=values;
    }

    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)
                contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView==null) {

            gridView = new View(contexto);

            //get layout from item_list.xml
            gridView = inflater.inflate(R.layout.item_list,null);

            //set value into textview
            TextView textview = (TextView) gridView
                    .findViewById(R.id.txt_item);

            textview.setText(valores[position]);


        }

        else { gridView = (View) convertView;}

        return gridView;

        }

    @Override
    public int getCount() { return valores.length;}

    @Override
    public Object getItem(int position){return null;}

    @Override
    public long getItemId(int position){return 0;}

}
