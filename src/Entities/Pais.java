package Entities;

import java.util.ArrayList;

public class Pais extends Base{
    private String nombre;
    private ArrayList<Provincia> provincias;

    public Pais(String nombre) {
        this.nombre = nombre;
        this.provincias = new ArrayList<>();
    }
}
