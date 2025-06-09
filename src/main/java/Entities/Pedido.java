package Entities;

import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor

public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private LocalDate FechaPedido;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private Domicilio domicilio;
    private Factura factura;
    private Set<DetallePedido> detallePedidos;

    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, LocalDate fechaPedido, TipoEnvio tipoEnvio, FormaPago formaPago) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        FechaPedido = fechaPedido;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.detallePedidos = new HashSet<>();
    }
}
