package ejercicios.Punto5;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ejercicios.Punto5.packejercicio5.Movimiento;
import ejercicios.Punto5.packejercicio5.MovimientoDetalle;
import ejercicios.Punto5.packejercicio5.MovimientoTipo;
import ejercicios.Punto5.packejercicio5.Persona;
import ejercicios.Punto5.packejercicio5.Producto;
import ejercicios.Punto5.packejercicio5.ProductoCantidad;
import ejercicios.Punto5.packejercicio5.ProductoMarca;
import ejercicios.Punto5.packejercicio5.ProductoTipo;
import ejercicios.Punto5.packejercicio5.ProductoTipoCantidad;
import ejercicios.Punto5.packejercicio5.StockAdmin;

public class ClienteSeaborgium {
    public static void main(String[] args) {
        ProductoMarca marca1 = new ProductoMarca("Samsung");
        ProductoMarca marca2 = new ProductoMarca("LG");
        ProductoMarca marca3 = new ProductoMarca("ATMA");
        ProductoTipo tipo1 = new ProductoTipo("Monitor");
        ProductoTipo tipo2 = new ProductoTipo("Microondas");
        Producto prod1 = new Producto(tipo1, marca1, "225bw");
        Producto prod2 = new Producto(tipo1, marca2, "TF24T350FH");
        Producto prod3 = new Producto(tipo2, marca3, "Sh360");
        Producto prod4 = new Producto(tipo2, marca2, "ah21c");
        Producto prod5 = new Producto(tipo2, marca2, "LG5234");
        List<MovimientoDetalle> detMovs1 = new ArrayList<MovimientoDetalle>();
        detMovs1.add(new MovimientoDetalle(prod1, 5));
        detMovs1.add(new MovimientoDetalle(prod2, 2));
        List<MovimientoDetalle> detMovs2 = new ArrayList<MovimientoDetalle>();
        detMovs2.add(new MovimientoDetalle(prod3, 5));
        detMovs2.add(new MovimientoDetalle(prod5, 2));
        List<MovimientoDetalle> detMovs3 = new ArrayList<MovimientoDetalle>();
        detMovs3.add(new MovimientoDetalle(prod4, 5));
        detMovs3.add(new MovimientoDetalle(prod1, 2));
        List<MovimientoDetalle> detMovs4 = new ArrayList<MovimientoDetalle>();
        detMovs4.add(new MovimientoDetalle(prod2, 2));
        detMovs4.add(new MovimientoDetalle(prod5, 5));
        List<MovimientoDetalle> detMovs5 = new ArrayList<MovimientoDetalle>();
        detMovs5.add(new MovimientoDetalle(prod2, 5));
        detMovs5.add(new MovimientoDetalle(prod4, 2));
        Persona horacio = new Persona("Alvarez","Horacio");
        Persona marta = new Persona("Rodriguez","Marta");
        
        Movimiento mov1 = new Movimiento(3,new Date(2006, 2, 14),MovimientoTipo.Entrada.toString(),horacio,detMovs3);
        Movimiento mov2 = new Movimiento(2,new Date(2005, 4, 2),MovimientoTipo.Salida.toString(),marta,detMovs2);
        Movimiento mov3 = new Movimiento(1,new Date(2004, 5, 21),MovimientoTipo.Entrada.toString(),horacio,detMovs1);
        Movimiento mov4 = new Movimiento(5,new Date(2004, 5, 21),MovimientoTipo.Salida.toString(),marta,detMovs5);
        Movimiento mov5 = new Movimiento(4,new Date(2005, 8, 30),MovimientoTipo.Entrada.toString(),horacio,detMovs4);

        StockAdmin sAdmin = new StockAdmin();
        sAdmin.agregar(mov1);
        sAdmin.agregar(mov2);
        sAdmin.agregar(mov3);
        sAdmin.agregar(mov4);
        sAdmin.agregar(mov5);

        System.out.println("-----------------ListaDesordenada-----------------");
        System.out.println(sAdmin);
        sAdmin.ordenar();
        System.out.println("------------------ListaOrdenada-------------------");
        System.out.println(sAdmin);
        System.out.println("---------------------Salidas----------------------");
        for (Movimiento movs: sAdmin.salidas()) {
            System.out.println(movs);
        }
        System.out.println("---------------------Entradas---------------------");
        for (Movimiento movs: sAdmin.entradas()) {
            System.out.println(movs);
        }
        System.out.println("--------------MovimientosPorProducto--------------");
        for (Movimiento movs: sAdmin.movimientosPorProducto(prod1)) {
            System.out.println(movs);
        }
        System.out.println("--------------MovimientosPorProducto--------------");
        for (Movimiento movs: sAdmin.movimientosPorProducto(prod1)) {
            System.out.println(movs);
        }
        System.out.println("---------------ProductosPorPersona----------------");
        for (Producto movs: sAdmin.productosPorPersona(horacio)) {
            System.out.println(movs);
        }
        System.out.println("----------------------Stock-----------------------");
        for (ProductoCantidad movs: sAdmin.stock()) {
            System.out.println(movs);
        }
        System.out.println("-------------------StockPorTipo-------------------");
        for (ProductoTipoCantidad movs: sAdmin.stockPorTipo()){
            System.out.println(movs);
        }
    }
}
