package punto4;

import java.math.BigDecimal;

public class ClienteAutomoviles {
    public static void imprimirAutomovil(Automovil[] param){
        for(Automovil auto: param){
            System.out.println("");
            System.out.println(auto);
        }
    }

    public static Automovil[] filtrarPorAnio(Automovil[] param, int anio){
        int conteo = 0;
        for(Automovil auto: param){
            if(auto.getAnio() == anio){
                conteo += 1;
            }
        }
        if(conteo == 0){
            return null;
        }
        Automovil[] salida = new Automovil[conteo];
        int aux = 0;
        for(Automovil auto: param){
            if(auto.getAnio() == anio){
                salida[aux] = auto;
                aux += 1;
            }
        }
        return salida;
    }

    public static Automovil[] filtrarPorTipo(Automovil[] param, Tipo tipo){
        int conteo = 0;
        for(Automovil auto: param){
            if(auto.getTipo().equals(tipo)){
                conteo += 1;
            }
        }
        Automovil[] salida = new Automovil[conteo];
        int aux = 0;
        for(Automovil auto: param){
            if(auto.getTipo().equals(tipo)){
                salida[aux] = auto;
                aux += 1;
            }
        }
        return salida;
    }

    public static Automovil[] cocatenarAutomoviles(Automovil[] param,Automovil[] param2){
        Automovil[] salida = new Automovil[(param.length+ param2.length)];
        for(int i = 0; i<param.length; i++){
            salida[i] = param[i];
        }
        for(int i = 0; i<param2.length; i++){
            salida[i+param.length] = param2[i];
        }
        return salida;
    }

    public static AnioCantidad[] cantidadPorAnio(Automovil[] param){
        Automovil[] arrayAux1 = filtrarPorAnio(param, param[0].getAnio());
        Automovil[] arrayAux2;
        int conteo = 1;
        boolean esta = false;
        for(Automovil auto: param){
            for(Automovil autoi: arrayAux1){
                if(auto.equals(autoi)){
                    esta = true;
                }
            }
            if(!esta){
                arrayAux2 = filtrarPorAnio(param, auto.getAnio());
                arrayAux1 = cocatenarAutomoviles(arrayAux1, arrayAux2);
                conteo += 1;
            }
            esta = false;
        }
        AnioCantidad[] salida = new AnioCantidad[conteo];
        for(int i=0; i<salida.length; i++){
            salida[i] = new AnioCantidad();
        }
        for(Automovil auto: param){
            for(int k=0;k<salida.length;k++){
                if(auto.getAnio() == salida[k].getAnio()){
                    esta = true;
                    salida[k].setCantidad(salida[k].getCantidad()+1);
                }
            }
            if(!esta){
                for(int k=0;k<salida.length;k++){
                    if(salida[k].getAnio()==-1){
                        salida[k].setAnio(auto.getAnio());
                        salida[k].setCantidad(1);
                        break;
                    }
                }
            }
            esta = false;
        }
        return salida;
    }

    public static TipoValuacion[] valuacionesPorTipo(Automovil[] param){
        Automovil[] arrayAutosPorTipo = filtrarPorTipo(param, param[0].getTipo());
        Automovil[] arrayAutosPorTipo2;
        int conteo = 1;
        boolean esta = false;
        for (Automovil auto : param) {
            for(int k=0; k<arrayAutosPorTipo.length;k++){
                if(arrayAutosPorTipo[k].equals(auto)){
                    esta = true;
                }
            }
            if(!esta){
                arrayAutosPorTipo2 = filtrarPorTipo(param, auto.getTipo());
                arrayAutosPorTipo = cocatenarAutomoviles(arrayAutosPorTipo, arrayAutosPorTipo2);
                conteo += 1;
            }
            esta = false;
        }
        TipoValuacion[] salida = new TipoValuacion[conteo];
        for(int i=0;i<salida.length;i++){
            salida[i] = new TipoValuacion();
        }
        for(Automovil auto: param){
            for(int k=0; k<salida.length; k++){
                if(auto.getTipo().equals(salida[k].getTipo())){
                    esta = true;
                    salida[k].setValuacion(salida[k].getValuacion().add(auto.getValuacion()));
                }
            }
            if(!esta){
                for(int k=0; k<salida.length; k++){
                    if(salida[k].getValuacion().equals(new BigDecimal(-1))){
                        salida[k] = new TipoValuacion(auto.getTipo(), auto.getValuacion());
                        break;
                    }
                }
            }
            esta = false;
        }
        return salida;
    }

    public static void main(String[] args) {
        Tipo[] tipos = {new Tipo("segmento b"), new Tipo("segmento a"), new Tipo("segmento c")};
        Marca[] marcas = {new Marca("fiat"),new Marca("peugeot"), new Marca("renault")};
        Automovil auto1 = new Automovil("axl 422", tipos[0], marcas[0], 1993, new BigDecimal(30000));
        Automovil auto2 = new Automovil("hkz 231", tipos[1], marcas[1], 2001, new BigDecimal(120000));
        Automovil auto3 = new Automovil("mnf 256", tipos[2], marcas[2], 2015, new BigDecimal(234000));
        Automovil auto4 = new Automovil("asd 314", tipos[1], marcas[0], 2016, new BigDecimal(400000));
        Automovil auto5 = new Automovil("das 321", tipos[2], marcas[1], 2001, new BigDecimal(200000));
        Automovil auto6 = new Automovil("bvc 897", tipos[1], marcas[2], 1992, new BigDecimal(34000));
        Automovil[] autos = new Automovil[6];
        autos[0] = auto1;
        autos[1] = auto2;
        autos[2] = auto3;
        autos[3] = auto4;
        autos[4] = auto5;
        autos[5] = auto6;
        System.out.println("-----------------------------Lista de autos---------------------------------");
        imprimirAutomovil(autos);
        System.out.println("--------------------------Filtro por anio 2001------------------------------");
        imprimirAutomovil(filtrarPorAnio(autos,2001));
        System.out.println("---------------------------Filtro Por Tipo 1--------------------------------");
        imprimirAutomovil(filtrarPorTipo(autos,tipos[1]));
        System.out.println("---------------------------Cantidad Por Anio--------------------------------");
        AnioCantidad[] autoPanio = cantidadPorAnio(autos);
        for(AnioCantidad var: autoPanio){
            System.out.println(var);
        }
        System.out.println("---------------------------Valuacion por tipo-------------------------------");
        TipoValuacion[] valPtipo = valuacionesPorTipo(autos);
        for(TipoValuacion var: valPtipo){
            System.out.println(var);
        }
    }
}
