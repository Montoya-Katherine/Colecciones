package entidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Service2Alumno {
    private  ArrayList<Alumno> listaAlumno;

    public Service2Alumno() {
        this.listaAlumno = new ArrayList<>();
    }
    public Alumno aniadirAlumno(String nombre, int nota1, int nota2, int nota3){
        ArrayList<Integer>notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
        Alumno alumno = new Alumno(nombre, notas);
        return alumno;
    }

    public ArrayList<Alumno> crearAlumno(){

        Scanner scanner= new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese DATOS de la lista de alumnos");

        String opcion= "";

        do {
            System.out.println("Ingrese nombre");
            String nombre = scanner.next();

            System.out.println("Ingrese la nota 1");
            int nota1 = scanner.nextInt();

            System.out.println("Ingrese la nota 2");
            int nota2 = scanner.nextInt();

            System.out.println("Ingrese la nota 3");
            int nota3 = scanner.nextInt();


            listaAlumno.add(aniadirAlumno(nombre, nota1, nota2,nota3));

            System.out.println("Presion 's' para agregar Alumno, de los comtrario presiones cualquier tecla");
            opcion=scanner.next();



        }while (opcion.equalsIgnoreCase("s"));

        return this.listaAlumno;
    }

    public void verListado(){
        System.out.println("Listado de Alumnos");
        for (Alumno alumnos: listaAlumno) {
            System.out.println(alumnos);
        }
    }
}
