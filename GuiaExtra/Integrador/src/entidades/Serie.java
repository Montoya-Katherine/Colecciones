package entidades;

public class Serie {
    private String tipo;
    private String nombre;
    private int duracion;

    public Serie() {
    }

    public Serie(String tipo, String nombre, int duracion) {
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

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "SERIE= " +
                "Tipo: " + tipo + '\'' +
                ", Nombre: " + nombre + '\'' +
                ", Duración: " + duracion + '\n' ;
    }
}
