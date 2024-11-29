public class Main {
    public static void main(String[] args) {
        // Crear un cliente regular
        ClienteRegular clienteRegular = new ClienteRegular(
                "Juan Pérez",       // Nombre
                "01020304",         // Cédula
                "0987654321",       // Teléfono
                "2024-11-28",       // Fecha de inicio
                "2024-11-30",       // Fecha de fin
                0.10                // Descuento del 10%
        );

        // Crear un visitante
        Visitante visitante = new Visitante(
                "María López",      // Nombre
                "02030405",         // Cédula
                "0998765432"        // Teléfono
        );

        // Crear vehículos
        Vehiculo vehiculoRegular = new Automovil("ABC-123", "Corolla", "Rojo", "Toyota");
        Vehiculo vehiculoVisitante = new Motocicleta("XYZ-987", "Ninja", "Negro", "Kawasaki");

        // Crear plazas y asociarlas
        Plaza plazaRegular = new Plaza(1); // Plaza para el cliente regular
        clienteRegular.realizarReserva(plazaRegular);

        Plaza plazaVisitante = new Plaza(2); // Plaza para el visitante

        // Crear un cajero
        Cajero cajero = new Cajero("Carlos Sánchez", "05060708", "0981234567");

        // Calcular pagos
        double montoRegular = 50.00; // Ejemplo de costo base
        double montoDescuento = montoRegular * clienteRegular.getDescuento();
        double montoFinalRegular = montoRegular - montoDescuento;

        double montoVisitante = 30.00; // Ejemplo de costo para visitante

        // Registrar pagos
        cajero.registrarPago(montoFinalRegular);
        cajero.registrarPago(montoVisitante);

        // Mostrar detalles del cliente regular
        System.out.println("\n===== Detalles del Cliente Regular =====");
        System.out.println("Nombre: " + clienteRegular.getNombre());
        System.out.println("Tipo de cliente: Regular");
        System.out.println("Plaza reservada: Número " + clienteRegular.getPlaza().getNumero());
        System.out.println("Vehículo: " + vehiculoRegular.getMarca() + " " + vehiculoRegular.getModelo() + " (" + vehiculoRegular.getColor() + ")");
        System.out.println("Matrícula: " + vehiculoRegular.getMatricula());
        System.out.println("Descuento aplicado: " + (clienteRegular.getDescuento() * 100) + "%");
        System.out.println("Monto final pagado: $" + montoFinalRegular);

        // Mostrar detalles del visitante
        System.out.println("\n===== Detalles del Visitante =====");
        System.out.println("Nombre: " + visitante.getNombre());
        System.out.println("Tipo de cliente: Visitante");
        System.out.println("Plaza asignada: Número " + plazaVisitante.getNumero());
        System.out.println("Vehículo: " + vehiculoVisitante.getMarca() + " " + vehiculoVisitante.getModelo() + " (" + vehiculoVisitante.getColor() + ")");
        System.out.println("Matrícula: " + vehiculoVisitante.getMatricula());
        System.out.println("Monto final pagado: $" + montoVisitante);

        // Mostrar factura
        System.out.println("\n===== Factura =====");
        System.out.println("Atendido por: " + cajero.getNombre());
        System.out.println("Cliente: " + clienteRegular.getNombre());
        System.out.println("Vehículo: " + vehiculoRegular.getMarca() + " " + vehiculoRegular.getModelo());
        System.out.println("Plaza: Número " + clienteRegular.getPlaza().getNumero());
        System.out.println("Subtotal: $" + montoRegular);
        System.out.println("Descuento: -$" + montoDescuento);
        System.out.println("Total a pagar: $" + montoFinalRegular);

        System.out.println("\nCliente: " + visitante.getNombre());
        System.out.println("Vehículo: " + vehiculoVisitante.getMarca() + " " + vehiculoVisitante.getModelo());
        System.out.println("Plaza: Número " + plazaVisitante.getNumero());
        System.out.println("Total a pagar: $" + montoVisitante);
    }
}
