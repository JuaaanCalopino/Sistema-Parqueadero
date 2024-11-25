public class Cliente extends Persona {
    protected boolean estaSuscrito;

    public Cliente(String nombre, String cedula, String telefono, boolean estaSuscrito) {
        super(nombre, cedula, telefono);
        this.estaSuscrito = estaSuscrito;
    }

    public void comprarTicket() {
        System.out.println("Cliente " + nombre + " compró un ticket.");
    }
}
