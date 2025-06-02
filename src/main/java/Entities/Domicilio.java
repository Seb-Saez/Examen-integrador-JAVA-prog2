package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Domicilio {

    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, Integer numero, Integer cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }

    @Override
    public String toString() {
        return calle + " " + numero + " (CP: " + cp + ") - " +
                (localidad != null ? localidad.getNombre() : "sin localidad");
    }
}
