package entidades;

import java.util.*;

public class PerroService {
    private ArrayList<Perro> listaPerro;

    public PerroService() {
        this.listaPerro = new ArrayList<>();
    }

    public Perro crearPerro(String nombre, String raza) {
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


        } while (respuesta.equalsIgnoreCase("s"));
        System.out.println("Lista final: ");
        for (Perro perros : listaPerro) {
            System.out.println(perros);
        }


        return listaPerro;
    }

    public void buscarPerro() {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Perro> interator = listaPerro.listIterator();
        System.out.println("Cuál es nombre del perro que quiere eliminar? ");
        String buscador = scanner.next();
        boolean encontro = false;


       while (interator.hasNext()) {
           Perro perro = interator.next();
           if (perro.getNombre().equalsIgnoreCase(buscador)) {
               interator.remove();
               encontro = true;
           }
       }

       if (!encontro){
           System.out.println("El perro buscado no fue encontrado");
       }else {
           System.out.println("Fue eliminado " + buscador);
       }

        System.out.println("Los perros son");

       Collections.sort(listaPerro, new ComparatorPerro());

        for (Perro perros : listaPerro) {
            System.out.println(perros);
        }

    }
}