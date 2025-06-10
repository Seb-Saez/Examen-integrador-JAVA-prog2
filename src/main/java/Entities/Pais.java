package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder
public class Pais extends Base{

    private String nombre;


    public Pais(String nombre) {
        this.nombre = nombre;

    }

}
