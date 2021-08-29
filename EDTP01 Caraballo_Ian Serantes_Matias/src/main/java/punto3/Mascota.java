/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package punto3;

import java.util.Objects;

/**
 *
 * @author Thane
 */
public class Mascota {
    private int numeroDeRegistro;
    private String Nombre;
    private Raza Raza;
    private int AnioDeNacimiento;
    private Persona duenio;

    public int getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(int numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setnNombre(String nNombre) {
        this.Nombre = nNombre;
    }

    public Raza getRaza() {
        return Raza;
    }

    public void setRaza(Raza Raza) {
        this.Raza = Raza;
    }

    public int getAnioDeNacimiento() {
        return AnioDeNacimiento;
    }

    public void setAnioDeNacimiento(int AnioDeNacimiento) {
        this.AnioDeNacimiento = AnioDeNacimiento;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    public Mascota() {
    }

    public Mascota(int numeroDeRegistro, String Nombre, Raza Raza, int AnioDeNacimiento, Persona duenio) {
        this.numeroDeRegistro = numeroDeRegistro;
        this.Nombre = Nombre;
        this.Raza = Raza;
        this.AnioDeNacimiento = AnioDeNacimiento;
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "numeroDeRegistro=" + numeroDeRegistro + ", Nombre=" + Nombre + ", " + Raza + ", AnioDeNacimiento=" + AnioDeNacimiento + ", " + duenio + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
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
        final Mascota other = (Mascota) obj;
        if (this.numeroDeRegistro != other.numeroDeRegistro) {
            return false;
        }
        if (this.AnioDeNacimiento != other.AnioDeNacimiento) {
            return false;
        }
        if (!Objects.equals(this.Nombre, other.Nombre)) {
            return false;
        }
        if (!Objects.equals(this.Raza, other.Raza)) {
            return false;
        }
        if (!Objects.equals(this.duenio, other.duenio)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
    
}
