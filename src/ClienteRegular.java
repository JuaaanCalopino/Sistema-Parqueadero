public class ClienteRegular extends Cliente {
    private double descuento;
    private Plaza plaza; // Este atributo almacena la plaza reservada por el cliente

    public ClienteRegular(String nombre, String cedula, String telefono, String fechaInicio, String fechaFin, double descuento) {
        super(nombre, cedula, telefono, fechaInicio, fechaFin);
        this.descuento = descuento;
        this.plaza = null; // Inicializamos plaza en null porque no siempre se reserva al crear el cliente
    }

    public double getDescuento() {
        return descuento;
    }

    @Override
    public void ocuparPlaza(Plaza plaza, Vehiculo vehiculo) {

    }

    @Override
    public void realizarPago(MetodoDePago metodoDePago) {

    }

    public void realizarReserva(Plaza plaza) {
        this.plaza = plaza;
        System.out.println(getNombre() + " reservó la plaza número " + plaza.getNumero());
    }

    public Plaza getPlaza() {
        if (plaza == null) {
            System.out.println("El cliente regular no tiene ninguna plaza reservada.");
        }
        return plaza;
    }
}

