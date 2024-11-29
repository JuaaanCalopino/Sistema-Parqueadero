public abstract class Cliente extends Persona {
    protected String fechaIngreso;
    protected String fechaEgreso;
    protected MetodoDePago metodoDePago;

    public Cliente(String nombre, String cedula, String telefono, String fechaInicio, String fechaFin) {
        super(nombre, cedula, telefono);
        this.fechaIngreso = fechaIngreso;
        this.fechaEgreso = fechaEgreso;
    }

    public Cliente() {
        super();
    }

    public abstract void ocuparPlaza(Plaza plaza, Vehiculo vehiculo);

    public abstract void realizarPago(MetodoDePago metodoDePago);

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getFechaEgreso() {
        return fechaEgreso;
    }

    public void realizarReserva(Plaza plazaRegular) {
    }

    public Plaza getPlaza() {
        return null;
    }
}


