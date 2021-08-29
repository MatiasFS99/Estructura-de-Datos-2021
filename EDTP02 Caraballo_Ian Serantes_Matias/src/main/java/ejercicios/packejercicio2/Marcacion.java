package ejercicios.packejercicio2;
import java.util.Date;
import java.util.Objects;

public class Marcacion {
    private int numero;
    private Empleado empleado;
    private Date fechahora;
    private Tipo tipo;

    public Marcacion(int numero, Empleado empleado, Date fechahora, Tipo tipo) {
        this.numero = numero;
        this.empleado = empleado;
        this.fechahora = fechahora;
        this.tipo = tipo;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Marcacion)) {
            return false;
        }
        Marcacion marcacion = (Marcacion) o;
        return numero == marcacion.numero && Objects.equals(empleado, marcacion.empleado) && Objects.equals(fechahora, marcacion.fechahora) && Objects.equals(tipo, marcacion.tipo);
    }

    @Override
    public String toString(){
        return("Id: " + this.numero + " - empleado: {" + empleado.toString() + "} - fechahora: " + this.fechahora.toString() + " - tipo: "+ this.tipo);
    }


    public int getNumero() {
        return this.numero;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public Date getFechahora() {
        return this.fechahora;
    }

    public Tipo getTipo() {
        return this.tipo;
    }
    
}
