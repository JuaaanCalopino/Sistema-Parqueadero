public class Pago {
    private float monto;
    private MetodoDePago metodo;

    public Pago(float monto, MetodoDePago metodo) {
        this.monto = monto;
        this.metodo = metodo;
    }

    public void cobrar() {
        System.out.println("Pago de $" + monto + " realizado con " + metodo);
    }
}
