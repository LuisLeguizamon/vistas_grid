package com.zentcode.cursapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
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


        Button button_notif = (Button) view.findViewById(R.id.btn_notif);
        button_notif.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment_notif fragment_notif = new Fragment_notif();

                fragmentTransaction.replace(R.id.contentFragment,fragment_notif);
                fragmentTransaction.commit();
            }
        });

        Button button_cupones = (Button) view.findViewById(R.id.btn_cupones);
        button_cupones.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
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
