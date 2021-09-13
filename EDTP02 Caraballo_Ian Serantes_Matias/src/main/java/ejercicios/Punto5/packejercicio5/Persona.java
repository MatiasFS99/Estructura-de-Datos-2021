package ejercicios.Punto5.packejercicio5;

import java.util.Objects;

public class Persona {
    private String apellido;
    private String nombre;

    public Persona(String apellido, String nombre) {
        this.apellido = apellido;
        this.nombre = nombre;
    }


    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return " apellido: " + getApellido() +
            " - nombre: " + getNombre();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(apellido, persona.apellido) && Objects.equals(nombre, persona.nombre);
    }
}
