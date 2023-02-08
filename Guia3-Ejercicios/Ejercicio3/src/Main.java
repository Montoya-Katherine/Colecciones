import entidades.PerroService;

public class Main {
    public static void main (String [] args){
        PerroService perros = new PerroService();
        perros.agregarPerro();
        perros.buscarPerro();

    }
}
