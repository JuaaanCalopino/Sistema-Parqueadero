public interface iParqueadero {
    boolean registrarVehiculo(String matricula);
    boolean retirarVehiculo(String matricula);
    void abrirParqueadero();
    void cerrarParqueadero();
}


