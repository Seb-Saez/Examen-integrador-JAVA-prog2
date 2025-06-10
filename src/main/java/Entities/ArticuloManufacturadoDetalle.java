package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@Data
@NoArgsConstructor
@SuperBuilder

public class ArticuloManufacturadoDetalle extends Base{

    private Integer cantidad;
    private ArticuloInsumo articuloInsumo;

    public ArticuloManufacturadoDetalle(Integer cantidad, ArticuloInsumo articuloInsumo) {
        this.cantidad = cantidad;
        this.articuloInsumo = articuloInsumo;
    }
}
