public abstract class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String color;

    public Vehiculo(String matricula, String marca, String color) {
        this.matricula = matricula;
        this.marca = marca;
        this.color = color;
    }
}
