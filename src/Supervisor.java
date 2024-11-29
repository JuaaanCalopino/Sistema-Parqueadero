public class Supervisor extends Empleado {
    private String codigoSupervision;

    public Supervisor(String nombre, String cedula, String telefono, float salario, String codigoSupervision) {
        super(nombre, cedula, telefono);
        this.codigoSupervision = codigoSupervision;
    }

    public void supervisarOperaciones() {
        System.out.println("Supervisando operaciones...");
    }
}


