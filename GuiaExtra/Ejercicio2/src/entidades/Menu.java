package entidades;

import java.util.Scanner;

public class Menu {
    public void menu(){
        Bibloteca bibloteca = new Bibloteca();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opc = "";
        boolean salir= false;

        while (!salir){
            System.out.println("---Sistema Bibloteca---" + "\n" +
                    "* Ingrese alguna de las siguientes opciones: " + "\n" +
                            "1. Crear libro " + "\n" +
                            "2. Mostrar la bibloteca " + "\n" +
                            "3. Libros con más de 300 paginas " + "\n" +
                            "4. Libros con menos de 150 paginas " + "\n" +
                            "5. Salir del sistema " + "\n" +
                    "Seleccio: ");

            opc = scanner.next();

            switch (opc){
                case "1":
                    bibloteca.crearBook();
                    break;

                case "2":
                    bibloteca.mostarLista();
                    break;

                case "3":
                    bibloteca.librosMay();
                    break;

                case "4":
                    bibloteca.librosMen();
                    break;

                case "5":
                    System.out.println("***Finalizo el proceso***");
                    salir = true;
                    break;

                default:
                    System.out.println("ALERTA - INGRESE UNA OPCION CORRECTA");
            }

        }
    }
}
