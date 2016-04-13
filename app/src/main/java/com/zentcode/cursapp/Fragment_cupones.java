package com.zentcode.cursapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by luis on 13/04/16.
 */
public class Fragment_cupones extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState){
            return inflater.inflate(R.layout.fragment_cupones,container,false);
    }
}
