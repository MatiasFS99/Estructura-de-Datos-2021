package Punto2;

import java.util.Date;

public class Marcacion {
    private int Numero;
    private Empleado Empleado;
    private Date FechaHora;
    private MarcacionTipo Tipo;

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public Empleado getEmpleado() {
        return Empleado;
    }

    public void setEmpleado(Empleado Empleado) {
        this.Empleado = Empleado;
    }

    public Date getFechaHora() {
        return FechaHora;
    }

    public void setFechaHora(Date FechaHora) {
        this.FechaHora = FechaHora;
    }

    public MarcacionTipo getTipo() {
        return Tipo;
    }

    public void setTipo(MarcacionTipo Tipo) {
        this.Tipo = Tipo;
    }

    public Marcacion(int Numero, Empleado Empleado, Date FechaHora, MarcacionTipo Tipo) {
        this.Numero = Numero;
        this.Empleado = Empleado;
        this.FechaHora = FechaHora;
        this.Tipo = Tipo;
    }

    public Marcacion() {
    }

    @Override
    public String toString() {
        return "Marcacion{" + "Numero=" + Numero + ", Empleado=" + Empleado + ", FechaHora=" + FechaHora + ", Tipo=" + Tipo + '}';
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
        final Marcacion other = (Marcacion) obj;
        if (this.Numero != other.Numero) {
            return false;
        }
        if (this.Empleado != other.Empleado && (this.Empleado == null || !this.Empleado.equals(other.Empleado))) {
            return false;
        }
        if (this.FechaHora != other.FechaHora && (this.FechaHora == null || !this.FechaHora.equals(other.FechaHora))) {
            return false;
        }
        if (this.Tipo != other.Tipo && (this.Tipo == null || !this.Tipo.equals(other.Tipo))) {
            return false;
        }
        return true;
    }
    
    
    

}
