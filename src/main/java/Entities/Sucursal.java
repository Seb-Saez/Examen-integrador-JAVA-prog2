package Entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
// cuando ponemos arriba de la clase esta notacion de lombok, se aplican a todos los campos
// si quisieramos hacerlo uno por uno tenemos que ponerlo arriba del atributo que queramos
// esto hace todos los getters, todos los setters y el constructor sin argumentos

// NO VAMOS A USAR ACA DE MOMENTO EL AllArgsConstructor para agregar empresa luego con un setter
public class Sucursal extends Base {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;
    private Empresa empresa;
    private Domicilio domicilio;
    private LinkedHashSet<Promocion> promociones = new LinkedHashSet<>();
    private LinkedHashSet<Categoria> categorias = new LinkedHashSet<>();

    // constructor de sucursal, no lleva empresa porque debe hacerse desde empresa con setSucursal para mantener la relacion bidireccional y no romper el encapsulamiento
    public Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    public void agregarPromocion(Promocion promocion) {
        promociones.add(promocion);
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "nombre='" + nombre + '\'' +
                ", horarioApertura=" + horarioApertura +
                ", horarioCierre=" + horarioCierre +
                ", empresa=" + (empresa != null ? empresa.getNombre() : "sin empresa") +
                ", domicilio=" + (domicilio != null ? domicilio.toString() : "sin domicilio") +
                '}';
    }
}
// Cuando vayamos a instancial una empresa y sucursal, primero instanciar la sucursal
// y luego la empresa y con el setSucursal agregamos la sucursal a la empresa
// hay que mantener este orden
