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

public class ArticuloManufacturado extends Articulo {

    private String descripcion;
    private Integer tiempoEstimadoMinutos;
    private String preparacion;
    @Builder.Default
    private Set<ArticuloManufacturadoDetalle> detalles = new LinkedHashSet<>();

    public ArticuloManufacturado(String descripcion, Integer tiempoEstimadoMinutos, String preparacion) {
        this.descripcion = descripcion;
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
        this.preparacion = preparacion;
    }

    // metodo p agregar detalles
    public void agregarDetale(ArticuloManufacturadoDetalle detalle){
        detalles.add(detalle);
    }
}
