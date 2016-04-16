package com.zentcode.cursapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by luis on 18/01/16.
 */
public class ImageAdapter extends ArrayAdapter<Data_Grid> {

    public ImageAdapter(Context context, ArrayList<Data_Grid> grid_data){
       super(context,0,grid_data);

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        LayoutInflater inflater = (LayoutInflater)
                getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View gridView;

        if (convertView==null) {
            //get layout from item_list.xml
            gridView = inflater.inflate(R.layout.item_list, null);
        }

        else {
            gridView = (View) convertView;}


        //set value into textview
            TextView textv = (TextView) gridView.findViewById(R.id.txt_item);

          Data_Grid item = getItem(position);

            int id = item.id_grid;
            String titles= item.titles_grid;

            textv.setText(titles);

           //traemos el array del xml colors

            int [] rainbow = getContext().getResources().getIntArray(R.array.rainbow);

            //cambia el color de fondo del texto de acuerdo a la posicion
            textv.setBackgroundColor(rainbow[position]);

            ImageView imagen = (ImageView) gridView.findViewById(R.id.image_item);

           // String s = valores[position];

            if(id==0)
            {
                imagen.setBackgroundResource(R.drawable.fav_b);
            }
            else if (id==1)
            {
                //imagen.setImageResource(R.mipmap.agro);
                imagen.setBackgroundResource(R.drawable.agro_b);
            }
            else if(id==2)
            {
                imagen.setBackgroundResource(R.drawable.artes_b);
            }
            else if(id==3)
            {
                imagen.setBackgroundResource(R.drawable.becas_b);
            }
            else if(id==4)
            {
                imagen.setBackgroundResource(R.drawable.electricidad_b);
            }
            else if (id==5)
            {
                imagen.setBackgroundResource(R.drawable.finanzas_b);
            }
            else if(id==6)
            {
                imagen.setBackgroundResource(R.drawable.gastronomia_b);
            }
            else if(id==7)
            {
                imagen.setBackgroundResource(R.drawable.idiomas_b);
            }
            else if(id==8)
            {
                imagen.setBackgroundResource(R.drawable.salud_b);
            }
            else if(id==9)
            {
                imagen.setBackgroundResource(R.drawable.tecnologia_b);
            }


        return gridView;

        }

   /* @Override
    public int getCount() { return valores.length;}

    @Override
    public Object getItem(int position){return null;}

    @Override
    public long getItemId(int position){return 0;}
*/
}