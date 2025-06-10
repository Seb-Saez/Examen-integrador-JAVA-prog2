package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@SuperBuilder
public class Provincia extends Base {

    private String nombre;
    private Pais pais;


}
