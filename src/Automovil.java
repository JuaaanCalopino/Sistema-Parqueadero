public class Automovil extends Vehiculo {
    private String marca;

    public Automovil(String matricula, String modelo, String color, String marca) {
        super(matricula, modelo, color);
        this.marca = marca;
    }

    @Override
    public String getMarca() {
        return marca;
    }
}




