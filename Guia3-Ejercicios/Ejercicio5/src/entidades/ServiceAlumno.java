package entidades;

import java.util.ArrayList;
import java.util.List;

public class ServiceAlumno {
    private List<Alumno> listaAlumno;

    public ServiceAlumno() {
        this.listaAlumno = new ArrayList<>();
    }

    public void crearAlumno(String nombre, int nota1,
                            int nota2, int nota3){
        Alumno alumno= new Alumno();
        List<Integer> notas = new ArrayList<>();
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);

        alumno.setNombre(nombre);
        alumno.setNotas(notas);

        aniadirAlumno(alumno);

    }

    public void aniadirAlumno(Alumno alumno){
        this.listaAlumno.add(alumno);
    }

    public void verListado(){
        System.out.println("Lista de alumnos");
        for (Alumno alumnos:listaAlumno) {
            System.out.println(alumnos);
        }
    }
}
