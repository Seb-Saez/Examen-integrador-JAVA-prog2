package Entities;

import java.util.ArrayList;

public class Provincia {
    private String nombre;
    private ArrayList<Localidad> localidades;
    private Pais pais;

    public Provincia(Pais pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
        this.localidades = new ArrayList<>();
    }
}
