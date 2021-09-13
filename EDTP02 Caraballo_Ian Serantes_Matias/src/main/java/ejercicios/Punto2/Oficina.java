package ejercicios.Punto2;

import java.time.LocalTime;
import java.util.Objects;

public class Oficina {

    private String nombre;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Oficina(String nombre, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.nombre);
        hash = 41 * hash + Objects.hashCode(this.horaEntrada);
        hash = 41 * hash + Objects.hashCode(this.horaSalida);
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
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.horaEntrada, other.horaEntrada)) {
            return false;
        }
        if (!Objects.equals(this.horaSalida, other.horaSalida)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Oficina{" + "nombre=" + nombre + ", horaEntrada=" + horaEntrada + ", horaSalida=" + horaSalida + '}';
    }

}
