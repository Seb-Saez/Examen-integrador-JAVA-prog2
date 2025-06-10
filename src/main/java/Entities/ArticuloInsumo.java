package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ArticuloInsumo extends Articulo {

    private Double precioCompra;
    private Integer stockActual;
    private Integer stockMaximo;
    private Boolean esParaElaborar;
    //private Set<ArticuloManufacturadoDetalle> detalles = new LinkedHashSet<>();

    public ArticuloInsumo(Double precioCompra, Integer stockActual, Integer stockMaximo, Boolean esParaElaborar) {
        this.precioCompra = precioCompra;
        this.stockActual = stockActual;
        this.stockMaximo = stockMaximo;
        this.esParaElaborar = esParaElaborar;
    }

}
