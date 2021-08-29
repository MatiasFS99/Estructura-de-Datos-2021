
package punto5;

public class ClienteAeropuerto {
    private static void imprimir(Vuelo [] vuelosArray){
        for (Vuelo vuelosArray1 : vuelosArray) {
            System.out.println("");
            System.out.println(vuelosArray1);
        }
    }
    
    private static Vuelo[] arribos(Vuelo [] vuelosArray){
      int contador = 0;
        for (Vuelo param1 : vuelosArray) {
            if (param1.getCiudadDestino().getNombre().compareToIgnoreCase("Concordia") == 0) {
                contador += 1;
            }
        }

        Vuelo[] salida = new Vuelo[contador];
        int auxiliar = 0;
        for (Vuelo param1 : vuelosArray) {
            if (param1.getCiudadDestino().getNombre().compareToIgnoreCase("Concordia") == 0) {
                salida[auxiliar] = param1;
                auxiliar += 1;
            }
        }
        return salida; 
    }
    
    private static Vuelo[] partidas(Vuelo [] vuelosArray){
        int contador = 0;
        for (Vuelo param1 : vuelosArray) {
            if (param1.getCiudadOrigen().getNombre().compareToIgnoreCase("Concordia") == 0) {
                contador += 1;
            }
        }

        Vuelo[] salida = new Vuelo[contador];
        int auxiliar = 0;
        for (Vuelo param1 : vuelosArray) {
            if (param1.getCiudadOrigen().getNombre().compareToIgnoreCase("Concordia") == 0) {
                salida[auxiliar] = param1;
                auxiliar += 1;
            }
        }
        return salida; 
    }
    
    private static Vuelo[] arrayVuelo = new Vuelo[5];
    private static Vuelo[] arribos;
    private static Vuelo[] partidas;
    public static void main(String[] args) {
        arrayVuelo[0] = new Vuelo(1, new LineaAerea(1  , "Alpha"), new Ciudad("A", "Concordia"), new Ciudad("B", "Parana"), new FechaHora(24,1,1999,20,35,10), new FechaHora(25,1,1999,12,15,50));
        arrayVuelo[1] = new Vuelo(2, new LineaAerea(2  , "Tango"), new Ciudad("B", "Parana"), new Ciudad("B", "Concordia"), new FechaHora(24,6,2000,20,35,10), new FechaHora(25,6,2000,14,42,40));
        arrayVuelo[2] = new Vuelo(3, new LineaAerea(3  , "Cobra"), new Ciudad("C", "Cordoba"), new Ciudad("B", "La plata"), new FechaHora(25,7,2001,20,40,10), new FechaHora(26,7,2001,15,49,45));
        arrayVuelo[3] = new Vuelo(4, new LineaAerea(4  , "Rambo"), new Ciudad("D", "Kabul"), new Ciudad("B", "Salsipuedes"), new FechaHora(22,2,2002,20,45,10), new FechaHora(27,2,2002,19,55,25));
        arrayVuelo[4] = new Vuelo(5, new LineaAerea(5  , "Raul"), new Ciudad("E", "Chajari"), new Ciudad("B", "MachuPichu"), new FechaHora(27,5,2003,20,50,10), new FechaHora(28,5,2003,21,25,10));
        System.out.println("----------Listado de vuelos----------");
        imprimir(arrayVuelo);
        arribos = arribos(arrayVuelo);
        System.out.println("");
        System.out.println("----------Vuelos con destino a concordia----------");
        for (Vuelo arribo : arribos) {
            System.out.println("");
            System.out.println(arribo);
        }
        
        partidas = partidas(arrayVuelo);
        System.out.println("");
        System.out.println("----------Vuelos que salen de concordia-----------");
        for (Vuelo partida : partidas) {
            System.out.println("");
            System.out.println(partida);
        }
    }
}
