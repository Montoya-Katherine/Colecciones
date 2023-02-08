public class Main {
    public static void main(String []args){
        ServicePelicula listaPelicula = new ServicePelicula();
        listaPelicula.crearPelicula();
        listaPelicula.mostrarLista();
        listaPelicula.duracionMenor();
        listaPelicula.duracionMayor();
    }
}
