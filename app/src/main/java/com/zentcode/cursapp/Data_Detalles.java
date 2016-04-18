package com.zentcode.cursapp;

/**
 * Created by luis on 21/03/16.
 */
public class Data_Detalles {
    int id_grid;
    int id_lista;
    String titulo;
    String descripcion;
    String duracion_horario;
    String costo;
    String lugar;
    String contacto;

    public Data_Detalles(int id_grid, int id_lista,
                         String titulo, String descripcion, String duracion_horario, String costo,
                         String lugar, String contacto){
        this.id_grid =id_grid;
        this.id_lista = id_lista;
        this.titulo = titulo;
        this.descripcion=descripcion;
        this.duracion_horario = duracion_horario;
        this.costo = costo;
        this.lugar = lugar;
        this.contacto = contacto;

    }
}
