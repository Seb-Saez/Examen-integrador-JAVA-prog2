package Entities;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    // setEmpresa para que no falle en Empresa, asi es la notacion de lombok
    @Setter
    private Empresa empresa;
    private Domicilio domicilio;

    public Sucursal() {
    }

    // constructor de sucursal, no lleva empresa porque debe hacerse con el setEmpresa
    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

}
