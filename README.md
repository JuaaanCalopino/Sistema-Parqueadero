# Sistema de Gestion de Parqueadero
![image](https://github.com/user-attachments/assets/194c9c30-20ac-45c6-b3ee-66a2d188d5f3)


Este proyecto presenta un sistema de gestión de parqueadero pensado con un enfoque orientado a objetos, modelado mediante diagramas de clases UML. 
Su principal objetivo es facilitar la administración de los espacios de estacionamiento, registrar vehículos, gestionar tarifas y controlar ingresos y egresos, ofreciendo una solución estructurada y fácil de extender.

El diagrama de clases muestra cómo se relacionan las entidades clave del sistema de parqueadero , como los vehículos, los espacios de parqueo, los clientes y los empleados. Esto permite entender claramente la estructura y sentar una base sólida para su implementación en un entorno real.

## Componentes Principales
Parqueadero: Contiene una lista de pisos y gestiona las operaciones generales del sistema.

`Piso`: Cada piso tiene varias plazas de estacionamiento.

`Plaza`: Representa una unidad de estacionamiento que puede estar ocupada o disponible.

## Componentes de un sistema de gestión de parqueadero : 

Facturación: Permite generar recibos y gestionar los pagos.

Enumeradores:

`MetodoDePago` : Métodos disponibles para realizar pagos.

`EstadoPlaza`: Define si una plaza está ocupada o libre.

Interfaces : 
`interaccionCliente` :
La realiza la clase abstracta empleado.
`iParqueadero`:
La realiza la clase llamada Parqueadero.

## Vehículo ( Clase abstracta ) :

Clase base para los tipos específicos de vehículos, como automóviles, motocicletas y bicicletas.
## Persona ( clase abstracta):

De esta clase herendan diferentes clases como cliente y empleado

## Cliente (Clase abstracta) :
`ClienteRegular`: Cliente con suscripción, descuentos, y la capacidad de realizar reservas.

`Visitante`: Cliente ocasional sin suscripción.

### Empleado Clase abstracta:

`Cajero`: Registra pagos.

`Supervisor`: Gestiona operaciones generales del parqueadero.


