package Entities;

import java.util.Set;

public class Categoria extends Base {
    private String denominacion;

    private Categoria categoriaPadre;

    private Set<Categoria> subcategoria;
}
