public abstract class Empleado extends Persona {
    private float salario;

    public Empleado(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void supervisarOperaciones() {
    }
}


