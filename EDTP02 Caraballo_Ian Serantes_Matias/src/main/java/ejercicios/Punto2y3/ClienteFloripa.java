package ejercicios.Punto2y3;

import java.time.LocalDate;
import java.time.LocalTime;

public class ClienteFloripa {

    public static void main(String[] args) {
        MarcacionesAdmin marcaciones = new MarcacionesAdmin();
        Empleado empleado1 = new Empleado(1, "44125094", "Rambo", "John", new Oficina("Desarollo", LocalTime.of(6, 55), LocalTime.of(20, 55)));
        Empleado empleado2 = new Empleado(3, "20342919", "Schwarzenegger", "Arnold", new Oficina("Investigacion", LocalTime.of(2, 30), LocalTime.of(4, 55)));
        Empleado empleado3 = new Empleado(4, "11234512", "Henriksen", "Lance", new Oficina("Ceo", LocalTime.of(10, 25), LocalTime.of(16, 45)));
        Empleado empleado4 = new Empleado(5, "99991112", "Meer", "Mark", new Oficina("Descanso", LocalTime.of(11, 34), LocalTime.of(17, 30)));
        Empleado empleado5 = new Empleado(6, "33331111", "Hale", "Jennifer", new Oficina("Dormir", LocalTime.of(16, 20), LocalTime.of(19, 47)));
        Empleado empleado6 = new Empleado(1, "44125094", "Rambo", "John", new Oficina("Desarollo", LocalTime.of(6, 55), LocalTime.of(20, 55)));
        
        
        
        marcaciones.add(new Marcacion(1, empleado1, new FechaHora(LocalDate.of(2021, 2, 3), LocalTime.of(2, 14)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(3, empleado3, new FechaHora(LocalDate.of(2021, 2, 4), LocalTime.of(3, 20)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(5, empleado2, new FechaHora(LocalDate.of(2021, 2, 5), LocalTime.of(4, 25)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(2, empleado4, new FechaHora(LocalDate.of(2021, 11, 4), LocalTime.of(5, 35)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(7, empleado5, new FechaHora(LocalDate.of(2021, 11, 14), LocalTime.of(16, 45)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(69, empleado1, new FechaHora(LocalDate.of(2021, 10, 12), LocalTime.of(4, 45)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(420, empleado2, new FechaHora(LocalDate.of(2021, 6, 3), LocalTime.of(3, 12)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(9, empleado3, new FechaHora(LocalDate.of(2021, 10, 2), LocalTime.of(2, 34)), MarcacionTipo.ENTRADA));
        marcaciones.add(new Marcacion(25, empleado4, new FechaHora(LocalDate.of(2021, 10, 1), LocalTime.of(17, 45)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(10, empleado5, new FechaHora(LocalDate.of(2021, 3, 22), LocalTime.of(23, 43)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(11, empleado5, new FechaHora(LocalDate.of(2021, 4, 26), LocalTime.of(22, 45)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(12, empleado4, new FechaHora(LocalDate.of(2021, 6, 26), LocalTime.of(20, 35)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(123, empleado3, new FechaHora(LocalDate.of(2021, 4, 25), LocalTime.of(14, 32)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(44, empleado2, new FechaHora(LocalDate.of(2021, 2, 14), LocalTime.of(12, 23)), MarcacionTipo.SALIDA));
        marcaciones.add(new Marcacion(69420, empleado6, new FechaHora(LocalDate.of(2021, 2, 16), LocalTime.of(23, 43)), MarcacionTipo.SALIDA));
        System.out.println("Tama�o de la lista: " + marcaciones.size());
        System.out.println("Elemento en la posicion:" + " 2 " + marcaciones.get(2));
        System.out.println("Eliminar elemento en la posicion:" + " 2 ");
        marcaciones.remove(2);
        System.out.println("Elemento en la posicion:" + " 2 " + marcaciones.get(2));
        
        
        System.out.println("");
        System.out.println("Empleados");
        System.out.println("");
        System.out.println(marcaciones.empleados());
        System.out.println("");
        System.out.println("Tarde");
        System.out.println("");
        System.out.println(marcaciones.llegaronTarde());
        System.out.println("");
        System.out.println("Empleado x");
        System.out.println("");
        System.out.println(marcaciones.filtroPorEmpleado(empleado2));

        System.out.println("");
        System.out.println("Salen");
        System.out.println("");
        System.out.println(marcaciones.filtroPorTipo(MarcacionTipo.ENTRADA));
        System.out.println("");
        System.out.println("Orden Marcacion");
        marcaciones.ordenar();
        System.out.println("");

        System.out.println(marcaciones);
        System.out.println("");

        System.out.println("Orden Legajo");
        marcaciones.ordenar(new LegajoComparator());
        System.out.println("");

        System.out.println(marcaciones);
        System.out.println("");

        System.out.println("Orden Apellido Y Nombre");
        System.out.println("");

        marcaciones.ordenar(new EmpleadoNombreComparador());
        System.out.println(marcaciones);
        System.out.println("");

    }

}
