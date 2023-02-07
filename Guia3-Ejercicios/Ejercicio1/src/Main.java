import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);

        int cantidad ;
        System.out.println("Ingrese la Cantidad de Nombres que quiere ingresar");
        cantidad = scanner.nextInt();

        List<String> listaNombres = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre " + i);
            String nombre = scanner.next();
            listaNombres.add(nombre);

        }
        System.out.println("Los nombres son: ");
        for (String nombres: listaNombres) {
            System.out.println(nombres);
        }

        System.out.println("El tamaño de la lista es: " + listaNombres.size() );


        listaNombres.remove(1);
        listaNombres.remove(3);
        System.out.println("Los nombres son: ");
        for (String nombres: listaNombres) {
            System.out.println(nombres);
        }

        System.out.println("El tamaño de la lista es: " + listaNombres.size() );


        Collections.sort(listaNombres);
        System.out.println("Los nombres Ordenados: ");
        for (String nombres: listaNombres) {
            System.out.println(nombres);
        }

    }
}
