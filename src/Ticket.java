public class Ticket {
    private boolean estaSuscrito;
    private String codigo;

    public Ticket(boolean estaSuscrito, String codigo) {
        this.estaSuscrito = estaSuscrito;
        this.codigo = codigo;
    }

    public boolean comprobarSuscripcion() {
        return estaSuscrito;
    }

    public float aplicarDescuento(float monto) {
        if (estaSuscrito) {
            return monto * 0.9f; // 10% de descuento
        }
        return monto;
    }
}

