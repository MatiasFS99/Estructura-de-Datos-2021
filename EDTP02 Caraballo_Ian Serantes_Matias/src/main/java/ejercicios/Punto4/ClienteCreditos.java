package ejercicios.Punto4;

import java.math.BigDecimal;

public class ClienteCreditos {

    public static void main(String[] args) {
        try {

            CreditosAdmin creditosList = new CreditosAdmin();

            creditosList.add(new Credito(1, new CreditoTipo("Cerveza", new BigDecimal(5000), new BigDecimal(50000), 1, 40, ClienteTipoEnum.PERSONA, new BigDecimal(5)), new Cliente("Sarah", "Kerrigan", "22113234", ClienteTipoEnum.PERSONA), new BigDecimal(49000), 1, new Sucursal("Kiosco la empanada")));

            creditosList.add(new Credito(3, new CreditoTipo("Casa", new BigDecimal(15000), new BigDecimal(150000), 1, 5, ClienteTipoEnum.PERSONA, new BigDecimal(15)), new Cliente("Mordin", "Solus", "34512345", ClienteTipoEnum.PERSONA), new BigDecimal(45000), 4, new Sucursal("Kiosco la Gringa")));

            creditosList.add(new Credito(5, new CreditoTipo("Comercial", new BigDecimal(35000), new BigDecimal(350000), 1, 10, ClienteTipoEnum.COMERCIO, new BigDecimal(35)), new Cliente("John", "Shepard", "34512345", ClienteTipoEnum.COMERCIO), new BigDecimal(42000), 2, new Sucursal("CangreBurgers")));

            creditosList.add(new Credito(4, new CreditoTipo("Banco", new BigDecimal(25000), new BigDecimal(250000), 3, 12, ClienteTipoEnum.EMPRESADECONSTRUCCION, new BigDecimal(25)), new Cliente("James", "Raynor", "34512222", ClienteTipoEnum.EMPRESADECONSTRUCCION), new BigDecimal(55000), 5, new Sucursal("Edesur")));

            creditosList.add(new Credito(2, new CreditoTipo("Pizzeria", new BigDecimal(45000), new BigDecimal(450000), 6, 5, ClienteTipoEnum.COMERCIO, new BigDecimal(45)), new Cliente("Arcturus", "Mengsk", "34562345", ClienteTipoEnum.COMERCIO), new BigDecimal(46000), 5, new Sucursal("Burger King")));

            System.out.println("El tma�o de creditosList es: " + creditosList.size());
            System.out.println("Elemento en la posicion:" + " 2 " + creditosList.get(2));
            System.out.println("Eliminar elemento en la posicion:" + " 2 ");
            creditosList.remove(2);
            System.out.println("Elemento en la posicion:" + " 2 " + creditosList.get(2));

            System.out.println("Clientes  Comercio");
            System.out.println(creditosList.creditosPorClienteTipo(ClienteTipoEnum.COMERCIO));
            System.out.println("");
            System.out.println("Cliente en Cr�dito Argentino");
            System.out.println(creditosList.creditosPorCreditoTipoySucursal(ClienteTipoEnum.PERSONA, new Sucursal("Edesur")));
            System.out.println("");
            System.out.println("Cr�ditos inferiores a 45000");
            System.out.println(creditosList.creditosInferioresA(45000));
            System.out.println("");
            System.out.println("Cr�ditos superiores a 5000");
            System.out.println(creditosList.creditosSuperioresA(5000));
            System.out.println("");
            System.out.println("Ordenados por numero");
            creditosList.ordenar();
            System.out.println(creditosList);
            System.out.println("");
            System.out.println("Ordenadon  Cliente");
            creditosList.ordenar(new ClienteComparator());
            System.out.println(creditosList);
            System.out.println("");
            System.out.println("Ordenadon total a devolver");
            creditosList.ordenar(new TotalDevolComparator());
            System.out.println(creditosList);
        } catch (Exception e) {
        }

    }

}
