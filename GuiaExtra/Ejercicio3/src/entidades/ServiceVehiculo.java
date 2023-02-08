package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceVehiculo {
    ArrayList<Vehiculo> listaVehiculo;

    public ServiceVehiculo() {
        this.listaVehiculo = new ArrayList<>();
    }

    public Vehiculo aniadir(String marca, int stock){
        Vehiculo vehiculo = new Vehiculo(marca, stock);
        return vehiculo;
    }

    public ArrayList<Vehiculo> crearVehiculo(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opc="";

        System.out.println("Ingrese datos del Vehiculo");

        do {
            System.out.println("Marca");
            String marca = scanner.next();

            System.out.println("Stock");
            int stock = scanner.nextInt();

            this.listaVehiculo.add(aniadir(marca,stock));

            System.out.println("Para ingresar otro vehiculo 'x', para salir pulse cualquier tecla");
            opc = scanner.next();
        }while (opc.equalsIgnoreCase("x"));
        return listaVehiculo;
    }

    public void mostarList(){
        System.out.println("Mostrar los vehiculos disponinbles");

        for (Vehiculo vehiculos: listaVehiculo) {
            System.out.println(vehiculos);
        }
    }

    public void menorTresCant(){
        System.out.println("Marcas que tengan menos de 3 en stock");
        for (int i = 0; i < listaVehiculo.size(); i++) {
            if (listaVehiculo.get(i).getStock() < 3 ){
            System.out.println(listaVehiculo.get(i).getMarca());
            }
        }
    }
    public void mayorTresCant(){
        System.out.println("Marcas que tengan más de 10 en stock");
        for (int i = 0; i < listaVehiculo.size(); i++) {
            if (listaVehiculo.get(i).getStock() >= 10){
            System.out.println(listaVehiculo.get(i).getMarca());
            }
        }
    }

}
