package Entities;

import Enums.TipoPromocion;
import java.time.LocalDate;
import java.time.LocalTime;


public class Promocion extends Base {
    private String denominacion;
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private LocalTime HoraDesde;
    private LocalTime HoraHasta;
    private String descripcionDescuento;
    private Double precioPromocional;
    private TipoPromocion tipoPromocion;
}
