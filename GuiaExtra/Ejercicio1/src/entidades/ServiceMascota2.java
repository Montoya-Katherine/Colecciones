package entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ServiceMascota2 {
    private  ArrayList<Mascota> listMascota ;

    public ServiceMascota2() {
        this.listMascota = new ArrayList<>();
    }

    public void aniadirMascota(Mascota mascota){
        this.listMascota.add(mascota);
    }

    public void crearMascota(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        Mascota mascota = new Mascota();
        System.out.println( "Ingrese datos del la Mascota");

        System.out.println("Ingrese Nombre");
        String nombre = scanner.next();
        mascota.setNombre(nombre);

        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        mascota.setEdad(edad);

        aniadirMascota(mascota);
    }

    public void mostrarMascota(){
        System.out.println("Mostar lista de Mascotas: ");

        for (Mascota mascotas : listMascota) {
            System.out.println(mascotas);
        }
    }

    public void mostarMayores(){
        System.out.println("Mascotas mayores de 6 años");

        for (Mascota mascotas : listMascota) {
            if (mascotas.getEdad()>= 6 ){
                System.out.println(mascotas.getNombre());
            }
        }
    }

    public void mostrarMenores(){
        System.out.println("Mostrar menores de 6 años  ");
        for (Mascota mascotas : listMascota) {
            if (mascotas.getEdad() < 6){
                System.out.println(mascotas.getNombre());
            }
        }
    }
}
