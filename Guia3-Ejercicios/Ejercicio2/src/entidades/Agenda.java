package entidades;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Agenda {

    private ArrayList<Contacto> listaContacto;

    public Agenda() {
        this.listaContacto = new ArrayList<>();
    }

    public Contacto crearContacto( String nombre, int numero){
        Contacto contacto = new Contacto(nombre, numero);
        return contacto;
    }


    public ArrayList<Contacto> agregarContacto() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese CONTACTO");
        String fin = "";

        do {
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();

            System.out.println("Ingrese número");
            int numero = scanner.nextInt();

            listaContacto.add(crearContacto(nombre, numero));

            System.out.println("Para ingresar otro contacto presione 's' de lo contrario presiones cualquier tecla ");
            fin = scanner.next();

        }while (fin.equalsIgnoreCase("s"));

        return this.listaContacto;

    }

    public void verAgenda(){
        Collections.sort(listaContacto, new ComparadorContacto());
        System.out.println("Ver Agenda: ");
        for (Contacto contactos: listaContacto) {
            System.out.println(contactos);
        }


    }
}


