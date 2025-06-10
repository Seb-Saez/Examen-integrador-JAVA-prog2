package App;

import Entities.Domicilio;
import Entities.Localidad;
import Entities.Pais;
import Entities.Provincia;

public class Main{
    public static void main(String[] args) {

        // instancia Pais
        Pais pais1 = Pais.builder()
                .nombre("Argentina")
                .build();
        Pais pais2 = Pais.builder()
                .nombre("Chile")
                .build();

        System.out.println(pais1);

        // instancia provincias

        Provincia provincia1 = Provincia.builder()
                .nombre("Mendoza")
                .build();

        provincia1.setPais(pais1);

        Provincia provincia2 = Provincia.builder()
                .nombre("Cordoba")
                .build();
        provincia2.setPais(pais1);

        Provincia provincia3 = Provincia.builder()
                .nombre("Santa Fe")
                .build();
        provincia3.setPais(pais1);

        System.out.println("Provincia 1 es: " + provincia1.getNombre() + " y pertenece al pais: " + provincia1.getPais().getNombre());

        // instancias localidad
        Localidad localidad1 = Localidad.builder()
                .nombre("Maipu")
                .build();
        localidad1.setProvincia(provincia1);

        Localidad localidad2 = Localidad.builder()
                .nombre("Godoy Cruz")
                .build();
        localidad2.setProvincia(provincia1);

        Localidad localidad3 = Localidad.builder()
                .nombre("Capital")
                .build();
        localidad3.setProvincia(provincia1);

        // instancia Domiclios

        Domicilio domicilio1 = Domicilio.builder()
                .calle("Av. Siempreviva")
                .numero(123)
                .cp(5509)
                .build();

        Domicilio domicilio2 = Domicilio.builder()
                .calle("")
                .numero(1954)
                .cp(5506)
                .build();







    }
}