public class Main {
    public static void main(String[] args) {
        // Crear parqueadero
        Parqueadero parqueadero = new Parqueadero("Central", 5);

        // Crear vehículos
        Vehiculo auto = new Automovil("ABC123", "Toyota", "Rojo");
        Vehiculo moto = new Motocicleta("DEF456", "Yamaha", "Negra");

        parqueadero.registrarVehiculo(auto);
        parqueadero.registrarVehiculo(moto);

        // Crear cliente
        ClienteRegular cliente = new ClienteRegular("Sebastián", "1103456789", "0987654321", true, 200);
        cliente.canjearPuntos();

        // Crear y realizar pago
        Pago pago = new Pago(10.50f, MetodoDePago.EFECTIVO);
        pago.cobrar();
    }
}
