package Entities;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder

public class UnidadMedida extends Base {
   private String denominacion;
}
