package Entities;

import java.util.ArrayList;

public class Localidad extends Base {
    private String nombre;
    private ArrayList<Domicilio> domicilios;
    private Provincia provincia;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.domicilios = new ArrayList<>();
    }
}