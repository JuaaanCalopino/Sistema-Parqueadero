import java.util.Date;

public class Suscripcion {
    private Date fechaInicio;
    private Date fechaFin;
    private String codigo;
    private float descuentoObtenido;

    public Suscripcion(Date fechaInicio, Date fechaFin, String codigo, float descuentoObtenido) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.codigo = codigo;
        this.descuentoObtenido = descuentoObtenido;
    }

    public boolean estaActiva() {
        Date actual = new Date();
        return actual.after(fechaInicio) && actual.before(fechaFin);
    }
}

