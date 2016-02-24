package com.example.luis.vistas_grid;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
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


            //gridView = new View(contexto);


            //get layout from item_list.xml
            gridView = inflater.inflate(R.layout.item_list, null);

        }

        else {
            gridView = (View) convertView;}


        //set value into textview
            TextView texto = (TextView) gridView.findViewById(R.id.txt_item);

            texto.setText(valores[position]);

           //traemos el array del xml colors

            int [] rainbow = contexto.getResources().getIntArray(R.array.rainbow);

            //cambia el color de fondo del texto de acuerdo a la posicion
            texto.setBackgroundColor(rainbow[position]);

            ImageView imagen = (ImageView) gridView.findViewById(R.id.image_item);

            String s = valores[position];

            if (s.startsWith("Agro"))
            {
                //imagen.setImageResource(R.mipmap.agro);
                imagen.setBackgroundResource(R.drawable.agro_b);
            }
            else if(s.startsWith("Artes"))
            {
                imagen.setBackgroundResource(R.drawable.artes_b);
            }
            else if(s.startsWith("Electricidad"))
            {
                imagen.setBackgroundResource(R.drawable.electricidad_b);
            }
            else if (s.startsWith("Finanzas"))
            {
                imagen.setBackgroundResource(R.drawable.finanzas_b);
            }
            else if(s.startsWith("Gastronomía"))
            {
                imagen.setBackgroundResource(R.drawable.gastronomia_b);
            }
            else if(s.startsWith("Idiomas"))
            {
                imagen.setBackgroundResource(R.drawable.idiomas_b);
            }
            else if(s.startsWith("Salud"))
            {
                imagen.setBackgroundResource(R.drawable.salud_b);
            }
            else if(s.startsWith("Tecnología"))
            {
                imagen.setBackgroundResource(R.drawable.tecnologia_b);
            }


        return gridView;

        }

    @Override
    public int getCount() { return valores.length;}

    @Override
    public Object getItem(int position){return null;}

    @Override
    public long getItemId(int position){return 0;}

}