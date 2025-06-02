Trabajo Final Integrador Programacion II - JAVA

Comision 4

Integrantes:

- Aguilar Ignacio
- Baggio Miguel
- Castro Nicolas
- Lemos Sofia
- Osorio Alejo
- Saez Sebastian


1: Formas de instanciar para el Main:

 - Empresa y sucursal:
Cuando vamos a instanciar una empresa y una sucursal, no debemos pasarle en el constructor de empresa, la sucursal, hay que hacerlo mediante el metodo agregarSucursal, en empresa. Pero previamente debemos instanciar la sucursal

Parametros Empresa: Empresa(String nombre, String razonSocial, Integer cuil)

- Domicilio y  sucursal:
Hay que instanciar un domicilio antes, porque hay que mandarlo como parametro al constructor

Domicilio: Domicilio(String calle, Integer numero, Integer cp)

Sucursal: Sucursal(String nombre, LocalTime horarioApertura, LocalTime horarioCierre)