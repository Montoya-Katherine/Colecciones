package entidades;

public class Serie {
    private String tipo;
    private String nombre;
    private double duracion;

    public Serie() {
    }

    public Serie(String tipo, String nombre, double duracion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "tipo categoria='" + tipo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
