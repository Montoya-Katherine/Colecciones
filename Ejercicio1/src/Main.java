import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Integer> ListaNumeros = new ArrayList<Integer>();

        ListaNumeros.add(1);
        ListaNumeros.add(2);
        ListaNumeros.add(3);
        ListaNumeros.add(4);
        ListaNumeros.add(5);
        ListaNumeros.add(6);
        ListaNumeros.add(7);

        System.out.println("Los numeros son: ");
        for (Integer lista: ListaNumeros) {
            System.out.println(lista);
        }

        ListaNumeros.clear();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a ingresar a la lista");
        int cantidad = scanner.nextInt();

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese numero en posición " + i );
            ListaNumeros.add(scanner.nextInt());

        }

        System.out.println("Los numeros son: ");
        for (Integer lista: ListaNumeros) {
            System.out.println( lista );
        }

    }
}
