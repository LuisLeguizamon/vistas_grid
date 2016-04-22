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

public class Fragment_profile extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment_notif fragment_notif = new Fragment_notif();

        fragmentTransaction.add(R.id.contentFragment, fragment_notif);
        fragmentTransaction.commit();

        final Drawable ic_notif_white = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_notification_white_24dp,null);
        final Drawable ic_notif_grey = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_notification_bluegreydark_24dp,null);
        final Drawable ic_receipt_white= ResourcesCompat.getDrawable(getResources(),R.drawable.ic_receipt_white_24dp,null);
        final Drawable ic_receipt_grey = ResourcesCompat.getDrawable(getResources(),R.drawable.ic_receipt_bluegreydark_24dp,null);

        final Button button_notif = (Button) view.findViewById(R.id.btn_notif);
        final Button button_cupones = (Button) view.findViewById(R.id.btn_cupones);

        button_notif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                button_notif.setTextColor(Color.parseColor("#FFFFFF"));
                button_cupones.setTextColor(Color.parseColor("#455A64"));
                button_notif.setCompoundDrawablesWithIntrinsicBounds(null,ic_notif_white,null,null);
                button_cupones.setCompoundDrawablesWithIntrinsicBounds(null,ic_receipt_grey,null,null);

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment_notif fragment_notif = new Fragment_notif();

                fragmentTransaction.replace(R.id.contentFragment,fragment_notif);
                fragmentTransaction.commit();
            }
        });

        button_cupones.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                button_cupones.setTextColor(Color.parseColor("#FFFFFF"));
                button_notif.setTextColor(Color.parseColor("#455A64"));
                button_cupones.setCompoundDrawablesWithIntrinsicBounds(null,ic_receipt_white,null,null);
                button_notif.setCompoundDrawablesWithIntrinsicBounds(null,ic_notif_grey,null,null);

                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment_cupones fragment_cupones = new Fragment_cupones();

                fragmentTransaction.replace(R.id.contentFragment,fragment_cupones);
                fragmentTransaction.commit();
            }

        });

        return view;
    }

}
