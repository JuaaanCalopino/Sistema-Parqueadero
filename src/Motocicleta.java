public class Motocicleta extends Vehiculo {
    private String marca;

    public Motocicleta(String matricula, String modelo, String color, String marca) {
        super(matricula, modelo, color);
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }
}



