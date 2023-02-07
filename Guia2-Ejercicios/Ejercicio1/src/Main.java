import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);


        List<String> listaNombres = new ArrayList<String>();

        System.out.println("Ingrese la cantidad de nombres a ingresas a la lista");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre: " + i);
            String nombre = scanner.next();
            listaNombres.add(nombre);
        }

        System.out.println("La lista de nombres son: ");

        for (String nombres: listaNombres) {
            System.out.println(nombres);

        }

        listaNombres.remove(1);
        System.out.println("La lista de nombres son: ");

        for (String nombres: listaNombres) {
            System.out.println(nombres);

        }

        Collections.sort(listaNombres);
        System.out.println("La lista de nombres son: ");

        for (String nombres: listaNombres) {
            System.out.println(nombres);

        }


    }
}
