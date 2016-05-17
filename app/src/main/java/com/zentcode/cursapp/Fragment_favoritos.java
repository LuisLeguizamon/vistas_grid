package com.zentcode.cursapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by luis on 21/04/16.
 */
public class Fragment_favoritos extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        final FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        final Fragment_mis_favoritos fragment_mis_favoritos = new Fragment_mis_favoritos();
        final Fragment_mis_categorias fragment_mis_categorias = new Fragment_mis_categorias();

        fragmentTransaction.add(R.id.contentFragment_fav, fragment_mis_favoritos);
        fragmentTransaction.commit();

        final Drawable ic_grade_white = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_grade_white_24dp,null);
        final Drawable ic_grade_grey = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_grade_bluegreydark_24dp,null);
        final Drawable ic_receipt_white = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_receipt_white_24dp,null);
        final Drawable ic_receipt_grey = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_receipt_bluegreydark_24dp,null);

        final Button button_favoritos = (Button) view.findViewById(R.id.btn_favoritos);
        final Button button_cat = (Button) view.findViewById(R.id.btn_cat);

        button_favoritos.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button_favoritos.setTextColor(Color.parseColor("#FFFFFF"));
                button_cat.setTextColor(Color.parseColor("#455A64"));
                button_favoritos.setCompoundDrawablesWithIntrinsicBounds(null, ic_grade_white, null, null);
                button_cat.setCompoundDrawablesWithIntrinsicBounds(null, ic_receipt_grey, null, null);

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contentFragment_fav, fragment_mis_favoritos);
                fragmentTransaction.commit();
            }
        });

        button_cat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                button_cat.setTextColor(Color.parseColor("#FFFFFF"));
                button_favoritos.setTextColor(Color.parseColor("#455A64"));
                button_cat.setCompoundDrawablesWithIntrinsicBounds(null, ic_receipt_white, null, null);
                button_favoritos.setCompoundDrawablesWithIntrinsicBounds(null, ic_grade_grey, null, null);

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.contentFragment_fav, fragment_mis_categorias);
                fragmentTransaction.commit();
            }
        });


        return view;
    }
}