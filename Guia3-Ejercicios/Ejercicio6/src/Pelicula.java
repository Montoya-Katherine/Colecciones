public class Pelicula {
    private String titulo;
    private String director;
    private int horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, int horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    @Override
    public String toString() {
        return "Pelicula=" +
                " Titulo: " + titulo + '\'' +
                " Director: " + director + '\'' +
                " Horas: " + horas + '\n';
    }
}
