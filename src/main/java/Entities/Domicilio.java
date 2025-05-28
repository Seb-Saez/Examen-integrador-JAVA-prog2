package Entities;

public class Domicilio {
    private String calle;
    private int numero;
    private int cp;
    private Sucursal sucursal;
    private Localidad localidad;

    public Domicilio(String calle, Integer numero, Integer cp, Sucursal sucursal, Localidad localidad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.sucursal = sucursal;
        this.localidad = localidad;
    }
}
