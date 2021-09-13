package ejercicios.Punto2;

public class Empleado {

    private int Legajo;
    private String Documento;
    private String Apellido;
    private String Nombre;
    private Oficina Oficina;

    public int getLegajo() {
        return Legajo;
    }

    public void setLegajo(int Legajo) {
        this.Legajo = Legajo;
    }

    public String getDocumento() {
        return Documento;
    }

    public void setDocumento(String Documento) {
        this.Documento = Documento;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Oficina getOficina() {
        return Oficina;
    }

    public void setOficina(Oficina Oficina) {
        this.Oficina = Oficina;
    }

    public Empleado(int Legajo, String Documento, String Apellido, String Nombre, Oficina Oficina) {
        this.Legajo = Legajo;
        this.Documento = Documento;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Oficina = Oficina;
    }

    public Empleado() {
    }

    @Override
    public String toString() {
        return "Empleado{" + "Legajo=" + Legajo + ", Documento=" + Documento
                + ", Apellido=" + Apellido + ", Nombre=" + Nombre + ", Oficina=" + Oficina + '}' + "\n";
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
        final Empleado other = (Empleado) obj;
        if (this.Legajo != other.Legajo) {
            return false;
        }
        if ((this.Apellido == null) ? (other.Apellido != null) : !this.Apellido.equals(other.Apellido)) {
            return false;
        }
        if ((this.Nombre == null) ? (other.Nombre != null) : !this.Nombre.equals(other.Nombre)) {
            return false;
        }
        return true;
    }

}
