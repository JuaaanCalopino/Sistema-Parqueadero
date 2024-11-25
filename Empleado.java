public abstract class Empleado extends Persona {
    protected float salario;
    protected String identificacion;

    public Empleado(String nombre, String cedula, String telefono, float salario, String identificacion) {
        super(nombre, cedula, telefono);
        this.salario = salario;
        this.identificacion = identificacion;
    }
}
