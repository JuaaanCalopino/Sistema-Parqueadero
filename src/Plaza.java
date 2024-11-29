public class Plaza {
    private int numero;
    private boolean ocupada;
    private Vehiculo vehiculo;

    public Plaza(int numero) {
        this.numero = numero;
        this.ocupada = false;
        this.vehiculo = null;
    }

    public Plaza(int i, boolean b) {
    }

    public int getNumero() {
        return numero;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocupar(Vehiculo vehiculo) {
        this.ocupada = true;
        this.vehiculo = vehiculo;
    }

    public void liberar() {
        this.ocupada = false;
        this.vehiculo = null;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
}



