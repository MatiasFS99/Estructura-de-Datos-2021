package ejercicios.Punto4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

import java.util.Comparator;
import java.util.List;

public class CreditosAdmin extends CreditosAdminAbstract {

    @Override
    public List<Credito> creditosPorClienteTipo(ClienteTipoEnum tipo) {
        List<Credito> resultado = new ArrayList();
        for (Credito resul : creditosList) {
            if (resul.getCliente().getTipo() == tipo) {
                resultado.add(resul);
            }
        }
        return resultado;
    }

    @Override
    public List<Credito> creditosPorCreditoTipoySucursal(ClienteTipoEnum tipo, Sucursal sucursal) {
        List<Credito> resultado = new ArrayList();

        for (Credito resul : creditosList) {
            if (resul.getCliente().getTipo().equals(tipo) && resul.getSucursal().equals(sucursal)) {
                resultado.add(resul);
            }

        }
        return resultado;
    }

    @Override
    public List<Credito> creditosInferioresA(double monto) {

        BigDecimal bigdecimal = BigDecimal.valueOf(monto);
        int sum;
        List<Credito> resultado = new ArrayList();

        for (Credito resul : creditosList) {
            sum = resul.getMontoAcordado().compareTo(bigdecimal);
            if (sum == -1) {
                resultado.add(resul);
            }
        }
        return resultado;
    }

    @Override
    public List<Credito> creditosSuperioresA(double monto) {
        BigDecimal bigdecimal = BigDecimal.valueOf(monto);
        int sum;
        List<Credito> resultado = new ArrayList();

        for (Credito resul : creditosList) {
            sum = resul.getMontoAcordado().compareTo(bigdecimal);
            if (sum == 1) {
                resultado.add(resul);
            }
        }
        return resultado;
    }

    @Override
    public void ordenar() {
        Collections.sort(this.creditosList);
    }

    @Override
    public void ordenar(Comparator comparator) {
        Collections.sort(this.creditosList, comparator);
    }

    @Override
    public String toString() {
        String resultado = "";

        for (Credito c : creditosList) {

            resultado += c.toString() + "\n";
        }

        return resultado;
    }
}
