package ejercicios.Punto2y3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

import java.util.List;

public class MarcacionesAdmin extends MarcacionesAdminAbstract {

    @Override
    /**
     * Devuelve todos los empleados de los que se tiene registro de marcaci�n
     * (No repetir resultados).
     *
     * @return
     */
    public List<Empleado> empleados() {
        List<Empleado> respuesta = new ArrayList();

        for (int i = 0; i < marcacionesList.size(); i++) {
            int b = 0;
            int a = i;
            while (a > 0) {
                if (marcacionesList.get(i).getEmpleado().equals(marcacionesList.get(a - 1).getEmpleado())) {
                    b++;
                }
                a--;
            }
            if (b == 0) {
                respuesta.add(marcacionesList.get(i).getEmpleado());
            }
        }

        return respuesta;
        
      

    }

    @Override
    /**
     * Devuelve todas las marcaciones de un empleado.
     *
     * @param empleado
     * @return
     */
    public List<Marcacion> filtroPorEmpleado(Empleado empleado) {
        List<Marcacion> respuesta = new ArrayList();

        for (Marcacion resul : marcacionesList) {
            if (resul.getEmpleado().equals(empleado)) {
                respuesta.add(resul);
            }
        }

        return respuesta;
    }

    @Override
    /**
     * Devuelve todas las marcaciones del tipo especificado por par�metro.
     *
     * @param tipo
     * @return
     */
    public List<Marcacion> filtroPorTipo(MarcacionTipo tipo) {
        List<Marcacion> respuesta = new ArrayList();

        for (Marcacion resul : marcacionesList) {
            if (resul.getTipo() == tipo) {
                respuesta.add(resul);
            }
        }

        return respuesta;
    }

    @Override
    /**
     * Devuelve las marcaciones realizadas fuera del horario de ingreso.
     *
     * @return
     */
    public List<Marcacion> llegaronTarde() {
        List<Marcacion> respuesta = new ArrayList();

        for (Marcacion resul : marcacionesList) {
            if (resul.getFechaHora().getHora().isAfter(resul.getEmpleado().getOficina().getHoraEntrada())
                && resul.getFechaHora().getHora().isBefore(resul.getEmpleado().getOficina().getHoraSalida())) {

                respuesta.add(resul);

            }
        }

        return respuesta;
    }

    @Override
    /**
     * Ordena las marcaciones por el criterio especificado en compareTo()
     */
    public void ordenar() {
        Collections.sort(this.marcacionesList);
    }

    @Override
    /**
     * Ordena las marcaciones por el criterio pasado por par�metro.
     *
     * @param comparator
     */
    public void ordenar(Comparator comparator) {
        Collections.sort(this.marcacionesList, comparator);
    }

    @Override
    /**
     * Transforma en String todas las instancias de Marcaci�n almacenadas en
     * marcacionesList
     *
     * @return
     */
    public String toString() {
        String resultado = "";

        for (Marcacion resul : marcacionesList) {

            resultado += resul.toString() + '\n';
        }

        return resultado;
    }

}
