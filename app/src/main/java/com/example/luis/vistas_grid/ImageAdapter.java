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

            //cambia el color de fondo de acuerdo a la posicion
            gridView.setBackgroundColor(rainbow[position]);

            ImageView imagen = (ImageView) gridView.findViewById(R.id.image_item);

            String s = valores[position];

            if (s.startsWith("AGRO"))
            {
                imagen.setImageResource(R.mipmap.agro);
            }
            else if(s.startsWith("ARTES"))
            {
                imagen.setImageResource(R.mipmap.artes);
            }
            else if(s.startsWith("ELECTRICIDAD"))
            {
                imagen.setImageResource(R.mipmap.electricidad);
            }
            else if (s.startsWith("FINANZAS"))
            {
                imagen.setImageResource(R.mipmap.finanzas);
            }
            else if(s.startsWith("GASTRONOMÍA"))
            {
                imagen.setImageResource(R.mipmap.gastronomia);
            }
            else if(s.startsWith("TECNOLOGÍA"))
            {
                imagen.setImageResource(R.mipmap.tecnologia);
            }
            else if(s.startsWith("IDIOMAS"))
            {
                imagen.setImageResource(R.mipmap.idiomas);
            }
            else if(s.startsWith("SALUD"))
            {
                imagen.setImageResource(R.mipmap.salud);
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
