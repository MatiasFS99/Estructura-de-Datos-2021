package Punto2;

import java.util.Date;

public class Oficina {
    private String Nombre;
    private Date HoraEntrada;
    private Date HoraSalida;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(Date HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }

    public Date getHoraSalida() {
        return HoraSalida;
    }

    public void setHoraSalida(Date HoraSalida) {
        this.HoraSalida = HoraSalida;
    }

    public Oficina(String Nombre, Date HoraEntrada, Date HoraSalida) {
        this.Nombre = Nombre;
        this.HoraEntrada = HoraEntrada;
        this.HoraSalida = HoraSalida;
    }

    public Oficina() {
    }

    @Override
    public String toString() {
        return "Oficina{" + "Nombre=" + Nombre + ", HoraEntrada=" + HoraEntrada + ", HoraSalida=" + HoraSalida + '}';
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
        final Oficina other = (Oficina) obj;
        if ((this.Nombre == null) ? (other.Nombre != null) : !this.Nombre.equals(other.Nombre)) {
            return false;
        }
        if (this.HoraEntrada != other.HoraEntrada && (this.HoraEntrada == null || !this.HoraEntrada.equals(other.HoraEntrada))) {
            return false;
        }
        if (this.HoraSalida != other.HoraSalida && (this.HoraSalida == null || !this.HoraSalida.equals(other.HoraSalida))) {
            return false;
        }
        return true;
    }
    
    
    

}
