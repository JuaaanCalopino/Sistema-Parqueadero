public class Supervisor extends Empleado {
    public Supervisor(String nombre, String cedula, String telefono, float salario, String identificacion) {
        super(nombre, cedula, telefono, salario, identificacion);
    }

    public void vigilarArea() {
        System.out.println("Supervisor " + nombre + " está vigilando el área.");
    }
}
