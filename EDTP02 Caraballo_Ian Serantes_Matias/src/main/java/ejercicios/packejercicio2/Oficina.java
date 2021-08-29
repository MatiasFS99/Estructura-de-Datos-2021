package ejercicios.packejercicio2;
import java.util.Date;
import java.util.Objects;

public class Oficina {
    private String nombre;
    private Date entrada;
    private Date salida;

    public Oficina(String nombre, Date entrada, Date salida) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.salida = salida;
    }

    

    public String getNombre() {
        return this.nombre;
    }

    public Date getEntrada() {
        return this.entrada;
    }

    public Date getSalida() {
        return this.salida;
    }
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+" - entrada: "+this.entrada.toString()+" - salida: " + this.salida.toString();
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Oficina)) {
            return false;
        }
        Oficina oficina = (Oficina) o;
        return Objects.equals(nombre, oficina.nombre) && Objects.equals(entrada, oficina.entrada) && Objects.equals(salida, oficina.salida);
    }
}
