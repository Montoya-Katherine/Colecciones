package entidades;

import java.util.Scanner;

public class Menu {
    public  void menu(){
        ServiceSerie series = new ServiceSerie();
        Scanner scanner =new Scanner(System.in).useDelimiter("\n");
        String op = "";
        boolean salir= false;

        while (!salir){
            System.out.println("---Sistema HBO---" + "\n" +
                    "* Ingrese alguna de las siguientes opciones: " + "\n" +
                    "1. Ingrese serie al sistema " + "\n" +
                    "2. Mostrar Series que se encuentran en el sistema " + "\n" +
                    "3. Series que duran menos de 15 min " + "\n" +
                    "4. Series que duran mayor de 40 min " + "\n" +
                    "5. Mostrar Series Categoria ROMANCE " + "\n" +
                    "6. Mostrar Series Categoria COMEDIA " + "\n" +
                    "7. Mostrar Series Categoria DRAMA " + "\n" +
                    "8. SALIR DEL SISTEMA " + "\n" +
                    "Seleccio: ");

            op = scanner.next();

            switch (op){
                case "1":
                    series.crearSerie();
                    break;

                case "2":
                    series.mostrar();
                    break;

                case "3":
                    series.menor();
                    break;

                case "4":
                    series.mayor();
                    break;

                case "5":
                    series.catRoman();
                    break;

                case "6":
                    series.catComedia();
                    break;

                case "7":
                    series.catDrama();
                    break;

                case "8":
                    System.out.println("***Finalizo el proceso***");
                    salir = true;
                    break;

                default:
                    System.out.println("ALERTA - INGRESE UNA OPCION CORRECTA");
            }

        }
    }
}
