import entidades.ServiceSerie;

public class Main {
    public static void  main (String []args){
        ServiceSerie listaSerie = new ServiceSerie();
        listaSerie.crear();
        listaSerie.mostrar();
        System.out.println("");

        listaSerie.menor();
        listaSerie.mayor();

        System.out.println("");
        listaSerie.catComedia();
        listaSerie.catRoman();
        listaSerie.catDrama();
    }
}
