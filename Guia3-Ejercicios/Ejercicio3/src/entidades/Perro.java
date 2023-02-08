package entidades;

import java.util.Objects;

public class Perro {
    private String nombre;
    private String raza;

    public Perro() {
    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "PERRO: " +
                "nombre= " + nombre + '\n' +
                "raza= " + raza + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Objects.equals(nombre, perro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
