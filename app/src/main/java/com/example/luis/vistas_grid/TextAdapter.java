package com.example.luis.vistas_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by luis on 27/01/16.
 */
public class TextAdapter extends BaseAdapter {
    private Context contexto;
    private final String[] valores;

    public TextAdapter(Context context, String[] values){
        this.contexto=context;
        this.valores=values;
    }

    public View getView (int position,View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater) contexto.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View listview;

        if (convertView==null){

            listview=new View(contexto);

            //get layout from content_listab.xml
            listview=inflater.inflate(R.layout.content_listab,null);

            //set value into textview
            TextView texto = (TextView) listview.findViewById(R.id.tx_b);

            texto.setText(valores[position]);

        }

        else { listview = (View) convertView;}

        return listview;
    }


    @Override
    public int getCount() { return valores.length;}

    @Override
    public Object getItem(int position){return null;}

    @Override
    public long getItemId(int position){return 0;}


}

