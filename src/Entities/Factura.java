package Entities;

import Enums.FormaPago;
import java.time.LocalDate;

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private Double totalVenta;
    private FormaPago formaPago;

}
