
package punto3;

public class MascotasPorPersona {
    private Persona persona = null;
    private int cantidad = -1;

    public MascotasPorPersona(Persona persona, int cantidad) {
        setPersona(persona);
        setCantidad(cantidad);
    }


    public Persona getPersona() {
        return this.persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
