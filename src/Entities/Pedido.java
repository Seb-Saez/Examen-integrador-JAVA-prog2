package Entities;

import Enums.FormaPago;
import Enums.TipoEnvio;
import java.time.LocalDate;
import java.time.LocalTime;

public class Pedido extends Base {
    private LocalTime horaEstimadaFinalizacion;
    private Double total;
    private Double totalCosto;
    private LocalDate FechaPedido;
    private TipoEnvio tipoEnvio;
    private FormaPago formaPago;


}
