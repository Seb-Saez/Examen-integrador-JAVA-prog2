package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class Empresa  extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    private Set<Sucursal> sucursales = new HashSet<>();


    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    // metodo para agregar sucursales a la empresa que lo use
    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
        sucursal.setEmpresa(this);
    }


}