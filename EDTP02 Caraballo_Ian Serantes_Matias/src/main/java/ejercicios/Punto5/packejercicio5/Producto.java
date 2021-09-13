package ejercicios.Punto5.packejercicio5;

import java.util.Objects;

public class Producto {
    private ProductoTipo tipo;
    private ProductoMarca marca;
    private String productoModelo;

    public Producto(ProductoTipo tipo, ProductoMarca marca, String productoModelo) {
        this.tipo = tipo;
        this.marca = marca;
        this.productoModelo = productoModelo;
    }

    public ProductoTipo getTipo() {
        return this.tipo;
    }

    public void setTipo(ProductoTipo tipo) {
        this.tipo = tipo;
    }

    public ProductoMarca getMarca() {
        return this.marca;
    }

    public void setMarca(ProductoMarca marca) {
        this.marca = marca;
    }

    public String getProductoModelo() {
        return this.productoModelo;
    }

    public void setProductoModelo(String productoModelo) {
        this.productoModelo = productoModelo;
    }

    @Override
    public String toString() {
        return getTipo() +
            " - " + getMarca() +
            " - productoModelo: " + getProductoModelo();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Producto)) {
            return false;
        }
        Producto producto = (Producto) o;
        return Objects.equals(tipo, producto.tipo) && Objects.equals(marca, producto.marca) && Objects.equals(productoModelo, producto.productoModelo);
    }
}
