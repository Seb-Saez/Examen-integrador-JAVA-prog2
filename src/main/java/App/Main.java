package App;

import Entities.*;

import java.time.LocalTime;

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

        //domicilio 1 clientes
        Domicilio domicilio1 = Domicilio.builder()
                .calle("Av. Siempreviva")
                .numero(123)
                .cp(5509)
                .build();

        domicilio1.setLocalidad(localidad1); // maipu

        // domicilio 2 clientes
        Domicilio domicilio2 = Domicilio.builder()
                .calle("San Martin")
                .numero(1954)
                .cp(5506)
                .build();

        domicilio2.setLocalidad(localidad2); // capital


        // domicilio sucursal  1
        Domicilio domiciliosuc1 = Domicilio.builder()
                .calle("San Fernando")
                .numero(1258)
                .cp(5507)
                .build();

        domiciliosuc1.setLocalidad(localidad1); // maipu

        // domicilio sucursal 2
        Domicilio domiciliosuc2 = Domicilio.builder()
                .calle("Belgrano")
                .numero(937)
                .cp(5503)
                .build();

        domiciliosuc2.setLocalidad(localidad2); // capital

        // domicilio sucursal 3
        Domicilio domiciliosuc3 = Domicilio.builder()
                .calle("Belgrano")
                .numero(631)
                .cp(5504)
                .build();

        domiciliosuc3.setLocalidad(localidad3); // godoy cruz

        System.out.println("El domicilio 1 es en calle: " + domicilio1.getCalle() + " al numero: " + domicilio1.getNumero() + " y esta ubicado en la ciudad: " + domicilio1.getLocalidad().getNombre() + " en la provincia de " + domicilio1.getLocalidad().getProvincia().getNombre() + " y  en el pais " + domicilio1.getLocalidad().getProvincia().getPais().getNombre());

        // Instanciamos una empresa

        Empresa empresa1 = Empresa.builder()
                .nombre("Buen Sabor")
                .razonSocial("SA")
                .cuil(123456789)
                .build();

        // instanciamos unas sucursales

        Sucursal sucursalMaipu = Sucursal.builder()
                .nombre("Buen Sabor Maipu")
                .horarioApertura(LocalTime.of(10,0))
                .horarioCierre(LocalTime.of(18,0))
                .build();

        sucursalMaipu.setDomicilio(domiciliosuc1);


        Sucursal sucursalCapital = Sucursal.builder()
                .nombre("Buen Sabor Capital")
                .horarioApertura(LocalTime.of(10,0))
                .horarioCierre(LocalTime.of(18,0))
                .build();

        sucursalCapital.setDomicilio(domiciliosuc2);


        Sucursal sucursalGodoyCruz = Sucursal.builder()
                .nombre("Buen Sabor Godoy cruz")
                .horarioApertura(LocalTime.of(10,0))
                .horarioCierre(LocalTime.of(18,0))
                .build();

        sucursalGodoyCruz.setDomicilio(domiciliosuc3);

        // agregamos las sucursales a la empresa
        empresa1.agregarSucursal(sucursalMaipu);
        empresa1.agregarSucursal(sucursalCapital);

        // Mostramos que funcionan los metodos
        System.out.println(sucursalCapital);
        System.out.println("La sucursal de capital pertenece a la empresa: " + sucursalCapital.getEmpresa().getNombre());
        System.out.println(empresa1);



        System.out.println("------ PRUEBA -------");








    }
}