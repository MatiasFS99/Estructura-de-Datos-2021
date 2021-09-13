package ejercicios.Punto3;

import java.util.Comparator;

public class ClienteComparator implements Comparator<Credito> {

    public int compare(Credito o, Credito o1) {
        int resultado = o.getCliente().getApellido().compareTo(o1.getCliente().getApellido());

        if (resultado == 0) {
            resultado = o.getCliente().getNombre().compareTo(o1.getCliente().getNombre());
        }

        return resultado;
    }

}
