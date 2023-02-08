import entidades.ServiceMascota;

public class Main {
    public static void main(String [] args){
        ServiceMascota listaMascota = new ServiceMascota();

        listaMascota.crearMascota();
        listaMascota.mostarLista();
        listaMascota.mascotasMenores();
        listaMascota.mascotasViejitas();
    }
}
