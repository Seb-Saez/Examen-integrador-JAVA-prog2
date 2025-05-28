package Entities;

import java.util.HashSet;
import java.util.Set;

public class Empresa  extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales = new HashSet<>();

    // metodo para agregar sucursales a la empresa que lo use
    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
        sucursal.setEmpresa(this);
    }

    // constructor
    public Empresa() {
    }
}