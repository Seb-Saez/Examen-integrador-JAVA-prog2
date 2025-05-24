package Entities;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    private Set<ArticuloManufacturadoDetalle> detalles = new LinkedHashSet<>();
}
