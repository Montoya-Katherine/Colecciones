import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<String> listaNombres = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de nombres que se usara en la lista");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el nombre en " + i + " la posicion ");
            listaNombres.add(scanner.nextLine());



        }

        for (String nombres: listaNombres) {
            System.out.println("Los nombres son: " + nombres);
        }

    }
}
