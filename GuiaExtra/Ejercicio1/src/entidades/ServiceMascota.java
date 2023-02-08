package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota {
    private ArrayList<Mascota> listaMascota;

    public ServiceMascota() {
        this.listaMascota = new ArrayList<>();
    }

    public Mascota aniadirMascota(String nombre, int edad){
        Mascota mascota = new Mascota(nombre, edad);
        return mascota;
    }
    public ArrayList<Mascota> crearMascota(){

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opcion= "";

        System.out.println("Ingrese datos de la mascota");

        do {
            System.out.println("Ingrese el Nombre");
            String nombre = scanner.next();
            System.out.println("Ingrese la edad");
            int edad = scanner.nextInt();

            listaMascota.add(aniadirMascota(nombre, edad));

            System.out.println("Si desea agragar otra mascota presione 'x' , si no pulse cualquier tecla");
            opcion = scanner.next();
        }while (opcion.equalsIgnoreCase("x"));
        return listaMascota;
    }

    public void mostarLista(){
        System.out.println("Lista de mascotas");
        for (Mascota mascotas: listaMascota) {
            System.out.println(mascotas);
        }
    }

    public void mascotasViejitas(){
        System.out.println("Mascotas mas viejitas , de 6 a más años: ");
        for (int i = 0; i < listaMascota.size(); i++) {
            if (listaMascota.get(i).getEdad() >= 6){
                System.out.println(listaMascota.get(i).getNombre());
            }
        }
    }
    public void mascotasMenores(){
        System.out.println("Mascotas menores de 6 años: ");
        for (int i = 0; i < listaMascota.size(); i++) {
            if (listaMascota.get(i).getEdad() < 6){
                System.out.println(listaMascota.get(i).getNombre());
            }
        }
    }
}

