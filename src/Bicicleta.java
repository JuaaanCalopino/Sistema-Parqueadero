public class Bicicleta extends Vehiculo {
    private boolean tienePedales;

    public Bicicleta(String matricula, String modelo, String color, boolean tienePedales) {
        super(matricula, modelo, color);
        this.tienePedales = tienePedales;
    }

    @Override
    public String getMarca() {
        return "";
    }
}


