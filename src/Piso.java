import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int nivel;
    private List<Plaza> plazas;

    public Piso(int nivel, int cantidadPlazas) {
        this.nivel = nivel;
        this.plazas = new ArrayList<>();
        for (int i = 1; i <= cantidadPlazas; i++) {
            plazas.add(new Plaza(i));
        }
    }

    public int getNivel() {
        return nivel;
    }

    public List<Plaza> getPlazas() {
        return plazas;
    }

    public Plaza obtenerPlazaLibre() {
        for (Plaza plaza : plazas) {
            if (!plaza.isOcupada()) {
                return plaza;
            }
        }
        return null;
    }
}


