public class Cajero extends Empleado {
    private String turno;
    private int ventasTotales;

    public Cajero(String nombre, String cedula, String telefono, float salario, String identificacion, String turno) {
        super(nombre, cedula, telefono, salario, identificacion);
        this.turno = turno;
        this.ventasTotales = 0;
    }

    public void emitirTicket() {
        ventasTotales++;
        System.out.println("Ticket emitido por el cajero: " + nombre);
    }
}
