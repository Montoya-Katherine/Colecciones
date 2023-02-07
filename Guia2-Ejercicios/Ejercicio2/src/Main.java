import entidades.ComparatorLibro;
import entidades.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main (String [] args){
        List<Libro> listaLibros = new ArrayList<>();

        listaLibros.add(new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 250));
        listaLibros.add(new Libro("Orgullo y prejuicio", "Jane Austen", 301));
        listaLibros.add(new Libro("1984", "George Orwell", 187));
        listaLibros.add(new Libro("Cumbres borrosas", "Emily Bronte", 274));
        listaLibros.add(new Libro("La Odisea", "Homero", 1488));

        System.out.println("La lista de libros son: ");

        for (Libro libros : listaLibros) {
            System.out.println(libros);
        }

        Collections.sort(listaLibros, new ComparatorLibro());

        System.out.println("Ordenados por Título");
        for (Libro libros : listaLibros) {
            System.out.println(libros);
        }

        /*for (int i = 0; i < 1; i++) {
            System.out.println(i + " " + listaLibros);
        }*/
    }
}
