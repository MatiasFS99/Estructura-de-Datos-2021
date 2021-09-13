package ejercicios.Punto2y3;

import java.util.Comparator;

public class EmpleadoNombreComparador implements Comparator<Marcacion> {

    @Override
    public int compare(Marcacion o, Marcacion o1) {
        int resultado = o.getEmpleado().getApellido().compareTo(o1.getEmpleado().getApellido());

        if (resultado == 0) {
            resultado = o.getEmpleado().getNombre().compareTo(o1.getEmpleado().getNombre());
        }
        return resultado;
    }
}
