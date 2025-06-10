package Entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
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
    @Builder.Default
    private Set<Pedido> pedidos = new LinkedHashSet<>();
    @Builder.Default
    private Set<Domicilio> domicilios = new LinkedHashSet<>();

    public Cliente(String nombre, String apellido, String telefono, String email, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
    }

    // metodo p agregar pedidos
    public void agregarPedido(Pedido pedido){
        pedidos.add(pedido);
    }

    // metodo p agregar domicilios
    public void agregarDomicilio(Domicilio domicilio){
        domicilios.add(domicilio);
    }
}
