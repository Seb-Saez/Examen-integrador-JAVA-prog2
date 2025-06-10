package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public class Categoria extends Base {

    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subcategoria;
    private LinkedHashSet<Articulo> articulos = new LinkedHashSet<>();

    public Categoria(String denominacion, Categoria categoriaPadre) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }

    @Override
    public String toString() {
        return "Categoria{" +
                "denominacion='" + denominacion + '\'' +
                ", categoriaPadre=" + categoriaPadre +
                ", subcategoria=" + subcategoria +
                ", articulos=" + articulos +
                '}';
    }
}
