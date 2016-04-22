package com.zentcode.cursapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luis on 21/04/16.
 */
public class Fragment_favoritos extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        //Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_favoritos, container, false);

        //FragmentManager fragment_manager = getFragmentManager();
        //FragmentTransaction fragmentTransaction = fragment_manager.beginTransaction();

        return view;
    }

}