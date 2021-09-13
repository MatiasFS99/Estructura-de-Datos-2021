package ejercicios.Punto4;

public enum ClienteTipoEnum {
    PERSONA("Persona"),
    COMERCIO("Comercio"),
    EMPRESADECONSTRUCCION("Empresa de Construcci�n");
    
    private String Descripcion;

    private ClienteTipoEnum(String Descripcion) {
        if(Descripcion == null){
            throw new IllegalArgumentException("Descripcion no puede ser null");
        }
        this.Descripcion = Descripcion;
    }

    public static ClienteTipoEnum getPERSONA() {
        return PERSONA;
    }

    public static ClienteTipoEnum getCOMERCIO() {
        return COMERCIO;
    }

    public static ClienteTipoEnum getEMPRESADECONSTRUCCION() {
        return EMPRESADECONSTRUCCION;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    @Override
    public String toString() {
        return "ClienteTipoEnum{" + "Descripcion=" + Descripcion + '}';
    }
}
