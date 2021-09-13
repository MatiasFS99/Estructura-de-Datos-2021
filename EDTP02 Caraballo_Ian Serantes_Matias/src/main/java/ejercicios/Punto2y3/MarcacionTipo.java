package ejercicios.Punto2y3;

public enum MarcacionTipo {

    ENTRADA("entrada"),
    SALIDA("salida");
     
    private String nombre;

    private MarcacionTipo(String nombre) {
        this.nombre = nombre;
    }

    ;

    public static MarcacionTipo getENTRADA() {
        return ENTRADA;
    }

    public static MarcacionTipo getSALIDA() {
        return SALIDA;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "MarcacionTipo{" + "nombre=" + nombre + '}';
    }

}
