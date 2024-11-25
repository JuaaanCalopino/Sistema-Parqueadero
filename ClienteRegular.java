public class ClienteRegular extends Cliente {
    private int puntosAcomulados;

    public ClienteRegular(String nombre, String cedula, String telefono, boolean estaSuscrito, int puntosAcomulados) {
        super(nombre, cedula, telefono, estaSuscrito);
        this.puntosAcomulados = puntosAcomulados;
    }

    public void canjearPuntos() {
        System.out.println("Puntos canjeados: " + puntosAcomulados);
    }
}
