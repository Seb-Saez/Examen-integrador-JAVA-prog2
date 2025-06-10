package Entities;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder

public class Categoria extends Base {

    private String denominacion;
    private Categoria categoriaPadre;
    private Set<Categoria> subcategoria;
    @Builder.Default
    private LinkedHashSet<Articulo> articulos = new LinkedHashSet<>();

    public Categoria(String denominacion, Categoria categoriaPadre) {
        this.denominacion = denominacion;
        this.categoriaPadre = categoriaPadre;
    }

    // metodo p agregar articulos
    public void agregarArticulo(Articulo articulo){
        articulos.add(articulo);
    }
}
