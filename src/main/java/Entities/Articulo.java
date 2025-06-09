package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public abstract class Articulo {
    protected String denominacion;
    protected Double precioVenta;


    public Articulo(Double precioVenta, String denominacion) {
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
    }
}
