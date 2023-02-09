package entidades;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceSerie {
    private ArrayList<Serie> listSerie;

    public ServiceSerie() {
        this.listSerie = new ArrayList<>();
    }
    public Serie aniadir(String tipo, String nombre, double duracion){
        Serie serie = new Serie(tipo, nombre, duracion);
        return serie;

    }
    public void crearSerie(){
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese datos de la Serie");
        System.out.println("Categoria");
        String tipo = scanner.next();

        System.out.println("Nombre");
        String nombre = scanner.next();

        System.out.println("Duración");
        double duracion = scanner.nextDouble();
        this.listSerie.add(aniadir(tipo,nombre, duracion));
    }

    public ArrayList<Serie> crear() {
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        String opc="";

        System.out.println("Ingrese datos de la Serie");

        do {
            System.out.println("Categoria");
            String tipo = scanner.next();

            System.out.println("Nombre");
            String nombre = scanner.next();

            System.out.println("Duración");
            double duracion = scanner.nextDouble();
            this.listSerie.add(aniadir(tipo,nombre, duracion));

            System.out.println("Para agregar otra serie pulse S, pulse cualquier tecla para salir");
            opc = scanner.next();

        }while (opc.equalsIgnoreCase("s"));
        return listSerie;
    }

    public void mostrar(){
        System.out.println("Mostrar las Series de la lista");
        for (Serie series: listSerie) {
            System.out.println(series);
        }
    }

    public void menor(){
        System.out.println("Series que duran menos de 15 min");

        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getDuracion() < 15){
                System.out.println(listSerie.get(i).getNombre());
            }
        }
    }
    public void mayor(){
        System.out.println("Series que duran mayor de 40 min");

        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getDuracion() > 40){
                System.out.println(listSerie.get(i).getNombre());
            }
        }
    }

    public void catRoman(){
        System.out.println("Categoria ROMANCE");
        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getTipo().equalsIgnoreCase("romance")){
                System.out.println(listSerie.get(i).toString());
            }
        }
    }
    public void catComedia(){
        System.out.println("Categoria COMEDIA");
        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getTipo().equalsIgnoreCase("comedia")){
                System.out.println(listSerie.get(i).toString());
            }
        }
    }

    public void catDrama(){
        System.out.println("Categoria DRAMA");
        for (int i = 0; i < listSerie.size(); i++) {
            if (listSerie.get(i).getTipo().equalsIgnoreCase("drama")){
                System.out.println(listSerie.get(i).toString());
            }
        }
    }
}
