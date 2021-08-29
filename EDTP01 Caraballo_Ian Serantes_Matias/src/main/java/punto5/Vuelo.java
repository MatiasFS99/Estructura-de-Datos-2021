
package punto5;

import java.util.Objects;

public class Vuelo {
    private int NumeroDeVuelo;
    private LineaAerea LineaAerea;
    private Ciudad CiudadOrigen;
    private Ciudad CiudadDestino;
    private FechaHora FechaHoraPartida;
    private FechaHora FechaHoraArribo;

    public int getNumeroDeVuelo() {
        return NumeroDeVuelo;
    }

    public void setNumeroDeVuelo(int NumeroDeVuelo) {
        this.NumeroDeVuelo = NumeroDeVuelo;
    }

    public LineaAerea getLineaAerea() {
        return LineaAerea;
    }

    public void setLineaAerea(LineaAerea LineaAerea) {
        this.LineaAerea = LineaAerea;
    }

    public Ciudad getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(Ciudad CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public Ciudad getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(Ciudad CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public FechaHora getFechaHoraPartida() {
        return FechaHoraPartida;
    }

    public void setFechaHoraPartida(FechaHora FechaHoraPartida) {
        this.FechaHoraPartida = FechaHoraPartida;
    }

    public FechaHora getFechaHoraArribo() {
        return FechaHoraArribo;
    }

    public void setFechaHoraArribo(FechaHora FechaHoraArribo) {
        this.FechaHoraArribo = FechaHoraArribo;
    }

    public Vuelo() {
    }

    public Vuelo(int NumeroDeVuelo, LineaAerea LineaAerea, Ciudad CiudadOrigen, Ciudad CiudadDestino, FechaHora FechaHoraPartida, FechaHora FechaHoraArribo) {
        this.NumeroDeVuelo = NumeroDeVuelo;
        this.LineaAerea = LineaAerea;
        this.CiudadOrigen = CiudadOrigen;
        this.CiudadDestino = CiudadDestino;
        this.FechaHoraPartida = FechaHoraPartida;
        this.FechaHoraArribo = FechaHoraArribo;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "NumeroDeVuelo=" + NumeroDeVuelo + ", " + LineaAerea + ", CiudadOrigen=" + CiudadOrigen + ", CiudadDestino=" + CiudadDestino + ", FechaHoraPartida=" + FechaHoraPartida + ", FechaHoraArribo=" + FechaHoraArribo + '}';
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
        final Vuelo other = (Vuelo) obj;
        if (this.NumeroDeVuelo != other.NumeroDeVuelo) {
            return false;
        }
        if (!Objects.equals(this.LineaAerea, other.LineaAerea)) {
            return false;
        }
        if (!Objects.equals(this.CiudadOrigen, other.CiudadOrigen)) {
            return false;
        }
        if (!Objects.equals(this.CiudadDestino, other.CiudadDestino)) {
            return false;
        }
        if (!Objects.equals(this.FechaHoraPartida, other.FechaHoraPartida)) {
            return false;
        }
        if (!Objects.equals(this.FechaHoraArribo, other.FechaHoraArribo)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
}
