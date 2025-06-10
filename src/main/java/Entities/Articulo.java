package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;
    private UnidadMedida unidadMedida;
    private Set<Imagen> imagenes = new LinkedHashSet<>();


    public Articulo(Double precioVenta, String denominacion) {
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
    }

}
