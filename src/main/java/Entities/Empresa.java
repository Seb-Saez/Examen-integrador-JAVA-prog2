package Entities;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@SuperBuilder
public class Empresa  extends Base {
    private String nombre;
    private String razonSocial;
    private Integer cuil;
    @Builder.Default
    private Set<Sucursal> sucursales = new HashSet<>();


    public Empresa(String nombre, String razonSocial, Integer cuil) {
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = cuil;
    }

    // metodo para agregar sucursales a la empresa que lo use
    public void agregarSucursal(Sucursal sucursal){
        sucursales.add(sucursal);
        sucursal.setEmpresa(this); // esta linea de codigo le dice a sucursal que setee como su empresa a esta empresa que la esta agregando a la lista de sus sucursales
    }


}