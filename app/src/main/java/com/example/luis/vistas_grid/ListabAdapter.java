package com.example.luis.vistas_grid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 29/01/16.
 */
public class ListabAdapter extends RecyclerView.Adapter<ListabAdapter.ViewHolder>{

    List<Listab_Data> DATA;
    static int id_grid;


    // Provide a suitable constructor (depends on the kind of dataset)
    public ListabAdapter(List<Listab_Data> data){
        this.DATA=data;
    }

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // each data item is just a string in this case
        public TextView texto;

        public ViewHolder(View v) {
            super(v);
            texto= (TextView) v.findViewById(R.id.tx_b);
            v.setOnClickListener(this);

        }

        public TextView getTexto(){
            return texto;
        }
        int posit;
        String xs;

        @Override
        public void onClick(View v) {
            posit=this.getAdapterPosition();
            xs=String.valueOf(posit);
            int id_grid_int= id_grid;
            //String id_grid_string= String.valueOf(id_grid_int);
            //Toast.makeText(v.getContext(), id_grid_string , Toast.LENGTH_SHORT).show();

            Bundle bund = new Bundle();
            bund.putInt("position_grid",id_grid_int);
            bund.putInt("position_list", posit);
            Intent intent = new Intent(v.getContext(),Detalles.class);
            intent.putExtras(bund);
            //Log.d("posit=",String.valueOf(posit));
            v.getContext().startActivity(intent);
        }
    }


    // Create new views (invoked by the layout manager)
    @Override
    public ListabAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.content_listab, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        id_grid = DATA.get(0).id_grid;
      // to change color of view
      // vh.itemView.setBackgroundColor(parent.getContext().getResources().getColor(R.color.blue_grey));
        return vh;
    }


    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.getTexto().setText(DATA.get(position).titles_lista);

    }

    // Return the size of your dataset (invoked by the layout manager)
    //método getItemCount. Éste debería regresar el número de elementos presentes en los datos. Como nuestro datos están en forma de una List, sólo necesitamos llamar al método size en el objeto List
    @Override
    public int getItemCount() {
        return DATA.size();
    }

}
