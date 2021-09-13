package ejercicios.Punto4;

import java.util.Comparator;

public class TotalDevolComparator implements Comparator<Credito> {

    @Override
    public int compare(Credito o, Credito o1) {
        int resultado = o.getTotalADevolver().compareTo(o1.getTotalADevolver());
        return resultado;
    }
}
