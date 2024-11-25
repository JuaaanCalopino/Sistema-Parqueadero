import java.util.ArrayList;

public class Parqueadero {
    private String nombre;
    private int maxCapacidad;
    private ArrayList<Vehiculo> vehiculos;

    public Parqueadero(String nombre, int maxCapacidad) {
        this.nombre = nombre;
        this.maxCapacidad = maxCapacidad;
        this.vehiculos = new ArrayList<>();
    }

    public boolean registrarVehiculo(Vehiculo vehiculo) {
        if (vehiculos.size() < maxCapacidad) {
            vehiculos.add(vehiculo);
            System.out.println("Vehículo registrado: " + vehiculo.marca);
            return true;
        }
        System.out.println("Capacidad máxima alcanzada");
        return false;
    }
}
