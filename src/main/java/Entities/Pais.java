package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pais extends Base{

    private String nombre;


    public Pais(String nombre) {
        this.nombre = nombre;

    }

    @Override
    public String toString(){
        return nombre;
    }
}
