package ejercicios.Punto2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public abstract class MarcacionesAdminAbstract {

    protected List<Marcacion> marcacionesList;

    public MarcacionesAdminAbstract() {
        marcacionesList = new ArrayList();
    }

    /**
     * Devuelve la cantidad de elementos en marcacionesList
     *
     * @return
     */

    public int size() {
        return marcacionesList.size();
    }

    /**
     * Agrega una marcaci�n en marcacionesLis
     *
     * @param a
     */
    public void add(Marcacion a) {
        marcacionesList.add(a);
    }

    /**
     * Devuelve la marcaci�n ubicada en index.
     *
     * @param index
     * @return
     */
    public Marcacion get(int index) {
        return marcacionesList.get(index);
    }

    /**
     * Quita y devuelve el elemento ubicado index.
     *
     * @param index
     * @return
     */
    public Marcacion remove(int index) {
        return marcacionesList.remove(index);
    }

    /**
     * Devuelve todos los empleados de los que se tiene registro de marcaci�n
     * (No repetir resultados).
     *
     * @return
     */
    public abstract List<Empleado> empleados();

    /**
     * Devuelve todas las marcaciones de un empleado.
     *
     * @param empleado
     * @return
     */
    public abstract List<Marcacion> filtroPorEmpleado(Empleado empleado);

    /**
     * Devuelve todas las marcaciones del tipo especificado por par�metro.
     *
     * @param tipo
     * @return
     */
    public abstract List<Marcacion> filtroPorTipo(MarcacionTipo tipo);

    /**
     * Devuelve las marcaciones realizadas fuera del horario de ingreso.
     *
     * @return
     */
    public abstract List<Marcacion> llegaronTarde();

    /**
     * Ordena las marcaciones por el criterio especificado en compareTo()
     */
    public abstract void ordenar();

    /**
     * Ordena las marcaciones por el criterio pasado por par�metro.
     *
     * @param comparator
     */
    public abstract void ordenar(Comparator comparator);

    /**
     * Transforma en String todas las instancias de Marcaci�n almacenadas en
     * marcacionesList
     *
     * @return
     */
    @Override
    public abstract String toString();
}
