package Entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetallePedido(Integer cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }
}
