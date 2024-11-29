public class Pago {
    private float monto;

    public Pago(float monto) {
        this.monto = monto;
    }

    public float cobrarTicket() {
        System.out.println("Ticket cobrado: $" + monto);
        return monto;
    }
}

