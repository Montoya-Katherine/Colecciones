package entidades;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceSerie {
    private ArrayList<Serie> listaSeries;

    public ServiceSerie() {
        this.listaSeries = new ArrayList<>();
    }

    public void crearSerie(){
        Serie serie = new Serie();
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese al sistema los datos de la serie");
        System.out.println("Tipo de categoria de la serie");
        String tipo = scanner.next();

        System.out.println("Nombre");
        String nombre = scanner.next();

        System.out.println("Duración en minutos");
        int duracion = scanner.nextInt();

        this.listaSeries.add(aniadirSerie(tipo, nombre, duracion));
    }
    public Serie aniadirSerie(String tipo, String nombre, int duracion){
        Serie serie = new Serie(tipo, nombre, duracion);
        return serie;

    }

    public void mostarLista(){
        System.out.println(" ----Mostar listado de SERIES---- ");
        for (Serie series : listaSeries) {
            System.out.println(series);
        }
    }
    public void menoresMin(){
        System.out.println("Series que duran menos de 15 min");
        for (Serie serie : listaSeries) {
            if (serie.getDuracion()< 15){
                System.out.println(serie);
            }
        }
    }

    public void mayoresMin(){
        System.out.println("Series que duran más de 40 min");
        for (Serie serie : listaSeries) {
            if (serie.getDuracion()> 40){
                System.out.println(serie);
            }
        }
    }

    public void mostrarRomance(){
        System.out.println("Categoria ROMANCE");

        for (Serie series: listaSeries) {
            if (series.getTipo().equalsIgnoreCase("romance")){
                System.out.println(series.toString());
            }
        }
    }

    public void mostrarDrama(){
        System.out.println("Categoria DRAMA");

        for (Serie series: listaSeries) {
            if (series.getTipo().equalsIgnoreCase("drama")){
                System.out.println(series.toString());
            }
        }
    }
    public void mostrarComedia(){
        System.out.println("Categoria COMEDIA");

        for (Serie series: listaSeries) {
            if (series.getTipo().equalsIgnoreCase("comedia")){
                System.out.println(series.toString());
            }
        }
    }
}
