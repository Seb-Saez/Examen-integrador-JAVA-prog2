package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Provincia {

    private String nombre;
    private Pais pais;

    public Provincia(Pais pais, String nombre) {
        this.pais = pais;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre + ", " + (pais != null ? pais.getNombre() : "sin país");
    }
}
