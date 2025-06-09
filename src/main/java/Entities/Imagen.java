package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Imagen extends Base {
    private String denominacion;

    public Imagen(String denominacion) {
        this.denominacion = denominacion;
    }
}
