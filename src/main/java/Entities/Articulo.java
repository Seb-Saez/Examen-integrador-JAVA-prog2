package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;
    private UnidadMedida unidadMedida;
    private Set<Imagen> imagenes = new LinkedHashSet<>();


    public Articulo(Double precioVenta, String denominacion) {
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "denominacion='" + denominacion + '\'' +
                ", precioVenta=" + precioVenta +
                ", unidadMedida=" + unidadMedida +
                ", imagenes=" + imagenes +
                '}';
    }
}
