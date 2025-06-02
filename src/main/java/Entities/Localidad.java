package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
public class Localidad extends Base {

    private String nombre;
    private Provincia provincia;

    public Localidad(String nombre, Provincia provincia) {
        this.nombre = nombre;
        this.provincia = provincia;
    }
    @Override
    public String toString() {
        return nombre + ", " + (provincia != null ? provincia.getNombre() : "sin provincia");
    }
}