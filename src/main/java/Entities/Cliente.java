package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder

public class Cliente extends Base {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;
    private LocalDate fechaNacimiento;
    private Usuario usuario;
    private Imagen imagen;
    private Set<Pedido> pedidos = new LinkedHashSet<>();
    private Set<Domicilio> domicilio = new LinkedHashSet<>();

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }
}
