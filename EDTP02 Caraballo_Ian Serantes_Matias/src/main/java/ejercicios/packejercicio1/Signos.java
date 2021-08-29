package ejercicios.packejercicio1;
import java.util.Date;

public class Signos {
    private String nombre;
    private Date Fecha;

    public Signos(String nombre, Date Fecha) {
        this.nombre = nombre;
        this.Fecha = Fecha;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Date getFecha() {
        return this.Fecha;
    }

    @Override
    public String toString() {
        return"Signo: " + getNombre();
    }

}
