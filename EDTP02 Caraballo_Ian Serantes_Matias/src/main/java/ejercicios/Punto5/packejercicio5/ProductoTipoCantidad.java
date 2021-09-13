package ejercicios.Punto5.packejercicio5;

public class ProductoTipoCantidad {
    private ProductoTipo tipo;
    private int cant = 0;

    public ProductoTipoCantidad(ProductoTipo tipo){
        this.tipo = tipo;
    }


    public ProductoTipo getTipo() {
        return this.tipo;
    }

    public int getCant() {
        return this.cant;
    }

    public void agregar(int i){
        cant+=i;
    }


    @Override
    public String toString() {
        return getTipo() + " - Cantidad: " + getCant();
    }

}
