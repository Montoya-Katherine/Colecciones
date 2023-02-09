package entidades;

import java.util.Scanner;

public class Menu {
    public void menu() {

        ServiceMascota2 listaMascota = new ServiceMascota2();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        String opc = "";

        while (!salir){
            System.out.println("---Menu de datos Mascotas---");
            System.out.println("1- Cargar nueva mascota al sistema" + '\n' +
                    "2- Mostrar lista de mascotas" + '\n' +
                    "3- Mostrar mascotas mayores de 6 años" + '\n' +
                    "4- Mostrar mascotas menores de 6 años" + '\n' +
                    "5- Salir del sistema" + '\n' +
                    "Seleccion: ");

            opc= scanner.next();

            switch (opc){
                case "1" :
                    listaMascota.crearMascota();
                    break;

                case "2" :
                    listaMascota.mostrarMascota();
                    break;

                case "3" :
                    listaMascota.mostarMayores();
                    break;

                case "4" :
                    listaMascota.mostrarMenores();
                    break;

                case "5" :
                    System.out.println("- FIN DEL PROCESO -");

                    salir = true;
                    break;

                default:
                    System.out.println("ALERTA - Ingrese una opcion valida");

            }
        }

    }
}
