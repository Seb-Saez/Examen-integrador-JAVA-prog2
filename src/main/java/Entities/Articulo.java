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

public abstract class Articulo extends Base{
    protected String denominacion;
    protected Double precioVenta;
    private UnidadMedida unidadMedida;
    @Builder.Default
    private Set<Imagen> imagenes = new LinkedHashSet<>();


    public Articulo(Double precioVenta, String denominacion) {
        this.precioVenta = precioVenta;
        this.denominacion = denominacion;
    }

    // metodo p agregar imagenes
    public void agregarImagen(Imagen imagen){
        imagenes.add(imagen);
    }

}
