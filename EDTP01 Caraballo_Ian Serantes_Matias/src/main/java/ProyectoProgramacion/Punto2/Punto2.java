package ProyectoProgramacion.Punto2;
import java.util.Scanner;

public class Punto2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese la cantidad de columas de la matriz");
        int columnas = sc.nextInt();
        sc.nextLine();
        System.out.println("ingrese la cantidad de filas de la matriz");
        int filas = sc.nextInt();
        sc.nextLine();
        int entrada = -1;
        String str = "\t";
        int[][] matriz = new int[filas][columnas];
        for(int i=0;i<filas;i++){
            for(int k=0;k<columnas;k++){
                while(entrada<0||entrada>999){
                    System.out.println("Ingrese el valor de la fila: "+i+" columna: "+k+" (entre 0 y 999)");
                    entrada = sc.nextInt();
                    sc.nextLine();
                }
                matriz[i][k] = entrada;
                entrada = -1;
            }
        }
        System.out.println("-----------------matriz ordenada------------------");
        for(int i=0;i<filas;i++){
            for(int k=0;k<columnas;k++){
                str += "\t"+matriz[i][k];
            }
            System.out.println(str);
            str = "\t";
        }
        sc.close();
    }
}
