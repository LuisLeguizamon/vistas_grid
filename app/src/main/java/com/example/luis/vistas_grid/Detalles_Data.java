package com.example.luis.vistas_grid;

/**
 * Created by luis on 21/03/16.
 */
public class Detalles_Data {
    int id_grid;
    int id_lista;
    int id_detalles;
    String titulo;
    String descripcion;
    String duracion_horario;
    String lugar;
    String costo;
    String contacto;

    public Detalles_Data (int id_grid, int id_lista, int id_detalles,
                          String titulo,String descripcion, String duracion_horario, String lugar,
                          String costo, String contacto){
        this.id_grid =id_grid;
        this.id_lista = id_lista;
        this.id_detalles = id_detalles;
        this.titulo = titulo;
        this.duracion_horario = duracion_horario;
        this.lugar = lugar;
        this.costo = costo;
        this.contacto = contacto;

    }
}
