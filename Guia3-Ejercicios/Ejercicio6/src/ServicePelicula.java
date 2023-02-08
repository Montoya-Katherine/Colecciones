import java.util.ArrayList;
import java.util.Scanner;

public class ServicePelicula {
    private ArrayList<Pelicula> listaPelicula;

    public ServicePelicula() {
        this.listaPelicula = new ArrayList<>();
    }

    public Pelicula aniadirPelicula(String titulo, String director, int horas ){
        Pelicula pelicula = new Pelicula(titulo, director, horas);
        return pelicula;
    }

    public ArrayList<Pelicula> crearPelicula(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese Datos de la pelicula");
        String opcion= "";

        do {
            System.out.println("Ingrese TITULO");
            String titulo = scanner.next();

            System.out.println("Ingrese AUTOR");
            String director = scanner.next();

            System.out.println("Ingrese duracion en HORAS");
            int horas = scanner.nextInt();

            this.listaPelicula.add(aniadirPelicula(titulo,director, horas));

            System.out.println(" 's' para ingresar otra pelicula, salir= presione cualquier tecla");
            opcion= scanner.next();
        }while (opcion.equalsIgnoreCase("s"));

        return this.listaPelicula;
    }


    public void mostrarLista(){
        System.out.println("Lista de Peliculas");
        for (Pelicula peliculas: listaPelicula) {
            System.out.println(peliculas);
        }
    }

    public void duracionMayor(){
        for (int i = 0; i < this.listaPelicula.size(); i++) {
            if (listaPelicula.get(i).getHoras()> 2 ){
                System.out.println("Peliculas Mayores de 2 hs es: " + listaPelicula.get(i).getTitulo());
            }
        }
    }
    public void duracionMenor(){
        for (int i = 0; i < this.listaPelicula.size(); i++) {
            if (listaPelicula.get(i).getHoras()<= 2 ){
                System.out.println("Peliculas Menores de 2 hs es: " + listaPelicula.get(i).getTitulo());
            }
        }
    }


}
