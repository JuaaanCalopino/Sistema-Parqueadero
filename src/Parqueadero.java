import java.util.ArrayList;

public class Parqueadero implements iParqueadero {
    private String nombre;
    private String direccion;
    private int maxCapacidad;
    private ArrayList<Plaza> plazas;

    public Parqueadero(String nombre, String direccion, int maxCapacidad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.maxCapacidad = maxCapacidad;
        this.plazas = new ArrayList<>();
        for (int i = 1; i <= maxCapacidad; i++) {
            plazas.add(new Plaza(i, false));
        }
    }

    @Override
    public boolean registrarVehiculo(String matricula) {
        System.out.println("Vehículo con matrícula " + matricula + " registrado en el parqueadero.");
        return true;
    }

    @Override
    public boolean retirarVehiculo(String matricula) {
        System.out.println("Vehículo con matrícula " + matricula + " retirado del parqueadero.");
        return true;
    }

    @Override
    public void abrirParqueadero() {
        System.out.println("El parqueadero está abierto.");
    }

    @Override
    public void cerrarParqueadero() {
        System.out.println("El parqueadero está cerrado.");
    }
}

