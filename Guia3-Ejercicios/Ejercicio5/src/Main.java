import entidades.Service2Alumno;
import entidades.ServiceAlumno;

public class Main {
    public static void main (String [] args){
        // -Dinamico-
        Service2Alumno listaAlumno = new Service2Alumno();

        listaAlumno.crearAlumno();
        listaAlumno.verListado();
        /*
       - La se ingresa las variables por parametro -

        ServiceAlumno listaAlumno =new ServiceAlumno();
        listaAlumno.crearAlumno("Fer", 10, 9, 8);
        listaAlumno.crearAlumno("Maru", 10, 10, 10);
        listaAlumno.crearAlumno("Yanet", 9,7,10);

        listaAlumno.verListado();*/


    }
}
