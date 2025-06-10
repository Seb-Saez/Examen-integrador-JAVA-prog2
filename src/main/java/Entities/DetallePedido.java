package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetallePedido(Integer cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }
}
