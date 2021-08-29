
package punto5;

import java.util.Objects;

public class Ciudad {
    private String CodigoIATA;
    private String Nombre;

    public String getCodigoIATA() {
        return CodigoIATA;
    }

    public void setCodigoIATA(String CodigoIATA) {
        this.CodigoIATA = CodigoIATA;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Ciudad() {
    }

    public Ciudad(String CodigoIATA, String Nombre) {
        this.CodigoIATA = CodigoIATA;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "CodigoIATA=" + CodigoIATA + ", Nombre=" + Nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ciudad other = (Ciudad) obj;
        if (!Objects.equals(this.CodigoIATA, other.CodigoIATA)) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
