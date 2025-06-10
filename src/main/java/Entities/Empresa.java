package Entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@SuperBuilder
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