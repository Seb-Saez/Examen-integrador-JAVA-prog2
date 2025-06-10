package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class DetallePedido extends Base {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;

    public DetallePedido(Integer cantidad, Double subTotal) {
        this.cantidad = cantidad;
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                '}';
    }
}
