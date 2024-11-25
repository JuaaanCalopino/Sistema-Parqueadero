public class Plaza {
    private int numero;
    private boolean ocupada;

    public Plaza(int numero) {
        this.numero = numero;
        this.ocupada = false;
    }

    public void ocupar() {
        this.ocupada = true;
        System.out.println("Plaza " + numero + " ocupada.");
    }

    public void liberar() {
        this.ocupada = false;
        System.out.println("Plaza " + numero + " liberada.");
    }
}
