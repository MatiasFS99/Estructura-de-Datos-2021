package Punto2;

public class MarcacionTipo {
    private boolean Tipo;

    public boolean isTipo() {
        return Tipo;
    }

    public void setTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    public MarcacionTipo(boolean Tipo) {
        this.Tipo = Tipo;
    }

    public MarcacionTipo() {
    }

    @Override
    public String toString() {
        return "MarcacionTipo{" + "Tipo=" + Tipo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
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
        final MarcacionTipo other = (MarcacionTipo) obj;
        if (this.Tipo != other.Tipo) {
            return false;
        }
        return true;
    }
    
    
}
