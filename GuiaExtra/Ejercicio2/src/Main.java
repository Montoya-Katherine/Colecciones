import entidades.Bibloteca;

public class Main {
    public static void main (String []args){
        Bibloteca bibloteca = new Bibloteca();
        bibloteca.crearLibro();
        bibloteca.mostarLista();

        System.out.println("");
        bibloteca.librosMay();
        bibloteca.librosMen();
    }
}
