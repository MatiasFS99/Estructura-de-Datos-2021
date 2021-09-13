package ejercicios.Punto5.packejercicio5;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class Movimiento implements Comparable<Movimiento> {
    private int numeroDeMovimiento;
    private Date fecha;
    private String tipo;
    private Persona destinatario;
    private List<MovimientoDetalle> detalle;
    

    public Movimiento(int numeroDeMovimiento, Date fecha, String tipo, Persona destinatario, List<MovimientoDetalle> detalle) {
        this.numeroDeMovimiento = numeroDeMovimiento;
        this.fecha = fecha;
        this.tipo = tipo;
        this.destinatario = destinatario;
        this.detalle = detalle;
    }
    

    public int getNumeroDeMovimiento() {
        return this.numeroDeMovimiento;
    }

    public void setNumeroDeMovimiento(int numeroDeMovimiento) {
        this.numeroDeMovimiento = numeroDeMovimiento;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Persona getDestinatario() {
        return this.destinatario;
    }

    public void setDestinatario(Persona destinatario) {
        this.destinatario = destinatario;
    }

    public List<MovimientoDetalle> getDetalle() {
        return this.detalle;
    }

    public void setDetalle(List<MovimientoDetalle> detalle) {
        this.detalle = detalle;
    }

    public int compareTo(Movimiento o){
        return Integer.compare(this.numeroDeMovimiento,o.getNumeroDeMovimiento());
    }

    @Override
    public String toString() {
        int contador = 1;
        String salida = "numeroDeMovimiento: " + getNumeroDeMovimiento() +
        " - fecha: " + getFecha() +
        " - tipo: " + getTipo() +
        " - destinatario: " + getDestinatario() + " - detalles {"+ contador +": (";
        for (MovimientoDetalle mov : detalle) {
            contador++;
            if(!(contador>detalle.size())){
                salida += mov.toString() + " ) - "+contador+": ( ";
            } else {
                salida += mov.toString() + " )";
            }
        }
        return  salida;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movimiento)) {
            return false;
        }
        Movimiento movimiento = (Movimiento) o;
        return numeroDeMovimiento == movimiento.numeroDeMovimiento && Objects.equals(fecha, movimiento.fecha) && Objects.equals(tipo, movimiento.tipo) && Objects.equals(destinatario, movimiento.destinatario) && Objects.equals(detalle, movimiento.detalle);
    }
}
