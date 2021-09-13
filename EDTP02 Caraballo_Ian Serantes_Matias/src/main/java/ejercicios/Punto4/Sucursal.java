package ejercicios.Punto4;

public class Sucursal {

    private String sucursal;

    public Sucursal(String sucursal) {
        if (sucursal == null) {
            throw new IllegalArgumentException("Sucursal no puede ser null");
        }
        
        this.sucursal = sucursal;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
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
        final Sucursal other = (Sucursal) obj;
        if ((this.sucursal == null) ? (other.sucursal != null) : !this.sucursal.equals(other.sucursal)) {
            return false;
        }
        return true;
    }

}
