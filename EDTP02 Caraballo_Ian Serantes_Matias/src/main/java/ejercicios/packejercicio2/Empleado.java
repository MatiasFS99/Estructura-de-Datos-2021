package ejercicios.packejercicio2;

import java.util.Objects;

public class Empleado {
    private int legajo;
    private String documento;
    private String apellido;
    private String nombre;
    private Oficina oficina;

    public Empleado(int legajo, String documento, String apellido, String nombre, Oficina oficina) {
        this.legajo = legajo;
        this.documento = documento;
        this.apellido = apellido;
        this.nombre = nombre;
        this.oficina = oficina;
    }

    public int getLegajo() {
        return this.legajo;
    }

    public String getDocumento() {
        return this.documento;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Oficina getOficina() {
        return this.oficina;
    }
    
    @Override
    public String toString(){
        return ("Legajo: " + this.legajo + " - Documento: " + this.documento + " - Apellido y nombre: " + this.apellido + " , " + this.nombre + "oficina: {"+ oficina + "}");
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Empleado)) {
            return false;
        }
        Empleado empleado = (Empleado) o;
        return legajo == empleado.legajo && Objects.equals(documento, empleado.documento) && Objects.equals(apellido, empleado.apellido) && Objects.equals(nombre, empleado.nombre) && Objects.equals(oficina, empleado.oficina);
    }
}
