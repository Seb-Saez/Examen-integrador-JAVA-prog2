package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder

public class Domicilio extends Base {

    private String calle;
    private int numero;
    private int cp;
    private Localidad localidad;

    public Domicilio(String calle, Integer numero, Integer cp) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
    }
}
