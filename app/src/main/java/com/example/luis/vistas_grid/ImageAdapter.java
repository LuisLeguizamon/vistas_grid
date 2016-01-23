package com.example.luis.vistas_grid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
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

            gridView = new View(contexto);

            //get layout from item_list.xml
            gridView = inflater.inflate(R.layout.item_list,null);

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
                //imagen.setImageResource(R.mipmap.artes);
                imagen.setBackgroundResource(R.drawable.artes_b);
            }
            else if(s.startsWith("Electricidad"))
            {
                //imagen.setImageResource(R.mipmap.electricidad);
                imagen.setBackgroundResource(R.drawable.electricidad_b);
            }
            else if (s.startsWith("Finanzas"))
            {
                //imagen.setImageResource(R.mipmap.finanzas);
                imagen.setBackgroundResource(R.drawable.finanzas_b);
            }
            else if(s.startsWith("Gastronomía"))
            {
                //imagen.setImageResource(R.mipmap.gastronomia);
                imagen.setBackgroundResource(R.drawable.gastronomia_b);
            }
            else if(s.startsWith("Tecnología"))
            {
                //imagen.setImageResource(R.mipmap.tecnologia);
                imagen.setBackgroundResource(R.drawable.tecnologia_b);
            }
            else if(s.startsWith("Idiomas"))
            {
                //imagen.setImageResource(R.mipmap.idiomas);
                imagen.setBackgroundResource(R.drawable.idiomas_b);
            }
            else if(s.startsWith("Salud"))
            {
                //imagen.setImageResource(R.mipmap.salud);
                imagen.setBackgroundResource(R.drawable.salud_b);
            }

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
