package ejercicios.Punto2;
public class Marcacion implements Comparable<Marcacion> {

    private int numero;
    private Empleado empleado;
    private FechaHora fechaHora;
    private MarcacionTipo tipo;

    public Marcacion(int numero, Empleado empleado, FechaHora fechaHora, MarcacionTipo tipo) {
        this.numero = numero;
        this.empleado = empleado;
        this.fechaHora = fechaHora;
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public FechaHora getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(FechaHora fechaHora) {
        this.fechaHora = fechaHora;
    }

    public MarcacionTipo getTipo() {
        return tipo;
    }

    public void setTipo(MarcacionTipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.numero;
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
        final Marcacion other = (Marcacion) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Marcacion{" + "numero=" + numero + ", empleado=" + empleado + "fechaHora=" + fechaHora + ", tipo=" + tipo + '}';
    }

    public int compareTo(Marcacion o) {
        int res = this.fechaHora.getFecha().compareTo(o.getFechaHora().getFecha());
        return res;
    }

}
