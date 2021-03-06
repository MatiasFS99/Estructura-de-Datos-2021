package ejercicios.Punto4;

import java.math.BigDecimal;

public class CreditoTipo {

    private String descripcion;
    private BigDecimal montoMinimo;
    private BigDecimal montoMaximo;
    private int aniosMinimo;
    private int aniosMaximo;
    private ClienteTipoEnum clienteTipo;
    private BigDecimal tasaDeInteres;

    public CreditoTipo(String descripcion, BigDecimal montoMinimo, BigDecimal montoMaximo, int aniosMinimo, int aniosMaximo, ClienteTipoEnum clienteTipo, BigDecimal tasaDeInteres) {
        if (descripcion == null) {
            throw new IllegalArgumentException("Descripcion no puede ser 0");
        }

        if (montoMinimo.equals(0)) {
            throw new IllegalArgumentException("montoMinimo no puede ser 0");
        }

        if (montoMaximo.equals(0)) {
            throw new IllegalArgumentException("montoMaximo no puede ser 0");
        }

        if (aniosMinimo == 0) {
            throw new IllegalArgumentException("aniosMinimo no puede ser 0");
        }
        if (aniosMaximo == 0) {
            throw new IllegalArgumentException("aniosMaximo no puede ser 0");
        }

        if (tasaDeInteres.equals(0)) {
            throw new IllegalArgumentException("tasaDeInteres no puede ser 0");
        }

        this.descripcion = descripcion;
        this.montoMinimo = montoMinimo;
        this.montoMaximo = montoMaximo;
        this.aniosMinimo = aniosMinimo;
        this.aniosMaximo = aniosMaximo;
        this.clienteTipo = clienteTipo;
        this.tasaDeInteres = tasaDeInteres;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getMontoMinimo() {
        return montoMinimo;
    }

    public void setMontoMinimo(BigDecimal montoMinimo) {
        this.montoMinimo = montoMinimo;
    }

    public BigDecimal getMontoMaximo() {
        return montoMaximo;
    }

    public void setMontoMaximo(BigDecimal montoMaximo) {
        this.montoMaximo = montoMaximo;
    }

    public int getAniosMinimo() {
        return aniosMinimo;
    }

    public void setAniosMinimo(int aniosMinimo) {
        this.aniosMinimo = aniosMinimo;
    }

    public int getAniosMaximo() {
        return aniosMaximo;
    }

    public void setAniosMaximo(int aniosMaximo) {
        this.aniosMaximo = aniosMaximo;
    }

    public ClienteTipoEnum getClienteTipo() {
        return clienteTipo;
    }

    public void setClienteTipo(ClienteTipoEnum clienteTipo) {
        this.clienteTipo = clienteTipo;
    }

    public BigDecimal getTasaDeInteres() {
        return tasaDeInteres;
    }

    public void setTasaDeInteres(BigDecimal tasaDeInteres) {
        this.tasaDeInteres = tasaDeInteres;
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
        final CreditoTipo other = (CreditoTipo) obj;
        if ((this.descripcion == null) ? (other.descripcion != null) : !this.descripcion.equals(other.descripcion)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "CreditoTipo{" + "descripcion=" + descripcion + ", montoMinimo=" + montoMinimo + ", montoMaximo=" + montoMaximo + ", aniosMinimo=" + aniosMinimo + ", aniosMaximo=" + aniosMaximo + ", clienteTipo=" + clienteTipo + ", tasaDeInteres=" + tasaDeInteres + '}';
    }
}
