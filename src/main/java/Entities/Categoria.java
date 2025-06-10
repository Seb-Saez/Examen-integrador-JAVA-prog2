package Entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder

public class Categoria extends Base {

    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subcategoria;
    private LinkedHashSet<Articulo> articulos = new LinkedHashSet<>();

    public Categoria(String denominacion, Categoria categoriaPadre) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }
}
