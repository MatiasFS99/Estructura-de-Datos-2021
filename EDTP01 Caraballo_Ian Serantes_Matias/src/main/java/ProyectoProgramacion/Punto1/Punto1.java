package ProyectoProgramacion.Punto1;

import java.util.Scanner;

public class Punto1 {
    public static int largo(int num){
        boolean salida = false;
        int largo = 1;
        while(!salida){
            if((num/(Math.pow(10, largo)))>=1){
                largo +=1;
            } else {
                salida = true;
            }
        }
        return(largo);
    }
    public static String PasarAtexto(int num,int largo){
        if(largo<=3){
            if(largo==1){
                return(unidades(num));
            }else{
                if(largo==2){
                    return(decena(num));
                }else{
                    return(centena(num));
                }
            }
        }else{
            if(num-(num-(num%1000))==0){
                return(partir( (num-(num%1000))/1000 ));
            }else{
                return(partir((num-(num%1000))/1000)+PasarAtexto(num-(num-(num%1000)), largo(num-(num-(num%1000)))));
            }
        }
    }

    public static String partir(int num){
        if(num==1){
            return("mil ");
        }else{
            return(PasarAtexto(num, largo(num))+" mil ");
        }
    }
    public static String centena(int num){
        if(num%100==0){
            switch(num/100){
                case 1:
                        return("cien");
                case 2:
                        return("dosientos");
                case 3:
                        return("trecientos");
                case 4:
                        return("cuatrocientos");
                case 5:
                        return("quinientos");
                case 6:
                        return("seicientos");
                case 7:
                        return("setecientos");
                case 8:
                        return("ochocientos");
                case 9:
                        return("novecientos");
                default:
                        return("placeholder-fix");
            } 
        } else {
            if(num-(num%100)==100){
                return("ciento "+PasarAtexto(num-(num-(num%100)), largo(num-(num-(num%100))) ));
            }else{
                return(centena(num-(num%100))+" "+PasarAtexto(num-(num-(num%100)), largo(num-(num-(num%100))) ));
            }   
        }
    }
    public static String decena(int num){
        if(num%10==0){
            switch(num/10){
                case 1:
                        return("diez");
                case 2:
                        return("veinte");
                case 3:
                        return("treinta");
                case 4:
                        return("cuarenta");
                case 5:
                        return("cincuenta");
                case 6:
                        return("sesenta");
                case 7:
                        return("setenta");
                case 8:
                        return("ochenta");
                case 9:
                        return("noventa");
                default:
                        return("placeholder-fix");
            }
        } else {
            if(num<16){
                switch(num){
                    case 11:
                            return("once");
                    case 12:
                            return("doce");
                    case 13:
                            return("trece");
                    case 14:
                            return("catorce");
                    case 15:
                            return("quince");
                    default:
                            return("placeholder-fix");
                }
            }else{
                if(num-(num%10)!=20){
                    return(decena(num-(num%10))+" y "+unidades(num%10));
                }else{
                    return("veinti"+unidades(num%10));
                }
            }
            
        }
    }
    public static String unidades(int num){
            switch(num){
                case 1:
                        return("uno");
                case 2:
                        return("dos");
                case 3:
                        return("tres");
                case 4:
                        return("cuatro");
                case 5:
                        return("cinco");
                case 6:
                        return("seis");
                case 7:
                        return("siete");
                case 8:
                        return("ocho");
                case 9:
                        return("nueve");
                default:
                    return("placeholder-fix");
            }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el numero a convertir a texto(entre 1 y 999999)");
        int numero = sc.nextInt();
        sc.nextLine();
        while(numero>999999||numero<1){
            System.out.println("Ingrese un numero entre 1 y 999999");
            numero = sc.nextInt();
            sc.nextLine();
        }
        System.out.println(numero +" se lee: "+PasarAtexto(numero, largo(numero)));
        sc.close();
    }
    
}
