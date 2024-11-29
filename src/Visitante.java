public class Visitante extends Cliente {

    private static final String fechaInicio = String.valueOf(23);
    private static final String fechaFin = String.valueOf(24);

    public Visitante(String nombre, String cedula, String telefono) {
        super(nombre, cedula, telefono, fechaInicio, fechaFin);
    }

    @Override
    public void ocuparPlaza(Plaza plaza, Vehiculo vehiculo) {

    }

    @Override
    public void realizarPago(MetodoDePago metodoDePago) {

    }
}

