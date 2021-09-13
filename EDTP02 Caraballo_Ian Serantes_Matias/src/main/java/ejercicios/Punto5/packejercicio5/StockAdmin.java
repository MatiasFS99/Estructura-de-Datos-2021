package ejercicios.Punto5.packejercicio5;

import java.util.ArrayList;
import java.util.List;

public class StockAdmin extends StockAdminAbstract{

    public List<Movimiento> salidas(){
        List<Movimiento> resultado = new ArrayList<Movimiento>();
        for (Movimiento movimiento : movimientosList) {
            if(movimiento.getTipo().equals("Salida")){
                resultado.add(movimiento);
            }
        }
        return resultado;
    }

    public List<Movimiento> entradas(){
        List<Movimiento> resultado = new ArrayList<Movimiento>();
        for (Movimiento movimiento : movimientosList) {
            if(movimiento.getTipo().equals("Entrada")){
                resultado.add(movimiento);
            }
        }
        return resultado;
    }

    public List<Movimiento> movimientosPorProducto(Producto producto){
        List<Movimiento> resultado = new ArrayList<Movimiento>();
        for (Movimiento movimiento : movimientosList) {
            for (MovimientoDetalle mov : movimiento.getDetalle()) {
                if(mov.getProducto() == producto){
                    resultado.add(movimiento);
                    break;
                }
            }
        }
        return resultado;
    }

    public List<Producto> productosPorPersona(Persona persona){
        List<Producto> resultado = new ArrayList<Producto>();
        for (Movimiento movimiento : movimientosList){
            if(movimiento.getDestinatario() == persona){
                for (MovimientoDetalle movs : movimiento.getDetalle()) {
                    if(!resultado.contains(movs.getProducto())){
                        resultado.add(movs.getProducto());
                    }
                }
            }
        }
        return resultado;
    }

    public List<ProductoCantidad> stock(){
        List<ProductoCantidad> respuesta = new ArrayList<ProductoCantidad>();
        for (Movimiento movs : movimientosList) {
            for (MovimientoDetalle det : movs.getDetalle()) {
                if(posicion(respuesta, det.getProducto())==-1){
                    respuesta.add(new ProductoCantidad(det.getProducto()));
                    respuesta.get(posicion(respuesta, det.getProducto())).agregar(det.getCantidad());
                } else {
                    respuesta.get(posicion(respuesta, det.getProducto())).agregar(det.getCantidad());
                }
            }
        }
        return respuesta;
    }

    public List<ProductoTipoCantidad> stockPorTipo(){
        List<ProductoTipoCantidad> respuesta = new ArrayList<ProductoTipoCantidad>();
        for (Movimiento movs : movimientosList) {
            for (MovimientoDetalle det : movs.getDetalle()) {
                if(posicion(respuesta, det.getProducto().getTipo())==-1){
                    respuesta.add(new ProductoTipoCantidad(det.getProducto().getTipo()));
                    respuesta.get(posicion(respuesta, det.getProducto().getTipo())).agregar(det.getCantidad());
                } else {
                    respuesta.get(posicion(respuesta, det.getProducto().getTipo())).agregar(det.getCantidad());
                }
            }
        }
        return respuesta;
    }

    private int posicion(List<ProductoCantidad> entrada, Producto prod){
        int salida = -1;
        int cont = 0;
        if(entrada.size()!=0){
            for (ProductoCantidad Cant : entrada) {
                if(Cant.getProd().equals(prod)){
                    salida = cont;
                    break;
                }
                cont++;
            }
        }
        return salida;
    }

    private int posicion(List<ProductoTipoCantidad> entrada, ProductoTipo tipo){
        int salida = -1;
        int cont = 0;
        if(entrada.size()!=0){
            for (ProductoTipoCantidad Cant : entrada) {
                if(Cant.getTipo().equals(tipo)){
                    salida = cont;
                    break;
                }
                cont++;
            }
        }
        return salida;
    }
    
}
