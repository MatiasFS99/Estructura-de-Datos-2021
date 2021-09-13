package ejercicios.Punto2y3;

import java.util.Comparator;

public class LegajoComparator implements Comparator<Marcacion> {

    @Override
    public int compare(Marcacion o, Marcacion o1) {
        return Integer.compare(o.getEmpleado().getLegajo(), o1.getEmpleado().getLegajo());
    }
}
