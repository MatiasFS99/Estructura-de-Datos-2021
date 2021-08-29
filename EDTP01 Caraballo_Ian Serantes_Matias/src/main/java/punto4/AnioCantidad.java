package punto4;

public class AnioCantidad {
    private int anio;
    private int cantidad;
    public AnioCantidad(){
        setAnio(-1);
        setCantidad(0);
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "anio: " + getAnio() + " - cantidad: " + getCantidad();
    }
}
