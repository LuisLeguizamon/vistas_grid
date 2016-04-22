package com.zentcode.cursapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luis on 21/04/16.
 */
public class Fragment_mis_favoritos extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
      View view = inflater.inflate(R.layout.fragment_mis_favoritos,container,false);
        return view;
    }
}
