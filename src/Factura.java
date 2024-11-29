public class Factura {
    private String notaDeVenta;

    public Factura(String notaDeVenta) {
        this.notaDeVenta = notaDeVenta;
    }

    public String generar() {
        return "Factura generada: " + notaDeVenta;
    }

    public float calcularTotal(float monto) {
        return monto * 1.12f; // 12% de IVA
    }
}

