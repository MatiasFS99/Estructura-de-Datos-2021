package ejercicios.Punto5.packejercicio5;

import java.util.Objects;

public class ProductoTipo {
    private String descripcion;

    public ProductoTipo(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Tipo: " + getDescripcion();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoTipo)) {
            return false;
        }
        ProductoTipo productoTipo = (ProductoTipo) o;
        return Objects.equals(descripcion, productoTipo.descripcion);
    }
}
