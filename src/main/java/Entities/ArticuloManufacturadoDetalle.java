package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor

public class ArticuloManufacturadoDetalle extends Base{

    private Integer cantidad;
    private ArticuloInsumo articuloinsumo;


}
