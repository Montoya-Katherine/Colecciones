package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class Bibloteca {
    ArrayList<Libro> listaLibros ;

    public Bibloteca() {
        this.listaLibros = new ArrayList<>();
    }

    public Libro aniadirLibro(String titulo, String autor, int pagina){
        Libro libro = new Libro(titulo, autor, pagina);
        return libro;
    }

    public ArrayList<Libro> crearLibro() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opcion = "";

        System.out.println("Ingrese los datos del Libro");

        do {
            System.out.println("Titulo");
            String titulo = scanner.next();

            System.out.println("Autor");
            String autor = scanner.next();

            System.out.println("Numeros de paginas");
            int pagina= scanner.nextInt();

            this.listaLibros.add(aniadirLibro(titulo, autor,pagina));

            System.out.println("Ingrese x para agregar libro, de lo contrario pulse cualquier tecla");
            opcion = scanner.next();
        }while (opcion.equalsIgnoreCase("x"));
        return listaLibros;
    }

    public void crearBook(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese datos del libro");
        System.out.println("Titulo");
        String titulo = scanner.next();

        System.out.println("Autor");
        String autor = scanner.next();

        System.out.println("Numeros de paginas");
        int pagina= scanner.nextInt();

        this.listaLibros.add(aniadirLibro(titulo, autor,pagina));

    }

    public void mostarLista(){
        System.out.println("Bibloteca= ");
        for (Libro libros : listaLibros) {
            System.out.println(libros);
        }
    }

    public void librosMay(){
        System.out.println("Libros con más de 300 paginas");

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getPaginas() >= 300){
                System.out.println(listaLibros.get(i).getTitulo());
            }
        }
    }

    public void librosMen(){
        System.out.println("Libros con menos de 150 paginas");

        for (int i = 0; i < listaLibros.size(); i++) {
            if (listaLibros.get(i).getPaginas() < 150){
                System.out.println(listaLibros.get(i).getTitulo());
            }
        }
    }
}
