package App;

import Entities.*;
import Enums.Estado;
import Enums.FormaPago;
import Enums.TipoEnvio;
import Enums.TipoPromocion;

import java.time.LocalDate;
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
                .id(1001L)
                .nombre("Buen Sabor Capital")
                .horarioApertura(LocalTime.of(10,0))
                .horarioCierre(LocalTime.of(18,0))
                .build();

        sucursalCapital.setDomicilio(domiciliosuc2);


        Sucursal sucursalGodoyCruz = Sucursal.builder()
                .id(1002L)
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


        // instanciamos imagenes

        Imagen img1 = Imagen.builder()
                .denominacion("promo_muzzarella_2x1.jpg")
                .build();

        Imagen img2 = Imagen.builder()
                .denominacion("happy_hour_empanadas.jpg")
                .build();

        Imagen img3 = Imagen.builder()
                .denominacion("nueva_promo_invierno.jpg")
                .build();

        // instanciamos promociones

        Promocion promo1 = Promocion.builder()
                .denominacion("Promocion de 2 muzzas + coca cola 1L")
                .fechaDesde(LocalDate.of(2025, 6, 10))
                .fechaHasta(LocalDate.of(2025, 8, 10))
                .horaDesde(LocalTime.of(10, 0))
                .horaHasta(LocalTime.of(22, 0))
                .descripcionDescuento("Se rebaja l precio de la 2da muzzarella")
                .precioPromocional(1000.0)
                .tipoPromocion(TipoPromocion.PROMOCION1)
                .build();

        Promocion promo2 = Promocion.builder()
                .denominacion("Happy Hour 3x2 en empanadas")
                .fechaDesde(LocalDate.of(2025, 6, 15))
                .fechaHasta(LocalDate.of(2025, 7, 15))
                .horaDesde(LocalTime.of(17, 0))
                .horaHasta(LocalTime.of(20, 0))
                .descripcionDescuento("Llevás 3 empanadas y pagás 2")
                .precioPromocional(1200.0)
                .tipoPromocion(TipoPromocion.HAPPYHOUR)
                .build();





        // instancias de articulo

        UnidadMedida litro = UnidadMedida.builder()
                .denominacion("Litro")
                .build();

        UnidadMedida kilo = UnidadMedida.builder()
                .denominacion("Kilo")
                .build();


        // ArticuloInsumo

        ArticuloInsumo insumo1 = ArticuloInsumo.builder()
                .denominacion("Harina")
                .precioVenta(150.0)
                .precioCompra(100.0)
                .stockActual(50)
                .stockMaximo(200)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo insumo2 = ArticuloInsumo.builder()
                .denominacion("Azúcar")
                .precioVenta(120.0)
                .precioCompra(90.0)
                .stockActual(70)
                .stockMaximo(150)
                .esParaElaborar(true)
                .build();

        ArticuloInsumo insumo3 = ArticuloInsumo.builder()
                .denominacion("Levadura")
                .precioVenta(200.0)
                .precioCompra(150.0)
                .stockActual(30)
                .stockMaximo(100)
                .esParaElaborar(true)
                .build();

        // producto manufacturado detalle

        ArticuloManufacturadoDetalle detalleHarina = ArticuloManufacturadoDetalle.builder()
                .cantidad(2)
                .articuloInsumo(insumo1)
                .build();

        // articulo manufacturado


        ArticuloManufacturado articulo1 = ArticuloManufacturado.builder()
                .id(101L)
                .denominacion("Pizza Margarita")
                .precioVenta(1500.0)
                .descripcion("Pizza clásica con tomate, mozzarella y albahaca")
                .tiempoEstimadoMinutos(5)
                .preparacion("Hornear a 350 grados durante 5 minutos")
                .build();

        ArticuloManufacturado articulo2 = ArticuloManufacturado.builder()
                .id(102L)
                .denominacion("Empanada de carne")
                .precioVenta(200.0)
                .descripcion("Empanada rellena de carne molida, aceituna y huevito")
                .tiempoEstimadoMinutos(20)
                .preparacion("Cocinar en horno hasta dorar")
                .build();

        ArticuloManufacturado articulo3 = ArticuloManufacturado.builder()
                .id(103L)
                .denominacion("Tarta de pollo")
                .precioVenta(1200.0)
                .descripcion("Tarta salada rellena de pollo, cebolla y crema")
                .tiempoEstimadoMinutos(40)
                .preparacion("Hornear hasta que la masa esté dorada")
                .build();



        // usamos el metodo para agregar detalle

        articulo1.agregarDetale(detalleHarina);


        // categorias

        // Categoría padre
        Categoria categoriaAlimentos = Categoria.builder()
                .denominacion("Alimentos")
                .build();

        // Subcategoría con categoría padre
        Categoria categoriaBebidas = Categoria.builder()
                .denominacion("Bebidas")
                .categoriaPadre(categoriaAlimentos)
                .build();

        // Subcategoría con categoría padre
        Categoria categoriaSnacks = Categoria.builder()
                .denominacion("Snacks")
                .categoriaPadre(categoriaAlimentos)
                .build();





        // PEDIDOS

        // detalle pedidos

        DetallePedido detalle1 = DetallePedido.builder()
                .id(1L)
                .cantidad(2)
                .subTotal(800.0)
                .articulo(articulo1)
                .build();

        // pedidos

        Pedido pedidoEjemplo = Pedido.builder()
                .horaEstimadaFinalizacion(LocalTime.of(12, 30))
                .total(1500.0)
                .totalCosto(1200.0)
                .estado(Estado.PREPARACION)
                .tipoEnvio(TipoEnvio.TAKEAWAY)
                .formaPago(FormaPago.EFECTIVO)
                .fechaPedido(LocalDate.now())
                .domicilio(domicilio1)
                .sucursal(sucursalCapital)
                //.factura(facturaEjemplo)
                //.detallePedidos(Set.of(detallePedido1, detallePedido2)) // poner aca el detalle del pedido
                .build();


        // factura

        Factura factura1 = Factura.builder()
                .fechaFacturacion(LocalDate.of(2025, 6, 10))
                .mpPaymentId(123456)
                .mpMerchantOrderId(123)
                .mpPreferenceId("pref-abc-123")
                .mpPaymentType("credit_card")
                .totalVenta(1500.0)
                .formaPago(FormaPago.MERCADOPAGO)
                .build();


        // usuario
        Usuario usuario1 = Usuario.builder()
                .id(1234L)
                .authOId("abc123")
                .username("seba.saez")
                .build();


        // cliente

        Cliente cliente = Cliente.builder()
                .id(100L)
                .nombre("Sebastian")
                .apellido("Saez")
                .telefono("2611234567")
                .email("seba.saez@gmail.com")
                .fechaNacimiento(LocalDate.of(1995, 5, 20))
                .usuario(usuario1)
                .imagen(img1)
                .build();









    }
}