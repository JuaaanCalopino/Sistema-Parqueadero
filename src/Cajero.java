public class Cajero extends Empleado {
    public Cajero(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
    }

    public void registrarPago(double monto) {
        System.out.println(getNombre() + " ha registrado un pago de $" + monto);
    }
}



