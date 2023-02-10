package entidades;

import java.util.Scanner;

public class Menu {
    public void menu(){
        ServiceSerie listadoSerie = new ServiceSerie();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opc ="";
        boolean salir = false;

        while (!salir){
            System.out.println("---Sistema HBO---" + "\n" +
                    "* Ingrese alguna de las siguientes opciones: " + "\n" +
                    "1. Ingrese serie al sistema " + "\n" +
                    "2. Mostrar Series que se encuentran en el sistema " + "\n" +
                    "3. Series que duran menos de 15 min " + "\n" +
                    "4. Series que duran más de 40 min " + "\n" +
                    "5. Mostrar Series: Categoria ROMANCE " + "\n" +
                    "6. Mostrar Series: Categoria COMEDIA " + "\n" +
                    "7. Mostrar Series: Categoria DRAMA " + "\n" +
                    "8. SALIR DEL SISTEMA " + "\n" +
                    "Seleccio: ");

            opc = scanner.next();

            switch (opc) {
                case "1":
                    listadoSerie.crearSerie();
                    break;

                case "2":
                    listadoSerie.mostarLista();
                    break;

                case "3":
                    listadoSerie.menoresMin();
                    break;

                case "4":
                    listadoSerie.mayoresMin();
                    break;

                case "5":
                    listadoSerie.mostrarRomance();
                    break;

                case "6":
                    listadoSerie.mostrarComedia();
                    break;

                case "7":
                    listadoSerie.mostrarDrama();
                    break;

                case "8":
                    System.out.println(" -PROCESO FINALIZADO- ");
                    salir = true;
                    break;

                default:
                    System.out.println("-----ALERTA-----"
                    + '\n' + "Ingrese una opción válida.");

            }
        }

    }
}
