package ejercicios.Punto4;

import java.math.BigDecimal;

public class Credito implements Comparable<Credito> {

    private int numero;
    private CreditoTipo tipo;
    private Cliente cliente;
    private BigDecimal montoAcordado;
    private int plazo;
    private Sucursal sucursal;
    private BigDecimal totalADevolver;

    public Credito(int numero, CreditoTipo tipo, Cliente cliente, BigDecimal montoAcordado, int plazo, Sucursal sucursal) {
       if(numero == 0){
            throw new IllegalArgumentException("numero no puede ser 0");
        }
        
        if(montoAcordado.equals(0)){
            throw new IllegalArgumentException("montoAcordado no puede ser 0");
        }
        
       
        this.numero = numero;
        this.tipo = tipo;
        this.cliente = cliente;
        this.montoAcordado = montoAcordado;
        this.plazo = plazo;
        this.sucursal = sucursal;
        this.totalADevolver = this.montoAcordado.multiply(this.tipo.getTasaDeInteres()).divide(new BigDecimal(100));

        if (this.montoAcordado.compareTo(this.tipo.getMontoMinimo()) == -1) {

            System.out.println("Monto acordado es menor al Monto M�nimo");
        }
        if (this.montoAcordado.compareTo(this.tipo.getMontoMaximo()) == 1) {
            System.out.println("Monto acordado es mayor al Monto Maximo");
        }
        if (this.plazo < this.tipo.getAniosMinimo() || this.plazo > this.tipo.getAniosMaximo()) {
            throw new ArithmeticException("Plazo en a�os fuera de rango");
        }
        if (this.cliente.getTipo() != this.tipo.getClienteTipo()) {
            throw new ArithmeticException("Los tipos de clientes son distintos");
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public CreditoTipo getTipo() {
        return tipo;
    }

    public void setTipo(CreditoTipo tipo) {
        this.tipo = tipo;

        this.totalADevolver = this.montoAcordado.multiply(this.tipo.getTasaDeInteres()).divide(new BigDecimal(100));
        if (this.cliente.getTipo() != this.tipo.getClienteTipo()) {
            System.out.println("Los tipos de clientes son diferentes");
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (this.cliente.getTipo() != this.tipo.getClienteTipo()) {
            System.out.println("Los tipos de clientes son diferentes");
        }
    }

    public BigDecimal getMontoAcordado() {
        return montoAcordado;
    }

    public void setMontoAcordado(BigDecimal montoAcordado) {
        this.montoAcordado = montoAcordado;
        this.totalADevolver = this.montoAcordado.multiply(this.tipo.getTasaDeInteres()).divide(new BigDecimal(100));
        if (this.montoAcordado.compareTo(this.tipo.getMontoMinimo()) == -1) {
            System.out.println("Monto acordado es menor al Monto M�nimo");
        }
        if (this.montoAcordado.compareTo(this.tipo.getMontoMaximo()) == 1) {
            System.out.println("Monto acordado es mayor al Monto M�ximo");
        }
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
        if (this.plazo < this.tipo.getAniosMinimo() || this.plazo > this.tipo.getAniosMaximo()) {
            System.out.println("Plazo fuera de rango");
        }
    }

    public Sucursal getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal sucursal) {
        this.sucursal = sucursal;
    }

    public BigDecimal getTotalADevolver() {
        return totalADevolver;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.numero;
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
        final Credito other = (Credito) obj;
        if (this.numero != other.numero) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Credito{" + "numero=" + numero + ", tipo=" + tipo + ", cliente=" + cliente + ", montoAcordado=" + montoAcordado + ", plazo=" + plazo + ", sucursal=" + sucursal + ", totalADevolver=" + totalADevolver + '}';
    }

    @Override
    public int compareTo(Credito o) {
        return Integer.compare(this.numero,o.getNumero());
    }

}
