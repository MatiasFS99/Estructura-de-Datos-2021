package punto4;

import java.math.BigDecimal;

public class TipoValuacion {
    private Tipo tipo;
    private BigDecimal valuacion;

    public TipoValuacion() {
        setTipo(new Tipo("empty"));;
        setValuacion(new BigDecimal(-1));
    }

    public TipoValuacion(Tipo tipo, BigDecimal valuacion) {
        setTipo(tipo);
        setValuacion(valuacion);
    }

    public Tipo getTipo() {
        return this.tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public BigDecimal getValuacion() {
        return this.valuacion;
    }

    public void setValuacion(BigDecimal valuacion) {
        this.valuacion = valuacion;
    }

    @Override
    public String toString() {
        return "tipo: " + getTipo().getDescripcion() + " - valuacion: " + getValuacion();
    }

}
