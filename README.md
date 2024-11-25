# Sistema-Parqueadero
![image](https://github.com/user-attachments/assets/ccac425d-3144-44d5-a2f9-627536ae310d)

Este proyecto presenta un sistema de gestión de parqueadero pensado con un enfoque orientado a objetos, modelado mediante diagramas de clases UML. 
Su principal objetivo es facilitar la administración de los espacios de estacionamiento, registrar vehículos, gestionar tarifas y controlar ingresos y egresos, ofreciendo una solución estructurada y fácil de extender.

El diagrama de clases muestra cómo se relacionan las entidades clave del sistema de parqueadero , como los vehículos, los espacios de parqueo, los clientes y los empleados. Esto permite entender claramente la estructura y sentar una base sólida para su implementación en un entorno real.

## ``Cambios del primer intento de diagrama de clases UML acerca del sistema de gestión de parqueadero``
![image](https://github.com/user-attachments/assets/77989e3e-581c-4225-97b6-b002d5229583)
Este sistema de gestion de parqueadero fue el primero creado, a diferencia del principal tenia algunas caracteristicas con defectos  como las flechas de diagrama del uml, pues la clase principal tiene algunos cambios cómo :

``Metodos y atributos a clases faltantes``

Comparación de los diagramas

1. Clases y atributos:
   
``Class Diagram Principal:``

Contiene una mayor variedad de clases como ClienteRegular, Visitante, Supervisor, Cajero, entre otras.
Se incluyen atributos detallados para cada clase. Ejemplo: Cajero tiene turno y ventasTotales, mientras que Supervisor tiene areaAsignada.
La clase Parqueadero tiene atributos como nombre, dirección y maxCapacidad.
Class Diagram Base:

Posee menos clases en comparación con el diagrama principal.
Algunas clases tienen atributos distintos o ausentes. Por ejemplo, Empleado incluye #salario, pero no se mencionan atributos adicionales como en el otro diagrama.
La clase Vehiculo en este diagrama incluye NumeroDePuertas (específico de Automovil).
2. Métodos:

``Class Diagram Principal :``

Tiene métodos específicos y detallados para cada clase. Ejemplo: Cajero incluye emitirTicket() y aplicarDescuento().
Class Diagram Base:

Los métodos son más generales y menos descriptivos. Ejemplo: Supervisor solo incluye cobrar().

3. Relaciones entre clases:

``Class Diagram Principal:``

Posee relaciones más detalladas y específicas entre las clases, como multiplicidades (1..*), conexiones con Empleado, Piso, Plaza, y otras.
Se incluyen componentes relacionados como Suscripción y MétodoDePago.
Class Diagram Base:

Las relaciones son más simplificadas, sin el nivel de detalle de las multiplicidades en el principal.
No incluye componentes como Suscripción ni otras asociaciones complejas.

``4. Herencia y estructura:``
Class Diagram Principal:

Utiliza herencia con claridad, conectando clases como Automovil, Motocicleta, y Bicicleta a una clase base Vehiculo.
Incluye una interfaz (IParqueadero) y especifica métodos implementados.
Class Diagram Base:

La herencia es menos sobresaliente. Aunque las clases derivadas (Automovil, Motocicleta, etc.) existen, faltan detalles sobre cómo implementan características únicas.
También incluye una interfaz (InteraccionCliente), pero con métodos generales.

``5. Componentes omitidos:``
   
Class Diagram Base omitidos:
Clases como ClienteRegular, Factura, y Ticket.
Métodos y atributos relacionados con la gestión de clientes, suscripciones y descuentos.
# ``Codificacion del diagrama UML``
[SistemaDeParqueadero/src](https://github.com/JuaaanCalopino/Sistema-Parqueadero/tree/develoop/SistemaDeParqueadero/src)


