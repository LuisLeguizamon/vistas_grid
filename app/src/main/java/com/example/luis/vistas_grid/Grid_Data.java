package com.example.luis.vistas_grid;

/**
 * Created by luis on 09/03/16.
 */
public class Grid_Data {
    int id_grid;
    String titles_grid;

    public Grid_Data(int id,String titles){
        this.id_grid=id;
        this.titles_grid=titles;
    }

    public String getTitles_grid(){return titles_grid;}

}

