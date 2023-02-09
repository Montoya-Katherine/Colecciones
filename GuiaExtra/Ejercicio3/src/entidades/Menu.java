package entidades;

import java.util.Scanner;

public class Menu {
    public void menu(){
        ServiceVehiculo listaVehiculo = new ServiceVehiculo();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String op= "";
        boolean salir= false;

        while (!salir){
            {
                System.out.println("---Sistema Consecionaria Manuel---" + "\n" +
                        "* Ingrese alguna de las siguientes opciones: " + "\n" +
                        "1. Vehiculo a ingresar al sistema " + "\n" +
                        "2. Mostrar vehiculos disponibles" + "\n" +
                        "3. Marcas que tengan más de 10 en stock " + "\n" +
                        "4. Marcas que tengan menos de 3 en stock " + "\n" +
                        "5. Salir del sistema " + "\n" +
                        "Seleccio: ");

                op = scanner.next();

                switch (op){
                    case "1":
                        listaVehiculo.crearVehi();
                        break;

                    case "2":
                        listaVehiculo.mostarList();
                        break;

                    case "3":
                        listaVehiculo.mayorTresCant();
                        break;

                    case "4":
                        listaVehiculo.menorTresCant();
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
}
