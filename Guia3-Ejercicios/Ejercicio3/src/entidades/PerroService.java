package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class PerroService {
    private ArrayList<Perro> listaPerro;

    public PerroService() {
        this.listaPerro = new ArrayList<>();
    }

    public Perro crearPerro(String nombre, String raza){
        Perro perro = new Perro(nombre, raza);
        return perro;
    }

    public ArrayList<Perro> agregarPerro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Agregar Perros:");

        String respuesta = "";

        do {
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();

            System.out.println("Ingrese raza");
            String raza = scanner.next();

            listaPerro.add(crearPerro(nombre, raza));

            System.out.println("Presiones 's' para continuar agregando, de lo contrario presiones cualquier tecla");
            respuesta = scanner.next();


        }while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Lista final: ");
        for (Perro perros : listaPerro) {
            System.out.println(perros);
        }


        return listaPerro;
    }
}
