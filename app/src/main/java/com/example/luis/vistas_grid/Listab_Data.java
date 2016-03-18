package com.example.luis.vistas_grid;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luis on 15/03/16.
 */
public class Listab_Data {
    int id_grid;
    int id_lista;
    String titles_lista;

    public Listab_Data(int id_grid,int id_lista, String titles_lista){
        this.id_grid=id_grid;
        this.id_lista=id_lista;
        this.titles_lista=titles_lista;
    }

 /*  private List<Listab_Data> DATA;

    // This method creates an ArrayList that have Listab_Data objects
    private void initializeData(){
        DATA =  new ArrayList<>();
        DATA.add(new Listab_Data(0,0,"ExpoAgro 2016"));

    }
*/
}