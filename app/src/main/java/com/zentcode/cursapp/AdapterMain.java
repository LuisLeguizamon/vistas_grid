package com.zentcode.cursapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by luis on 18/01/16.
 */
public class AdapterMain extends ArrayAdapter<Data_Grid> {
public int[] grid_color = General.grid_color;
    public AdapterMain(Context context, ArrayList<Data_Grid> grid_data){
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
        //    TextView textv = (TextView) gridView.findViewById(R.id.txt_item);
        Button button_cat = (Button) gridView.findViewById(R.id.btn_cat);

          Data_Grid item = getItem(position);

           final int id = item.id_grid;
            String titles= item.titles_grid;
             button_cat.setText(titles);

            //cambia el color de fondo del texto de acuerdo a la posicion

            button_cat.setBackgroundColor(ContextCompat.getColor(getContext(), grid_color[position]));

            ImageView imagen = (ImageView) gridView.findViewById(R.id.image_item);

           // String s = valores[position];

            if(id==0)
            {
                imagen.setBackgroundResource(R.drawable.fav_b);
            }
            else if (id==1)
            {
                imagen.setBackgroundResource(R.drawable.recomendados_b);
            }
            else if(id==2)
            {
                imagen.setBackgroundResource(R.drawable.agro_b);
            }
            else if(id==3)
            {
                imagen.setBackgroundResource(R.drawable.artes_b);
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

        gridView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(id==0){
                    Intent intent = new Intent(getContext(),FavoritosActivity.class);
                    getContext().startActivity(intent);
                }
                else {
                    Intent intent = new Intent(getContext(), ListabActivity.class);
                    intent.putExtra("position", id);
                    getContext().startActivity(intent);
                }
            }
        });

        button_cat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (id==0){
                    Intent intent = new Intent(getContext(),FavoritosActivity.class);
                    getContext().startActivity(intent);
                }

                else {
                    Intent intent = new Intent(getContext(), ListabActivity.class);
                    intent.putExtra("position", id);
                    getContext().startActivity(intent);
                }
            }
        });

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