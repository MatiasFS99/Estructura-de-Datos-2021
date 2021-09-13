package ejercicios.Punto5.packejercicio5;

import java.util.Objects;

public class ProductoMarca {
    private String descripcion;

    public ProductoMarca(String descripcion) {
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
        return " marca: " + getDescripcion();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof ProductoMarca)) {
            return false;
        }
        ProductoMarca productoMarca = (ProductoMarca) o;
        return Objects.equals(descripcion, productoMarca.descripcion);
    }
}
