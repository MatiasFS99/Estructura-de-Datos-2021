package ejercicios.Punto2;

import java.util.Comparator;

public class LegajoComparator implements Comparator<Marcacion> {
    public int compare(Marcacion o, Marcacion o1) {
        return Integer.compare(o.getEmpleado().getLegajo(), o1.getEmpleado().getLegajo());
    }
}
