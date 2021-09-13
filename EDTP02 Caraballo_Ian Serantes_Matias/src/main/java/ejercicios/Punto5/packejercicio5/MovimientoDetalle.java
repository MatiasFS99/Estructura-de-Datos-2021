package ejercicios.Punto5.packejercicio5;

import java.util.Objects;

public class MovimientoDetalle {
    private Producto producto;
    private int cantidad;


    public MovimientoDetalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }


    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    @Override
    public String toString() {
        return "producto: { " + getProducto() +
            " } - cantidad: " + getCantidad();
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MovimientoDetalle)) {
            return false;
        }
        MovimientoDetalle movimientoDetalle = (MovimientoDetalle) o;
        return Objects.equals(producto, movimientoDetalle.producto) && cantidad == movimientoDetalle.cantidad;
    }
}
