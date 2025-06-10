package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder

public class Usuario extends Base {
    private String authOId;
    private String username;
}
