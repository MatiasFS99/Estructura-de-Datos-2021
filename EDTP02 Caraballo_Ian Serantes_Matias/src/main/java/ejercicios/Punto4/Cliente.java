
package ejercicios.Punto4;

public class Cliente {

    private String apellido;
    private String nombre;
    private String documento;
    private ClienteTipoEnum tipo;

    public Cliente(String apellido, String nombre, String documento, ClienteTipoEnum tipo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.documento = documento;
        this.tipo = tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public ClienteTipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(ClienteTipoEnum tipo) {
        this.tipo = tipo;
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
        final Cliente other = (Cliente) obj;
        if ((this.documento == null) ? (other.documento != null) : !this.documento.equals(other.documento)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "apellido=" + apellido + ", nombre=" + nombre + ", documento=" + documento + ", tipo=" + tipo + '}';
    }
}
