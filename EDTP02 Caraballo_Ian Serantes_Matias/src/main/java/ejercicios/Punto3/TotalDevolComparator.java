package ejercicios.Punto3;

import java.util.Comparator;

public class TotalDevolComparator implements Comparator<Credito> {
    public int compare(Credito o, Credito o1) {
        int resultado = o.getTotalADevolver().compareTo(o1.getTotalADevolver());
        return resultado;
    }
}
