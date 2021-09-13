package ejercicios.Punto5.packejercicio5;

public class ProductoCantidad {
    private Producto prod;
    private int cant=0;

    public ProductoCantidad(Producto prod) {
        this.prod = prod;
    }


    public Producto getProd() {
        return this.prod;
    }

    public int getCant() {
        return this.cant;
    }

    public void agregar(int i){
        this.cant += i;
    }


    @Override
    public String toString() {
        return "Producto: " + getProd() + " - Cantidad: " + getCant();
    }

}
