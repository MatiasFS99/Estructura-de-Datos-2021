package ejercicios.Punto1;
import java.util.*;

import ejercicios.Punto1.packejercicio1.Signos;

public class Ejercicio1 {
    static ArrayList<Signos> Tipos = new ArrayList<Signos>();
    public static void crear(){
        Tipos.add(new Signos("Acuario", new Date(0, 0, 21)));
        Tipos.add(new Signos("Piscis", new Date(0, 1, 20)));
        Tipos.add(new Signos("Aries", new Date(0, 2, 21)));
        Tipos.add(new Signos("Tauro", new Date(0, 3, 21)));
        Tipos.add(new Signos("Geminis", new Date(0, 4, 22)));
        Tipos.add(new Signos("Cancer", new Date(0, 5, 22)));
        Tipos.add(new Signos("Leo", new Date(0, 6, 24)));
        Tipos.add(new Signos("Virgo", new Date(0, 7, 24)));
        Tipos.add(new Signos("Libra", new Date(0, 8, 24)));
        Tipos.add(new Signos("Escorpio", new Date(0, 9, 24)));
        Tipos.add(new Signos("Sagitario", new Date(0, 10, 23)));
        Tipos.add(new Signos("Capricornio", new Date(0, 11, 22)));
    }
    public static Signos obtenerSigno(Date fecha){
        Date auxDate = new Date(0,fecha.getMonth(),fecha.getDate());
        int ciclo = fecha.getMonth();
        Signos lectura = null;
        while(true){
            lectura = Tipos.get(ciclo);
            if(ciclo==11){
                lectura.getFecha().setYear(1);
            }
            if(auxDate.compareTo(lectura.getFecha())<0){
                if(ciclo!=0){
                    lectura = Tipos.get(ciclo-1);
                } else {
                    lectura = Tipos.get(11);
                }
                return lectura;
            }
            else{
                ciclo += 1;
                if(ciclo==12){
                    ciclo=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        crear();
        Date Fecha1 = new Date(2000, 11, 10);
        Date Fecha2 = new Date(1994, 6, 31);
        Date Fecha3 = new Date(2000, 1, 6);
        System.out.println("Fecha1: "+obtenerSigno(Fecha1));
        System.out.println("Fecha2: "+obtenerSigno(Fecha2));
        System.out.println("Fecha3: "+obtenerSigno(Fecha3));
    }
}
