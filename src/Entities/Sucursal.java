package Entities;

import java.time.LocalTime;

public class Sucursal extends Base {
    private String nombre;
    private LocalTime fechaApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;

    public Sucursal() {
    }

    public Sucursal(String nombre, LocalTime fechaApertura, LocalTime horarioCierre, Empresa empresa, Domicilio domicilio) {
        this.nombre = nombre;
        this.fechaApertura = fechaApertura;
        this.horarioCierre = horarioCierre;
        this.empresa = empresa;
        this.domicilio = domicilio;
    }
}
