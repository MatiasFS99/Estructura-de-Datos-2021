package punto4;

import java.math.BigDecimal;
import java.util.Objects;

public class Automovil {
    private String matricula;
    private Tipo tipo;
    private Marca marca;
    private int anio;
    private BigDecimal valuacion;


    public Automovil(String matricula, Tipo tipo, Marca marca, int anio, BigDecimal valuacion) {
        setMatricula(matricula);
        setTipo(tipo);
        setMarca(marca);
        setAnio(anio);
        setValuacion(valuacion);
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public BigDecimal getValuacion() {
        return this.valuacion;
    }

    public void setValuacion(BigDecimal valuacion) {
        this.valuacion = valuacion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Automovil)) {
            return false;
        }
        Automovil automovil = (Automovil) o;
        return Objects.equals(matricula, automovil.matricula) && Objects.equals(tipo, automovil.tipo) && Objects.equals(marca, automovil.marca) && anio == automovil.anio && Objects.equals(valuacion, automovil.valuacion);
    }
    

    @Override
    public String toString() {
        return(
            "matricula: " + getMatricula() +
            " - tipo: " + getTipo().getDescripcion() +
            " - marca: " + getMarca().getNombre() +
            " - anio: " + getAnio()+
            " - valuacion: " + getValuacion()
        );
    }
    
}
