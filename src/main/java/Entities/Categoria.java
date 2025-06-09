package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public class Categoria extends Base {

    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subcategoria;
    private HashSet<Articulo> articulos;

    public Categoria(String denominacion, Categoria categoriaPadre) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {
        return denominacion + (categoriaPadre != null ? " (sub de: " + categoriaPadre.getDenominacion() + ")" : "");
    }
}
