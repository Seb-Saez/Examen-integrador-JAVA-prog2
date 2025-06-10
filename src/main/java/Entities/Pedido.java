package Entities;

import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder

public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private Estado estado;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;
    private LocalDate fechaPedido;
    private Domicilio domicilio;
    private Sucursal sucursal;
    private Factura factura;
    private Set<DetallePedido> detallePedidos = new LinkedHashSet<>();


    public Pedido(LocalTime horaEstimadaFinalizacion, Double total, Double totalCosto, Estado estado, TipoEnvio tipoEnvio, FormaPago formaPago, LocalDate fechaPedido) {
        this.horaEstimadaFinalizacion = horaEstimadaFinalizacion;
        this.total = total;
        this.totalCosto = totalCosto;
        this.estado = estado;
        this.tipoEnvio = tipoEnvio;
        this.formaPago = formaPago;
        this.fechaPedido = fechaPedido;
    }

    public void agregarDetalle(DetallePedido detalle) {
        if (detalle != null) {
            detallePedidos.add(detalle);
        }
    }

}
