package Entities;

import Enums.FormaPago;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder

public class Factura extends Base{
    private LocalDate fechaFacturacion;
    private Integer mpPaymentId;
    private Integer mpMerchantOrderId;
    private String mpPreferenceId;
    private String mpPaymentType;
    private Double totalVenta;
    private FormaPago formaPago;


}
