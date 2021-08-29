
package punto5;

import java.util.Objects;

public class LineaAerea {
    private int Numero;
    private String Nombre;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public LineaAerea() {
    }

    public LineaAerea(int Numero, String Nombre) {
        this.Numero = Numero;
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "LineaAerea{" + "Numero=" + Numero + ", Nombre=" + Nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final LineaAerea other = (LineaAerea) obj;
        if (this.Numero != other.Numero) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        return true;
    }
    
    
    
}
