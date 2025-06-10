package Entities;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder
public class Pais extends Base{

    private String nombre;


    public Pais(String nombre) {
        this.nombre = nombre;

    }

}
